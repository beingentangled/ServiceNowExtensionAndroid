
package com.netrixllc.servicenowextension.datamanager.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class GetIncidentResponse implements Parcelable {

    @SerializedName("result")
    @Expose
    private IncidentResult incidentResult;

    public IncidentResult getIncidentResult() {
        return incidentResult;
    }

    public void setIncidentResult(IncidentResult incidentResult) {
        this.incidentResult = incidentResult;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetIncidentResponse that = (GetIncidentResponse) o;
        return Objects.equals(incidentResult, that.incidentResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentResult);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.incidentResult, flags);
    }

    public GetIncidentResponse() {
    }

    protected GetIncidentResponse(Parcel in) {
        this.incidentResult = in.readParcelable(IncidentResult.class.getClassLoader());
    }

    public static final Parcelable.Creator<GetIncidentResponse> CREATOR = new Parcelable.Creator<GetIncidentResponse>() {
        @Override
        public GetIncidentResponse createFromParcel(Parcel source) {
            return new GetIncidentResponse(source);
        }

        @Override
        public GetIncidentResponse[] newArray(int size) {
            return new GetIncidentResponse[size];
        }
    };
}
