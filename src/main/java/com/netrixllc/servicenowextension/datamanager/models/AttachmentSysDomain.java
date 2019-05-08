
package com.netrixllc.servicenowextension.datamanager.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttachmentSysDomain {

    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("value")
    @Expose
    private String value;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
