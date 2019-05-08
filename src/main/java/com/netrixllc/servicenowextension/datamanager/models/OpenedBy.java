
package com.netrixllc.servicenowextension.datamanager.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class OpenedBy implements Parcelable {

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenedBy openedBy = (OpenedBy) o;
        return Objects.equals(link, openedBy.link) &&
                Objects.equals(value, openedBy.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, value);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.link);
        dest.writeString(this.value);
    }

    public OpenedBy() {
    }

    protected OpenedBy(Parcel in) {
        this.link = in.readString();
        this.value = in.readString();
    }

    public static final Parcelable.Creator<OpenedBy> CREATOR = new Parcelable.Creator<OpenedBy>() {
        @Override
        public OpenedBy createFromParcel(Parcel source) {
            return new OpenedBy(source);
        }

        @Override
        public OpenedBy[] newArray(int size) {
            return new OpenedBy[size];
        }
    };
}
