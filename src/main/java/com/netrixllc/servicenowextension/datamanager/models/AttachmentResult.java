
package com.netrixllc.servicenowextension.datamanager.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AttachmentResult {

    @SerializedName("size_bytes")
    @Expose
    private String sizeBytes;
    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("sys_mod_count")
    @Expose
    private String sysModCount;
    @SerializedName("sys_updated_on")
    @Expose
    private String sysUpdatedOn;
    @SerializedName("sys_domain_path")
    @Expose
    private String sysDomainPath;
    @SerializedName("sys_tags")
    @Expose
    private String sysTags;
    @SerializedName("table_name")
    @Expose
    private String tableName;
    @SerializedName("sys_id")
    @Expose
    private String sysId;
    @SerializedName("sys_updated_by")
    @Expose
    private String sysUpdatedBy;
    @SerializedName("download_link")
    @Expose
    private String downloadLink;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("sys_created_on")
    @Expose
    private String sysCreatedOn;
    @SerializedName("size_compressed")
    @Expose
    private String sizeCompressed;
    @SerializedName("sys_domain")
    @Expose
    private AttachmentSysDomain attachmentSysDomain;
    @SerializedName("compressed")
    @Expose
    private String compressed;
    @SerializedName("table_sys_id")
    @Expose
    private String tableSysId;
    @SerializedName("chunk_size_bytes")
    @Expose
    private String chunkSizeBytes;
    @SerializedName("sys_created_by")
    @Expose
    private String sysCreatedBy;

    public String getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(String sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getSysModCount() {
        return sysModCount;
    }

    public void setSysModCount(String sysModCount) {
        this.sysModCount = sysModCount;
    }

    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(String sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public String getSysDomainPath() {
        return sysDomainPath;
    }

    public void setSysDomainPath(String sysDomainPath) {
        this.sysDomainPath = sysDomainPath;
    }

    public String getSysTags() {
        return sysTags;
    }

    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(String sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public String getSizeCompressed() {
        return sizeCompressed;
    }

    public void setSizeCompressed(String sizeCompressed) {
        this.sizeCompressed = sizeCompressed;
    }

    public AttachmentSysDomain getAttachmentSysDomain() {
        return attachmentSysDomain;
    }

    public void setAttachmentSysDomain(AttachmentSysDomain attachmentSysDomain) {
        this.attachmentSysDomain = attachmentSysDomain;
    }

    public String getCompressed() {
        return compressed;
    }

    public void setCompressed(String compressed) {
        this.compressed = compressed;
    }

    public String getTableSysId() {
        return tableSysId;
    }

    public void setTableSysId(String tableSysId) {
        this.tableSysId = tableSysId;
    }

    public String getChunkSizeBytes() {
        return chunkSizeBytes;
    }

    public void setChunkSizeBytes(String chunkSizeBytes) {
        this.chunkSizeBytes = chunkSizeBytes;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

}
