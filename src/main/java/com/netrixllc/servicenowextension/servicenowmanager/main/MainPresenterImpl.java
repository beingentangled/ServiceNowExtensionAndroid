package com.netrixllc.servicenowextension.servicenowmanager.main;

import android.app.Activity;

import com.netrixllc.servicenowextension.datamanager.models.GetAttachmentResponse;
import com.netrixllc.servicenowextension.datamanager.models.GetIncidentResponse;
import com.netrixllc.servicenowextension.servicenowmanager.ServiceNowManager;

import java.io.File;

/**
 * Created by binoy
 */

public class MainPresenterImpl implements MainContract.presenter, MainContract.GetServiceNowInteract.OnFinishedListener {

    private MainContract.ServiceNowInterface serviceNowInterface;
    private MainContract.GetServiceNowInteract getServiceNowInteract;
    private Activity mContext;
    private String mUserName;
    private String mPassword;

    public MainPresenterImpl(ServiceNowManager serviceNowManager, GetServiceNowInteractImpl getServiceNowInteract, String userName, String password, Activity context) {
        this.serviceNowInterface = serviceNowManager;
        this.getServiceNowInteract = getServiceNowInteract;
        this.mContext = context;
        this.mUserName = userName;
        this.mPassword = password;
    }

    @Override
    public void createIncident(String mDescription, String mComments) {
        getServiceNowInteract.createNewIncident(this,mUserName, mPassword, mContext, mDescription, mComments);
    }

    @Override
    public void uploadFile(String sysId, File mIncidentFile) {
        getServiceNowInteract.uploadIncident(this,mUserName, mPassword, sysId,mContext, mIncidentFile);
    }


    @Override
    public void onFinishedIncidentResultFetching(GetIncidentResponse incidentResponse) {
        if (serviceNowInterface != null) {
            serviceNowInterface.showIncidentResult(incidentResponse);
        }
    }

    @Override
    public void onFinishedUploadResultFetching(GetAttachmentResponse attachmentResponse) {
        if (serviceNowInterface != null) {
            serviceNowInterface.showUploadResult(attachmentResponse);
        }
    }

    @Override
    public void onFailure(Throwable t) {
        if (serviceNowInterface != null) {
            serviceNowInterface.onResponseFailure(t);
        }
    }
}
