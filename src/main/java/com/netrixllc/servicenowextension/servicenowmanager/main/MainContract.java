package com.netrixllc.servicenowextension.servicenowmanager.main;

import android.app.Activity;
import android.content.Context;

import com.netrixllc.servicenowextension.datamanager.models.GetAttachmentResponse;
import com.netrixllc.servicenowextension.datamanager.models.GetIncidentResponse;

import java.io.File;

/**
 * Created by binoy.
 */

public interface MainContract {

    /**
     * Call when user interact with the view
     */
    interface presenter {

        void createIncident(String mDescription, String mComments);

        void uploadFile(String sysId, File mIncidentFile);
    }

    /**
     * showIncidentResult() helps to pass the incident results to the Manager
     * showUploadResult() helps to show the incident attachment upload to the manager
     * onResponseFailure() A Failure handler
     */
    interface ServiceNowInterface {

        void showIncidentResult(GetIncidentResponse incidentResponse);

        void showUploadResult(GetAttachmentResponse attachmentResponse);

        void onResponseFailure(Throwable throwable);

    }

    /**
     * Intractors are classes built for fetching data from your database, web services, or any other data source.
     **/
    interface GetServiceNowInteract {

        void uploadIncident(OnFinishedListener onFinishedListener, String mUserName, String mPassword, String sysId, Activity mContext, File mIncidentFile);

        void createNewIncident(OnFinishedListener onFinishedListener, String mUserName, String mPassword, Context mCOntext, String mDescription, String mComments);

        interface OnFinishedListener {
            void onFinishedIncidentResultFetching(GetIncidentResponse incidentResponse);

            void onFinishedUploadResultFetching(GetAttachmentResponse attachmentResponse);

            void onFailure(Throwable t);
        }
    }
}
