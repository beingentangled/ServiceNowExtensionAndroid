package com.netrixllc.servicenowextension.datamanager;

import com.netrixllc.servicenowextension.datamanager.models.GetAttachmentResponse;
import com.netrixllc.servicenowextension.datamanager.models.GetIncidentResponse;

import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;

public interface ServiceNowApi {
    /**
     * Param Auth Key consist of the username and password
     * Param data consist of the description and comment
     * @param authkey
     * @param data
     * @return
     */
    @POST("/api/now/v1/table/incident")
    Call<GetIncidentResponse> postIncident(@Header("Authorization") String authkey, @Body RequestBody data);

    /**
     * Param Auth Key consist of the username and password
     * Param PartMap consist of the required sysId to upload
     * Param file consist of the Image file to be uploaded.
     * @param authkey
     * @param partMap
     * @param file
     * @return
     */
    @POST("/api/now/attachment/upload")
    @Multipart
    Call<GetAttachmentResponse> postIncidentAttachment(@Header("Authorization") String authkey,
                                                       @PartMap() Map<String, RequestBody> partMap,
                                                       @Part MultipartBody.Part file);

}
