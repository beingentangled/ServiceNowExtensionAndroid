package com.netrixllc.servicenowextension.servicenowmanager.main;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;

import androidx.collection.ArrayMap;

import com.netrixllc.servicenowextension.datamanager.ServiceNowApi;
import com.netrixllc.servicenowextension.datamanager.ServiceApiManager;
import com.netrixllc.servicenowextension.datamanager.models.GetAttachmentResponse;
import com.netrixllc.servicenowextension.datamanager.models.GetIncidentResponse;

import org.json.JSONObject;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by binoy.
 */

public class GetServiceNowInteractImpl implements MainContract.GetServiceNowInteract {


    public static String getAuthToken(String mUserName, String mPassword) {
        byte[] data = new byte[0];
        try {
            data = (mUserName + ":" + mPassword).getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "Basic " + Base64.encodeToString(data, Base64.NO_WRAP);
    }

    @Override
    public void uploadIncident(final OnFinishedListener onFinishedListener, String mUserName, String mPassword, String sysId, Activity mContext, File mIncidentFile) {

        /** Create handle for the RetrofitInstance interface*/
        ServiceNowApi service = ServiceApiManager.serviceNowApi().create(ServiceNowApi.class);
        RequestBody requestBody = RequestBody.create(MediaType.parse("multipart/form-data"), mIncidentFile);
        MultipartBody.Part imageFileBody = MultipartBody.Part.createFormData("Request Payload", mIncidentFile.getName(), requestBody);

// create a map of data to pass along
        RequestBody incident = createPartFromString("incident");
        RequestBody table_sys_id = createPartFromString(sysId);

        HashMap<String, RequestBody> map = new HashMap<>();
        map.put("table_name", incident);
        map.put("table_sys_id", table_sys_id);

        /** Call the method with parameter in the interface to get the notice data*/
        Call<GetAttachmentResponse> call = service.postIncidentAttachment(getAuthToken(mUserName, mPassword), map, imageFileBody);

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<GetAttachmentResponse>() {
            @Override
            public void onResponse(Call<GetAttachmentResponse> call, Response<GetAttachmentResponse> response) {
                onFinishedListener.onFinishedUploadResultFetching(response.body());
            }

            @Override
            public void onFailure(Call<GetAttachmentResponse> call, Throwable t) {

            }
        });
    }

    private RequestBody createPartFromString(String s) {
        return RequestBody.create(
                okhttp3.MultipartBody.FORM, s);
    }

    @Override
    public void createNewIncident(final OnFinishedListener onFinishedListener, final String mUserName, final String mPassword, final Context mContext, String mDescription, String mComments) {

        /** Create handle for the RetrofitInstance interface*/
        ServiceNowApi service = ServiceApiManager.serviceNowApi().create(ServiceNowApi.class);

        Map<String, String> jsonParams = new ArrayMap<>();
//put something inside the map, could be null
        jsonParams.put("short_description", mDescription);
        jsonParams.put("comments", mComments);

        RequestBody body = RequestBody.create(okhttp3.MediaType.parse("application/json; charset=utf-8"), (new JSONObject(jsonParams)).toString());


        /** Call the method with parameter in the interface to post the incident data*/
        Call<GetIncidentResponse> call = service.postIncident(getAuthToken(mUserName, mPassword), body);

        /**Log the URL called*/
        Log.wtf("URL Called", call.request().url() + "");

        call.enqueue(new Callback<GetIncidentResponse>() {
            @Override
            public void onResponse(Call<GetIncidentResponse> call, Response<GetIncidentResponse> response) {
                onFinishedListener.onFinishedIncidentResultFetching(response.body());

            }

            @Override
            public void onFailure(Call<GetIncidentResponse> call, Throwable t) {
                onFinishedListener.onFailure(t);
            }
        });

    }

}
