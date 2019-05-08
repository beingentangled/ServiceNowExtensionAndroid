package com.netrixllc.servicenowextension.servicenowmanager;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

import com.netrixllc.servicenowextension.datamanager.models.GetAttachmentResponse;
import com.netrixllc.servicenowextension.datamanager.models.GetIncidentResponse;
import com.netrixllc.servicenowextension.servicenowmanager.main.GetServiceNowInteractImpl;
import com.netrixllc.servicenowextension.servicenowmanager.main.MainContract;
import com.netrixllc.servicenowextension.servicenowmanager.main.MainPresenterImpl;
import com.netrixllc.servicenowextension.utils.FileChooser;

import java.io.File;

public class ServiceNowManager implements MainContract.ServiceNowInterface, FileChooser.FileSelectedListener {


    private MainContract.presenter presenter;
    private File mIncidentFile;
    private Activity mActivity;

    public ServiceNowManager(String mUserName, String mPassword, Activity activity) {
        presenter = new MainPresenterImpl(this, new GetServiceNowInteractImpl(), mUserName, mPassword, activity);
        mActivity = activity;
    }

    public void createIncident(String mDescription, String mComments, File incidentFile) {
        presenter.createIncident(mDescription, mComments);
    }

    @Override
    public void showIncidentResult(GetIncidentResponse incidentResponse) {
        presenter.uploadFile(incidentResponse.getIncidentResult().getSysId(), mIncidentFile);
    }

    @Override
    public void showUploadResult(GetAttachmentResponse attachmentResponse) {
        Toast.makeText(mActivity, "Upload Success", Toast.LENGTH_SHORT).show();
        mIncidentFile = null;
    }

    @Override
    public void onResponseFailure(Throwable throwable) {
        Log.d(ServiceNowManager.class.getSimpleName(), "onResponseFailure: " + throwable.toString());
    }

    public void chooseFile(Activity activity) {
        FileChooser chooser = new FileChooser(activity);
        chooser.setFileListener(this);
        chooser.showDialog();
    }

    @Override
    public void fileSelected(File file) {
        mIncidentFile = file;
    }

    public boolean isFileSelected() {
        return mIncidentFile != null;
    }
}
