
package com.netrixllc.servicenowextension.datamanager.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAttachmentResponse {

    @SerializedName("attachmentResult")
    @Expose
    private AttachmentResult attachmentResult;

    public AttachmentResult getAttachmentResult() {
        return attachmentResult;
    }

    public void setAttachmentResult(AttachmentResult attachmentResult) {
        this.attachmentResult = attachmentResult;
    }

}
