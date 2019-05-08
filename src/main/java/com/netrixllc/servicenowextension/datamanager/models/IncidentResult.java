
package com.netrixllc.servicenowextension.datamanager.models;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

public class IncidentResult implements Parcelable {

    @SerializedName("promoted_by")
    @Expose
    private String promotedBy;
    @SerializedName("parent")
    @Expose
    private String parent;
    @SerializedName("caused_by")
    @Expose
    private String causedBy;
    @SerializedName("watch_list")
    @Expose
    private String watchList;
    @SerializedName("u_description_of_issue_device_affected")
    @Expose
    private String uDescriptionOfIssueDeviceAffected;
    @SerializedName("u_service_offering")
    @Expose
    private String uServiceOffering;
    @SerializedName("u_uid_of_users")
    @Expose
    private String uUidOfUsers;
    @SerializedName("upon_reject")
    @Expose
    private String uponReject;
    @SerializedName("sys_updated_on")
    @Expose
    private String sysUpdatedOn;
    @SerializedName("approval_history")
    @Expose
    private String approvalHistory;
    @SerializedName("skills")
    @Expose
    private String skills;
    @SerializedName("number")
    @Expose
    private String number;
    @SerializedName("u_maintenance_date")
    @Expose
    private String uMaintenanceDate;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("sys_created_by")
    @Expose
    private String sysCreatedBy;
    @SerializedName("u_recipient_users")
    @Expose
    private String uRecipientUsers;
    @SerializedName("knowledge")
    @Expose
    private String knowledge;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("u_recipient_groups")
    @Expose
    private String uRecipientGroups;
    @SerializedName("u_rma")
    @Expose
    private String uRma;
    @SerializedName("cmdb_ci")
    @Expose
    private String cmdbCi;
    @SerializedName("delivery_plan")
    @Expose
    private String deliveryPlan;
    @SerializedName("contract")
    @Expose
    private String contract;
    @SerializedName("impact")
    @Expose
    private String impact;
    @SerializedName("u_name_of_user")
    @Expose
    private String uNameOfUser;
    @SerializedName("active")
    @Expose
    private String active;
    @SerializedName("u_project")
    @Expose
    private String uProject;
    @SerializedName("work_notes_list")
    @Expose
    private String workNotesList;
    @SerializedName("u_sciencelogic_link")
    @Expose
    private String uSciencelogicLink;
    @SerializedName("priority")
    @Expose
    private String priority;
    @SerializedName("sys_domain_path")
    @Expose
    private String sysDomainPath;
    @SerializedName("business_duration")
    @Expose
    private String businessDuration;
    @SerializedName("group_list")
    @Expose
    private String groupList;
    @SerializedName("u_sciencelogic_rba_policy")
    @Expose
    private String uSciencelogicRbaPolicy;
    @SerializedName("approval_set")
    @Expose
    private String approvalSet;
    @SerializedName("u_floor_level")
    @Expose
    private String uFloorLevel;
    @SerializedName("major_incident_state")
    @Expose
    private String majorIncidentState;
    @SerializedName("u_po")
    @Expose
    private String uPo;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("correlation_display")
    @Expose
    private String correlationDisplay;
    @SerializedName("delivery_task")
    @Expose
    private String deliveryTask;
    @SerializedName("work_start")
    @Expose
    private String workStart;
    @SerializedName("trigger_rule")
    @Expose
    private String triggerRule;
    @SerializedName("u_subscribed_so")
    @Expose
    private String uSubscribedSo;
    @SerializedName("additional_assignee_list")
    @Expose
    private String additionalAssigneeList;
    @SerializedName("notify")
    @Expose
    private String notify;
    @SerializedName("service_offering")
    @Expose
    private String serviceOffering;
    @SerializedName("sys_class_name")
    @Expose
    private String sysClassName;
    @SerializedName("u_sciencelogic_event_time_last")
    @Expose
    private String uSciencelogicEventTimeLast;
    @SerializedName("closed_by")
    @Expose
    private String closedBy;
    @SerializedName("follow_up")
    @Expose
    private String followUp;
    @SerializedName("parent_incident")
    @Expose
    private String parentIncident;
    @SerializedName("u_nisource_ticket_number")
    @Expose
    private String uNisourceTicketNumber;
    @SerializedName("reopened_by")
    @Expose
    private String reopenedBy;
    @SerializedName("u_made_resolution_sla")
    @Expose
    private String uMadeResolutionSla;
    @SerializedName("u_hours_of_availability")
    @Expose
    private String uHoursOfAvailability;
    @SerializedName("reassignment_count")
    @Expose
    private String reassignmentCount;
    @SerializedName("assigned_to")
    @Expose
    private String assignedTo;
    @SerializedName("u_sciencelogic_user_ack")
    @Expose
    private String uSciencelogicUserAck;
    @SerializedName("sla_due")
    @Expose
    private String slaDue;
    @SerializedName("comments_and_work_notes")
    @Expose
    private String commentsAndWorkNotes;
    @SerializedName("u_client_ticket")
    @Expose
    private String uClientTicket;
    @SerializedName("escalation")
    @Expose
    private String escalation;
    @SerializedName("upon_approval")
    @Expose
    private String uponApproval;
    @SerializedName("u_maintenance_end_date")
    @Expose
    private String uMaintenanceEndDate;
    @SerializedName("correlation_id")
    @Expose
    private String correlationId;
    @SerializedName("u_calculated_initial_response_sla")
    @Expose
    private String uCalculatedInitialResponseSla;
    @SerializedName("u_sciencelogic_event_policy")
    @Expose
    private String uSciencelogicEventPolicy;
    @SerializedName("u_vendor_ticket_number")
    @Expose
    private String uVendorTicketNumber;
    @SerializedName("made_sla")
    @Expose
    private String madeSla;
    @SerializedName("promoted_on")
    @Expose
    private String promotedOn;
    @SerializedName("u_project_task")
    @Expose
    private String uProjectTask;
    @SerializedName("u_major_incident")
    @Expose
    private String uMajorIncident;
    @SerializedName("u_last_comment")
    @Expose
    private String uLastComment;
    @SerializedName("child_incidents")
    @Expose
    private String childIncidents;
    @SerializedName("u_sciencelogic_parent")
    @Expose
    private String uSciencelogicParent;
    @SerializedName("resolved_by")
    @Expose
    private String resolvedBy;
    @SerializedName("u_business_service")
    @Expose
    private String uBusinessService;
    @SerializedName("sys_updated_by")
    @Expose
    private String sysUpdatedBy;
    @SerializedName("u_sciencelogic_event_count")
    @Expose
    private String uSciencelogicEventCount;
    @SerializedName("opened_by")
    @Expose
    private OpenedBy openedBy;
    @SerializedName("user_input")
    @Expose
    private String userInput;
    @SerializedName("sys_created_on")
    @Expose
    private String sysCreatedOn;
    @SerializedName("sys_domain")
    @Expose
    private IncidentSysDomain incidentSysDomain;
    @SerializedName("actions_taken")
    @Expose
    private String actionsTaken;
    @SerializedName("u_strikes")
    @Expose
    private String uStrikes;
    @SerializedName("task_for")
    @Expose
    private String taskFor;
    @SerializedName("calendar_stc")
    @Expose
    private String calendarStc;
    @SerializedName("closed_at")
    @Expose
    private String closedAt;
    @SerializedName("u_creeticket")
    @Expose
    private String uCreeticket;
    @SerializedName("u_sciencelogic_event_time")
    @Expose
    private String uSciencelogicEventTime;
    @SerializedName("business_service")
    @Expose
    private String businessService;
    @SerializedName("u_client_update")
    @Expose
    private String uClientUpdate;
    @SerializedName("business_impact")
    @Expose
    private String businessImpact;
    @SerializedName("rfc")
    @Expose
    private String rfc;
    @SerializedName("time_worked")
    @Expose
    private String timeWorked;
    @SerializedName("expected_start")
    @Expose
    private String expectedStart;
    @SerializedName("u_room_number")
    @Expose
    private String uRoomNumber;
    @SerializedName("opened_at")
    @Expose
    private String openedAt;
    @SerializedName("u_next_activity")
    @Expose
    private String uNextActivity;
    @SerializedName("work_end")
    @Expose
    private String workEnd;
    @SerializedName("caller_id")
    @Expose
    private String callerId;
    @SerializedName("reopened_time")
    @Expose
    private String reopenedTime;
    @SerializedName("resolved_at")
    @Expose
    private String resolvedAt;
    @SerializedName("subcategory")
    @Expose
    private String subcategory;
    @SerializedName("u_sciencelogic_root")
    @Expose
    private String uSciencelogicRoot;
    @SerializedName("work_notes")
    @Expose
    private String workNotes;
    @SerializedName("u_calculated_update_sla")
    @Expose
    private String uCalculatedUpdateSla;
    @SerializedName("u_sciencelogic_event_id")
    @Expose
    private String uSciencelogicEventId;
    @SerializedName("u_next_steps")
    @Expose
    private String uNextSteps;
    @SerializedName("u_number_of_users_affected")
    @Expose
    private String uNumberOfUsersAffected;
    @SerializedName("close_code")
    @Expose
    private String closeCode;
    @SerializedName("assignment_group")
    @Expose
    private String assignmentGroup;
    @SerializedName("u_calculated_resolution_sla")
    @Expose
    private String uCalculatedResolutionSla;
    @SerializedName("business_stc")
    @Expose
    private String businessStc;
    @SerializedName("u_ticket_created")
    @Expose
    private String uTicketCreated;
    @SerializedName("cause")
    @Expose
    private String cause;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("calendar_duration")
    @Expose
    private String calendarDuration;
    @SerializedName("close_notes")
    @Expose
    private String closeNotes;
    @SerializedName("sys_id")
    @Expose
    private String sysId;
    @SerializedName("contact_type")
    @Expose
    private String contactType;
    @SerializedName("incident_state")
    @Expose
    private String incidentState;
    @SerializedName("urgency")
    @Expose
    private String urgency;
    @SerializedName("problem_id")
    @Expose
    private String problemId;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("activity_due")
    @Expose
    private String activityDue;
    @SerializedName("u_cree_inc")
    @Expose
    private String uCreeInc;
    @SerializedName("u_counter")
    @Expose
    private String uCounter;
    @SerializedName("severity")
    @Expose
    private String severity;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("u_affected_location")
    @Expose
    private String uAffectedLocation;
    @SerializedName("approval")
    @Expose
    private String approval;
    @SerializedName("u_sciencelogic_user_del")
    @Expose
    private String uSciencelogicUserDel;
    @SerializedName("due_date")
    @Expose
    private String dueDate;
    @SerializedName("sys_mod_count")
    @Expose
    private String sysModCount;
    @SerializedName("u_sciencelogic_region")
    @Expose
    private String uSciencelogicRegion;
    @SerializedName("u_end_user")
    @Expose
    private String uEndUser;
    @SerializedName("reopen_count")
    @Expose
    private String reopenCount;
    @SerializedName("sys_tags")
    @Expose
    private String sysTags;
    @SerializedName("u_made_update_sla")
    @Expose
    private String uMadeUpdateSla;
    @SerializedName("u_sciencelogic_component")
    @Expose
    private String uSciencelogicComponent;
    @SerializedName("u_contact_number")
    @Expose
    private String uContactNumber;
    @SerializedName("u_last_next_steps")
    @Expose
    private String uLastNextSteps;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("u_made_initial_response_sla")
    @Expose
    private String uMadeInitialResponseSla;

    public String getPromotedBy() {
        return promotedBy;
    }

    public void setPromotedBy(String promotedBy) {
        this.promotedBy = promotedBy;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCausedBy() {
        return causedBy;
    }

    public void setCausedBy(String causedBy) {
        this.causedBy = causedBy;
    }

    public String getWatchList() {
        return watchList;
    }

    public void setWatchList(String watchList) {
        this.watchList = watchList;
    }

    public String getUDescriptionOfIssueDeviceAffected() {
        return uDescriptionOfIssueDeviceAffected;
    }

    public void setUDescriptionOfIssueDeviceAffected(String uDescriptionOfIssueDeviceAffected) {
        this.uDescriptionOfIssueDeviceAffected = uDescriptionOfIssueDeviceAffected;
    }

    public String getUServiceOffering() {
        return uServiceOffering;
    }

    public void setUServiceOffering(String uServiceOffering) {
        this.uServiceOffering = uServiceOffering;
    }

    public String getUUidOfUsers() {
        return uUidOfUsers;
    }

    public void setUUidOfUsers(String uUidOfUsers) {
        this.uUidOfUsers = uUidOfUsers;
    }

    public String getUponReject() {
        return uponReject;
    }

    public void setUponReject(String uponReject) {
        this.uponReject = uponReject;
    }

    public String getSysUpdatedOn() {
        return sysUpdatedOn;
    }

    public void setSysUpdatedOn(String sysUpdatedOn) {
        this.sysUpdatedOn = sysUpdatedOn;
    }

    public String getApprovalHistory() {
        return approvalHistory;
    }

    public void setApprovalHistory(String approvalHistory) {
        this.approvalHistory = approvalHistory;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUMaintenanceDate() {
        return uMaintenanceDate;
    }

    public void setUMaintenanceDate(String uMaintenanceDate) {
        this.uMaintenanceDate = uMaintenanceDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSysCreatedBy() {
        return sysCreatedBy;
    }

    public void setSysCreatedBy(String sysCreatedBy) {
        this.sysCreatedBy = sysCreatedBy;
    }

    public String getURecipientUsers() {
        return uRecipientUsers;
    }

    public void setURecipientUsers(String uRecipientUsers) {
        this.uRecipientUsers = uRecipientUsers;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getURecipientGroups() {
        return uRecipientGroups;
    }

    public void setURecipientGroups(String uRecipientGroups) {
        this.uRecipientGroups = uRecipientGroups;
    }

    public String getURma() {
        return uRma;
    }

    public void setURma(String uRma) {
        this.uRma = uRma;
    }

    public String getCmdbCi() {
        return cmdbCi;
    }

    public void setCmdbCi(String cmdbCi) {
        this.cmdbCi = cmdbCi;
    }

    public String getDeliveryPlan() {
        return deliveryPlan;
    }

    public void setDeliveryPlan(String deliveryPlan) {
        this.deliveryPlan = deliveryPlan;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public String getUNameOfUser() {
        return uNameOfUser;
    }

    public void setUNameOfUser(String uNameOfUser) {
        this.uNameOfUser = uNameOfUser;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getUProject() {
        return uProject;
    }

    public void setUProject(String uProject) {
        this.uProject = uProject;
    }

    public String getWorkNotesList() {
        return workNotesList;
    }

    public void setWorkNotesList(String workNotesList) {
        this.workNotesList = workNotesList;
    }

    public String getUSciencelogicLink() {
        return uSciencelogicLink;
    }

    public void setUSciencelogicLink(String uSciencelogicLink) {
        this.uSciencelogicLink = uSciencelogicLink;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getSysDomainPath() {
        return sysDomainPath;
    }

    public void setSysDomainPath(String sysDomainPath) {
        this.sysDomainPath = sysDomainPath;
    }

    public String getBusinessDuration() {
        return businessDuration;
    }

    public void setBusinessDuration(String businessDuration) {
        this.businessDuration = businessDuration;
    }

    public String getGroupList() {
        return groupList;
    }

    public void setGroupList(String groupList) {
        this.groupList = groupList;
    }

    public String getUSciencelogicRbaPolicy() {
        return uSciencelogicRbaPolicy;
    }

    public void setUSciencelogicRbaPolicy(String uSciencelogicRbaPolicy) {
        this.uSciencelogicRbaPolicy = uSciencelogicRbaPolicy;
    }

    public String getApprovalSet() {
        return approvalSet;
    }

    public void setApprovalSet(String approvalSet) {
        this.approvalSet = approvalSet;
    }

    public String getUFloorLevel() {
        return uFloorLevel;
    }

    public void setUFloorLevel(String uFloorLevel) {
        this.uFloorLevel = uFloorLevel;
    }

    public String getMajorIncidentState() {
        return majorIncidentState;
    }

    public void setMajorIncidentState(String majorIncidentState) {
        this.majorIncidentState = majorIncidentState;
    }

    public String getUPo() {
        return uPo;
    }

    public void setUPo(String uPo) {
        this.uPo = uPo;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCorrelationDisplay() {
        return correlationDisplay;
    }

    public void setCorrelationDisplay(String correlationDisplay) {
        this.correlationDisplay = correlationDisplay;
    }

    public String getDeliveryTask() {
        return deliveryTask;
    }

    public void setDeliveryTask(String deliveryTask) {
        this.deliveryTask = deliveryTask;
    }

    public String getWorkStart() {
        return workStart;
    }

    public void setWorkStart(String workStart) {
        this.workStart = workStart;
    }

    public String getTriggerRule() {
        return triggerRule;
    }

    public void setTriggerRule(String triggerRule) {
        this.triggerRule = triggerRule;
    }

    public String getUSubscribedSo() {
        return uSubscribedSo;
    }

    public void setUSubscribedSo(String uSubscribedSo) {
        this.uSubscribedSo = uSubscribedSo;
    }

    public String getAdditionalAssigneeList() {
        return additionalAssigneeList;
    }

    public void setAdditionalAssigneeList(String additionalAssigneeList) {
        this.additionalAssigneeList = additionalAssigneeList;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public String getServiceOffering() {
        return serviceOffering;
    }

    public void setServiceOffering(String serviceOffering) {
        this.serviceOffering = serviceOffering;
    }

    public String getSysClassName() {
        return sysClassName;
    }

    public void setSysClassName(String sysClassName) {
        this.sysClassName = sysClassName;
    }

    public String getUSciencelogicEventTimeLast() {
        return uSciencelogicEventTimeLast;
    }

    public void setUSciencelogicEventTimeLast(String uSciencelogicEventTimeLast) {
        this.uSciencelogicEventTimeLast = uSciencelogicEventTimeLast;
    }

    public String getClosedBy() {
        return closedBy;
    }

    public void setClosedBy(String closedBy) {
        this.closedBy = closedBy;
    }

    public String getFollowUp() {
        return followUp;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    public String getParentIncident() {
        return parentIncident;
    }

    public void setParentIncident(String parentIncident) {
        this.parentIncident = parentIncident;
    }

    public String getUNisourceTicketNumber() {
        return uNisourceTicketNumber;
    }

    public void setUNisourceTicketNumber(String uNisourceTicketNumber) {
        this.uNisourceTicketNumber = uNisourceTicketNumber;
    }

    public String getReopenedBy() {
        return reopenedBy;
    }

    public void setReopenedBy(String reopenedBy) {
        this.reopenedBy = reopenedBy;
    }

    public String getUMadeResolutionSla() {
        return uMadeResolutionSla;
    }

    public void setUMadeResolutionSla(String uMadeResolutionSla) {
        this.uMadeResolutionSla = uMadeResolutionSla;
    }

    public String getUHoursOfAvailability() {
        return uHoursOfAvailability;
    }

    public void setUHoursOfAvailability(String uHoursOfAvailability) {
        this.uHoursOfAvailability = uHoursOfAvailability;
    }

    public String getReassignmentCount() {
        return reassignmentCount;
    }

    public void setReassignmentCount(String reassignmentCount) {
        this.reassignmentCount = reassignmentCount;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getUSciencelogicUserAck() {
        return uSciencelogicUserAck;
    }

    public void setUSciencelogicUserAck(String uSciencelogicUserAck) {
        this.uSciencelogicUserAck = uSciencelogicUserAck;
    }

    public String getSlaDue() {
        return slaDue;
    }

    public void setSlaDue(String slaDue) {
        this.slaDue = slaDue;
    }

    public String getCommentsAndWorkNotes() {
        return commentsAndWorkNotes;
    }

    public void setCommentsAndWorkNotes(String commentsAndWorkNotes) {
        this.commentsAndWorkNotes = commentsAndWorkNotes;
    }

    public String getUClientTicket() {
        return uClientTicket;
    }

    public void setUClientTicket(String uClientTicket) {
        this.uClientTicket = uClientTicket;
    }

    public String getEscalation() {
        return escalation;
    }

    public void setEscalation(String escalation) {
        this.escalation = escalation;
    }

    public String getUponApproval() {
        return uponApproval;
    }

    public void setUponApproval(String uponApproval) {
        this.uponApproval = uponApproval;
    }

    public String getUMaintenanceEndDate() {
        return uMaintenanceEndDate;
    }

    public void setUMaintenanceEndDate(String uMaintenanceEndDate) {
        this.uMaintenanceEndDate = uMaintenanceEndDate;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getUCalculatedInitialResponseSla() {
        return uCalculatedInitialResponseSla;
    }

    public void setUCalculatedInitialResponseSla(String uCalculatedInitialResponseSla) {
        this.uCalculatedInitialResponseSla = uCalculatedInitialResponseSla;
    }

    public String getUSciencelogicEventPolicy() {
        return uSciencelogicEventPolicy;
    }

    public void setUSciencelogicEventPolicy(String uSciencelogicEventPolicy) {
        this.uSciencelogicEventPolicy = uSciencelogicEventPolicy;
    }

    public String getUVendorTicketNumber() {
        return uVendorTicketNumber;
    }

    public void setUVendorTicketNumber(String uVendorTicketNumber) {
        this.uVendorTicketNumber = uVendorTicketNumber;
    }

    public String getMadeSla() {
        return madeSla;
    }

    public void setMadeSla(String madeSla) {
        this.madeSla = madeSla;
    }

    public String getPromotedOn() {
        return promotedOn;
    }

    public void setPromotedOn(String promotedOn) {
        this.promotedOn = promotedOn;
    }

    public String getUProjectTask() {
        return uProjectTask;
    }

    public void setUProjectTask(String uProjectTask) {
        this.uProjectTask = uProjectTask;
    }

    public String getUMajorIncident() {
        return uMajorIncident;
    }

    public void setUMajorIncident(String uMajorIncident) {
        this.uMajorIncident = uMajorIncident;
    }

    public String getULastComment() {
        return uLastComment;
    }

    public void setULastComment(String uLastComment) {
        this.uLastComment = uLastComment;
    }

    public String getChildIncidents() {
        return childIncidents;
    }

    public void setChildIncidents(String childIncidents) {
        this.childIncidents = childIncidents;
    }

    public String getUSciencelogicParent() {
        return uSciencelogicParent;
    }

    public void setUSciencelogicParent(String uSciencelogicParent) {
        this.uSciencelogicParent = uSciencelogicParent;
    }

    public String getResolvedBy() {
        return resolvedBy;
    }

    public void setResolvedBy(String resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public String getUBusinessService() {
        return uBusinessService;
    }

    public void setUBusinessService(String uBusinessService) {
        this.uBusinessService = uBusinessService;
    }

    public String getSysUpdatedBy() {
        return sysUpdatedBy;
    }

    public void setSysUpdatedBy(String sysUpdatedBy) {
        this.sysUpdatedBy = sysUpdatedBy;
    }

    public String getUSciencelogicEventCount() {
        return uSciencelogicEventCount;
    }

    public void setUSciencelogicEventCount(String uSciencelogicEventCount) {
        this.uSciencelogicEventCount = uSciencelogicEventCount;
    }

    public OpenedBy getOpenedBy() {
        return openedBy;
    }

    public void setOpenedBy(OpenedBy openedBy) {
        this.openedBy = openedBy;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getSysCreatedOn() {
        return sysCreatedOn;
    }

    public void setSysCreatedOn(String sysCreatedOn) {
        this.sysCreatedOn = sysCreatedOn;
    }

    public IncidentSysDomain getIncidentSysDomain() {
        return incidentSysDomain;
    }

    public void setIncidentSysDomain(IncidentSysDomain incidentSysDomain) {
        this.incidentSysDomain = incidentSysDomain;
    }

    public String getActionsTaken() {
        return actionsTaken;
    }

    public void setActionsTaken(String actionsTaken) {
        this.actionsTaken = actionsTaken;
    }

    public String getUStrikes() {
        return uStrikes;
    }

    public void setUStrikes(String uStrikes) {
        this.uStrikes = uStrikes;
    }

    public String getTaskFor() {
        return taskFor;
    }

    public void setTaskFor(String taskFor) {
        this.taskFor = taskFor;
    }

    public String getCalendarStc() {
        return calendarStc;
    }

    public void setCalendarStc(String calendarStc) {
        this.calendarStc = calendarStc;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public String getUCreeticket() {
        return uCreeticket;
    }

    public void setUCreeticket(String uCreeticket) {
        this.uCreeticket = uCreeticket;
    }

    public String getUSciencelogicEventTime() {
        return uSciencelogicEventTime;
    }

    public void setUSciencelogicEventTime(String uSciencelogicEventTime) {
        this.uSciencelogicEventTime = uSciencelogicEventTime;
    }

    public String getBusinessService() {
        return businessService;
    }

    public void setBusinessService(String businessService) {
        this.businessService = businessService;
    }

    public String getUClientUpdate() {
        return uClientUpdate;
    }

    public void setUClientUpdate(String uClientUpdate) {
        this.uClientUpdate = uClientUpdate;
    }

    public String getBusinessImpact() {
        return businessImpact;
    }

    public void setBusinessImpact(String businessImpact) {
        this.businessImpact = businessImpact;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(String timeWorked) {
        this.timeWorked = timeWorked;
    }

    public String getExpectedStart() {
        return expectedStart;
    }

    public void setExpectedStart(String expectedStart) {
        this.expectedStart = expectedStart;
    }

    public String getURoomNumber() {
        return uRoomNumber;
    }

    public void setURoomNumber(String uRoomNumber) {
        this.uRoomNumber = uRoomNumber;
    }

    public String getOpenedAt() {
        return openedAt;
    }

    public void setOpenedAt(String openedAt) {
        this.openedAt = openedAt;
    }

    public String getUNextActivity() {
        return uNextActivity;
    }

    public void setUNextActivity(String uNextActivity) {
        this.uNextActivity = uNextActivity;
    }

    public String getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(String workEnd) {
        this.workEnd = workEnd;
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId;
    }

    public String getReopenedTime() {
        return reopenedTime;
    }

    public void setReopenedTime(String reopenedTime) {
        this.reopenedTime = reopenedTime;
    }

    public String getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(String resolvedAt) {
        this.resolvedAt = resolvedAt;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(String subcategory) {
        this.subcategory = subcategory;
    }

    public String getUSciencelogicRoot() {
        return uSciencelogicRoot;
    }

    public void setUSciencelogicRoot(String uSciencelogicRoot) {
        this.uSciencelogicRoot = uSciencelogicRoot;
    }

    public String getWorkNotes() {
        return workNotes;
    }

    public void setWorkNotes(String workNotes) {
        this.workNotes = workNotes;
    }

    public String getUCalculatedUpdateSla() {
        return uCalculatedUpdateSla;
    }

    public void setUCalculatedUpdateSla(String uCalculatedUpdateSla) {
        this.uCalculatedUpdateSla = uCalculatedUpdateSla;
    }

    public String getUSciencelogicEventId() {
        return uSciencelogicEventId;
    }

    public void setUSciencelogicEventId(String uSciencelogicEventId) {
        this.uSciencelogicEventId = uSciencelogicEventId;
    }

    public String getUNextSteps() {
        return uNextSteps;
    }

    public void setUNextSteps(String uNextSteps) {
        this.uNextSteps = uNextSteps;
    }

    public String getUNumberOfUsersAffected() {
        return uNumberOfUsersAffected;
    }

    public void setUNumberOfUsersAffected(String uNumberOfUsersAffected) {
        this.uNumberOfUsersAffected = uNumberOfUsersAffected;
    }

    public String getCloseCode() {
        return closeCode;
    }

    public void setCloseCode(String closeCode) {
        this.closeCode = closeCode;
    }

    public String getAssignmentGroup() {
        return assignmentGroup;
    }

    public void setAssignmentGroup(String assignmentGroup) {
        this.assignmentGroup = assignmentGroup;
    }

    public String getUCalculatedResolutionSla() {
        return uCalculatedResolutionSla;
    }

    public void setUCalculatedResolutionSla(String uCalculatedResolutionSla) {
        this.uCalculatedResolutionSla = uCalculatedResolutionSla;
    }

    public String getBusinessStc() {
        return businessStc;
    }

    public void setBusinessStc(String businessStc) {
        this.businessStc = businessStc;
    }

    public String getUTicketCreated() {
        return uTicketCreated;
    }

    public void setUTicketCreated(String uTicketCreated) {
        this.uTicketCreated = uTicketCreated;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalendarDuration() {
        return calendarDuration;
    }

    public void setCalendarDuration(String calendarDuration) {
        this.calendarDuration = calendarDuration;
    }

    public String getCloseNotes() {
        return closeNotes;
    }

    public void setCloseNotes(String closeNotes) {
        this.closeNotes = closeNotes;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getIncidentState() {
        return incidentState;
    }

    public void setIncidentState(String incidentState) {
        this.incidentState = incidentState;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency;
    }

    public String getProblemId() {
        return problemId;
    }

    public void setProblemId(String problemId) {
        this.problemId = problemId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getActivityDue() {
        return activityDue;
    }

    public void setActivityDue(String activityDue) {
        this.activityDue = activityDue;
    }

    public String getUCreeInc() {
        return uCreeInc;
    }

    public void setUCreeInc(String uCreeInc) {
        this.uCreeInc = uCreeInc;
    }

    public String getUCounter() {
        return uCounter;
    }

    public void setUCounter(String uCounter) {
        this.uCounter = uCounter;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUAffectedLocation() {
        return uAffectedLocation;
    }

    public void setUAffectedLocation(String uAffectedLocation) {
        this.uAffectedLocation = uAffectedLocation;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    public String getUSciencelogicUserDel() {
        return uSciencelogicUserDel;
    }

    public void setUSciencelogicUserDel(String uSciencelogicUserDel) {
        this.uSciencelogicUserDel = uSciencelogicUserDel;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getSysModCount() {
        return sysModCount;
    }

    public void setSysModCount(String sysModCount) {
        this.sysModCount = sysModCount;
    }

    public String getUSciencelogicRegion() {
        return uSciencelogicRegion;
    }

    public void setUSciencelogicRegion(String uSciencelogicRegion) {
        this.uSciencelogicRegion = uSciencelogicRegion;
    }

    public String getUEndUser() {
        return uEndUser;
    }

    public void setUEndUser(String uEndUser) {
        this.uEndUser = uEndUser;
    }

    public String getReopenCount() {
        return reopenCount;
    }

    public void setReopenCount(String reopenCount) {
        this.reopenCount = reopenCount;
    }

    public String getSysTags() {
        return sysTags;
    }

    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    public String getUMadeUpdateSla() {
        return uMadeUpdateSla;
    }

    public void setUMadeUpdateSla(String uMadeUpdateSla) {
        this.uMadeUpdateSla = uMadeUpdateSla;
    }

    public String getUSciencelogicComponent() {
        return uSciencelogicComponent;
    }

    public void setUSciencelogicComponent(String uSciencelogicComponent) {
        this.uSciencelogicComponent = uSciencelogicComponent;
    }

    public String getUContactNumber() {
        return uContactNumber;
    }

    public void setUContactNumber(String uContactNumber) {
        this.uContactNumber = uContactNumber;
    }

    public String getULastNextSteps() {
        return uLastNextSteps;
    }

    public void setULastNextSteps(String uLastNextSteps) {
        this.uLastNextSteps = uLastNextSteps;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUMadeInitialResponseSla() {
        return uMadeInitialResponseSla;
    }

    public void setUMadeInitialResponseSla(String uMadeInitialResponseSla) {
        this.uMadeInitialResponseSla = uMadeInitialResponseSla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IncidentResult incidentResult = (IncidentResult) o;
        return Objects.equals(promotedBy, incidentResult.promotedBy) &&
                Objects.equals(parent, incidentResult.parent) &&
                Objects.equals(causedBy, incidentResult.causedBy) &&
                Objects.equals(watchList, incidentResult.watchList) &&
                Objects.equals(uDescriptionOfIssueDeviceAffected, incidentResult.uDescriptionOfIssueDeviceAffected) &&
                Objects.equals(uServiceOffering, incidentResult.uServiceOffering) &&
                Objects.equals(uUidOfUsers, incidentResult.uUidOfUsers) &&
                Objects.equals(uponReject, incidentResult.uponReject) &&
                Objects.equals(sysUpdatedOn, incidentResult.sysUpdatedOn) &&
                Objects.equals(approvalHistory, incidentResult.approvalHistory) &&
                Objects.equals(skills, incidentResult.skills) &&
                Objects.equals(number, incidentResult.number) &&
                Objects.equals(uMaintenanceDate, incidentResult.uMaintenanceDate) &&
                Objects.equals(state, incidentResult.state) &&
                Objects.equals(sysCreatedBy, incidentResult.sysCreatedBy) &&
                Objects.equals(uRecipientUsers, incidentResult.uRecipientUsers) &&
                Objects.equals(knowledge, incidentResult.knowledge) &&
                Objects.equals(order, incidentResult.order) &&
                Objects.equals(uRecipientGroups, incidentResult.uRecipientGroups) &&
                Objects.equals(uRma, incidentResult.uRma) &&
                Objects.equals(cmdbCi, incidentResult.cmdbCi) &&
                Objects.equals(deliveryPlan, incidentResult.deliveryPlan) &&
                Objects.equals(contract, incidentResult.contract) &&
                Objects.equals(impact, incidentResult.impact) &&
                Objects.equals(uNameOfUser, incidentResult.uNameOfUser) &&
                Objects.equals(active, incidentResult.active) &&
                Objects.equals(uProject, incidentResult.uProject) &&
                Objects.equals(workNotesList, incidentResult.workNotesList) &&
                Objects.equals(uSciencelogicLink, incidentResult.uSciencelogicLink) &&
                Objects.equals(priority, incidentResult.priority) &&
                Objects.equals(sysDomainPath, incidentResult.sysDomainPath) &&
                Objects.equals(businessDuration, incidentResult.businessDuration) &&
                Objects.equals(groupList, incidentResult.groupList) &&
                Objects.equals(uSciencelogicRbaPolicy, incidentResult.uSciencelogicRbaPolicy) &&
                Objects.equals(approvalSet, incidentResult.approvalSet) &&
                Objects.equals(uFloorLevel, incidentResult.uFloorLevel) &&
                Objects.equals(majorIncidentState, incidentResult.majorIncidentState) &&
                Objects.equals(uPo, incidentResult.uPo) &&
                Objects.equals(shortDescription, incidentResult.shortDescription) &&
                Objects.equals(correlationDisplay, incidentResult.correlationDisplay) &&
                Objects.equals(deliveryTask, incidentResult.deliveryTask) &&
                Objects.equals(workStart, incidentResult.workStart) &&
                Objects.equals(triggerRule, incidentResult.triggerRule) &&
                Objects.equals(uSubscribedSo, incidentResult.uSubscribedSo) &&
                Objects.equals(additionalAssigneeList, incidentResult.additionalAssigneeList) &&
                Objects.equals(notify, incidentResult.notify) &&
                Objects.equals(serviceOffering, incidentResult.serviceOffering) &&
                Objects.equals(sysClassName, incidentResult.sysClassName) &&
                Objects.equals(uSciencelogicEventTimeLast, incidentResult.uSciencelogicEventTimeLast) &&
                Objects.equals(closedBy, incidentResult.closedBy) &&
                Objects.equals(followUp, incidentResult.followUp) &&
                Objects.equals(parentIncident, incidentResult.parentIncident) &&
                Objects.equals(uNisourceTicketNumber, incidentResult.uNisourceTicketNumber) &&
                Objects.equals(reopenedBy, incidentResult.reopenedBy) &&
                Objects.equals(uMadeResolutionSla, incidentResult.uMadeResolutionSla) &&
                Objects.equals(uHoursOfAvailability, incidentResult.uHoursOfAvailability) &&
                Objects.equals(reassignmentCount, incidentResult.reassignmentCount) &&
                Objects.equals(assignedTo, incidentResult.assignedTo) &&
                Objects.equals(uSciencelogicUserAck, incidentResult.uSciencelogicUserAck) &&
                Objects.equals(slaDue, incidentResult.slaDue) &&
                Objects.equals(commentsAndWorkNotes, incidentResult.commentsAndWorkNotes) &&
                Objects.equals(uClientTicket, incidentResult.uClientTicket) &&
                Objects.equals(escalation, incidentResult.escalation) &&
                Objects.equals(uponApproval, incidentResult.uponApproval) &&
                Objects.equals(uMaintenanceEndDate, incidentResult.uMaintenanceEndDate) &&
                Objects.equals(correlationId, incidentResult.correlationId) &&
                Objects.equals(uCalculatedInitialResponseSla, incidentResult.uCalculatedInitialResponseSla) &&
                Objects.equals(uSciencelogicEventPolicy, incidentResult.uSciencelogicEventPolicy) &&
                Objects.equals(uVendorTicketNumber, incidentResult.uVendorTicketNumber) &&
                Objects.equals(madeSla, incidentResult.madeSla) &&
                Objects.equals(promotedOn, incidentResult.promotedOn) &&
                Objects.equals(uProjectTask, incidentResult.uProjectTask) &&
                Objects.equals(uMajorIncident, incidentResult.uMajorIncident) &&
                Objects.equals(uLastComment, incidentResult.uLastComment) &&
                Objects.equals(childIncidents, incidentResult.childIncidents) &&
                Objects.equals(uSciencelogicParent, incidentResult.uSciencelogicParent) &&
                Objects.equals(resolvedBy, incidentResult.resolvedBy) &&
                Objects.equals(uBusinessService, incidentResult.uBusinessService) &&
                Objects.equals(sysUpdatedBy, incidentResult.sysUpdatedBy) &&
                Objects.equals(uSciencelogicEventCount, incidentResult.uSciencelogicEventCount) &&
                Objects.equals(openedBy, incidentResult.openedBy) &&
                Objects.equals(userInput, incidentResult.userInput) &&
                Objects.equals(sysCreatedOn, incidentResult.sysCreatedOn) &&
                Objects.equals(incidentSysDomain, incidentResult.incidentSysDomain) &&
                Objects.equals(actionsTaken, incidentResult.actionsTaken) &&
                Objects.equals(uStrikes, incidentResult.uStrikes) &&
                Objects.equals(taskFor, incidentResult.taskFor) &&
                Objects.equals(calendarStc, incidentResult.calendarStc) &&
                Objects.equals(closedAt, incidentResult.closedAt) &&
                Objects.equals(uCreeticket, incidentResult.uCreeticket) &&
                Objects.equals(uSciencelogicEventTime, incidentResult.uSciencelogicEventTime) &&
                Objects.equals(businessService, incidentResult.businessService) &&
                Objects.equals(uClientUpdate, incidentResult.uClientUpdate) &&
                Objects.equals(businessImpact, incidentResult.businessImpact) &&
                Objects.equals(rfc, incidentResult.rfc) &&
                Objects.equals(timeWorked, incidentResult.timeWorked) &&
                Objects.equals(expectedStart, incidentResult.expectedStart) &&
                Objects.equals(uRoomNumber, incidentResult.uRoomNumber) &&
                Objects.equals(openedAt, incidentResult.openedAt) &&
                Objects.equals(uNextActivity, incidentResult.uNextActivity) &&
                Objects.equals(workEnd, incidentResult.workEnd) &&
                Objects.equals(callerId, incidentResult.callerId) &&
                Objects.equals(reopenedTime, incidentResult.reopenedTime) &&
                Objects.equals(resolvedAt, incidentResult.resolvedAt) &&
                Objects.equals(subcategory, incidentResult.subcategory) &&
                Objects.equals(uSciencelogicRoot, incidentResult.uSciencelogicRoot) &&
                Objects.equals(workNotes, incidentResult.workNotes) &&
                Objects.equals(uCalculatedUpdateSla, incidentResult.uCalculatedUpdateSla) &&
                Objects.equals(uSciencelogicEventId, incidentResult.uSciencelogicEventId) &&
                Objects.equals(uNextSteps, incidentResult.uNextSteps) &&
                Objects.equals(uNumberOfUsersAffected, incidentResult.uNumberOfUsersAffected) &&
                Objects.equals(closeCode, incidentResult.closeCode) &&
                Objects.equals(assignmentGroup, incidentResult.assignmentGroup) &&
                Objects.equals(uCalculatedResolutionSla, incidentResult.uCalculatedResolutionSla) &&
                Objects.equals(businessStc, incidentResult.businessStc) &&
                Objects.equals(uTicketCreated, incidentResult.uTicketCreated) &&
                Objects.equals(cause, incidentResult.cause) &&
                Objects.equals(description, incidentResult.description) &&
                Objects.equals(calendarDuration, incidentResult.calendarDuration) &&
                Objects.equals(closeNotes, incidentResult.closeNotes) &&
                Objects.equals(sysId, incidentResult.sysId) &&
                Objects.equals(contactType, incidentResult.contactType) &&
                Objects.equals(incidentState, incidentResult.incidentState) &&
                Objects.equals(urgency, incidentResult.urgency) &&
                Objects.equals(problemId, incidentResult.problemId) &&
                Objects.equals(company, incidentResult.company) &&
                Objects.equals(activityDue, incidentResult.activityDue) &&
                Objects.equals(uCreeInc, incidentResult.uCreeInc) &&
                Objects.equals(uCounter, incidentResult.uCounter) &&
                Objects.equals(severity, incidentResult.severity) &&
                Objects.equals(comments, incidentResult.comments) &&
                Objects.equals(uAffectedLocation, incidentResult.uAffectedLocation) &&
                Objects.equals(approval, incidentResult.approval) &&
                Objects.equals(uSciencelogicUserDel, incidentResult.uSciencelogicUserDel) &&
                Objects.equals(dueDate, incidentResult.dueDate) &&
                Objects.equals(sysModCount, incidentResult.sysModCount) &&
                Objects.equals(uSciencelogicRegion, incidentResult.uSciencelogicRegion) &&
                Objects.equals(uEndUser, incidentResult.uEndUser) &&
                Objects.equals(reopenCount, incidentResult.reopenCount) &&
                Objects.equals(sysTags, incidentResult.sysTags) &&
                Objects.equals(uMadeUpdateSla, incidentResult.uMadeUpdateSla) &&
                Objects.equals(uSciencelogicComponent, incidentResult.uSciencelogicComponent) &&
                Objects.equals(uContactNumber, incidentResult.uContactNumber) &&
                Objects.equals(uLastNextSteps, incidentResult.uLastNextSteps) &&
                Objects.equals(location, incidentResult.location) &&
                Objects.equals(category, incidentResult.category) &&
                Objects.equals(uMadeInitialResponseSla, incidentResult.uMadeInitialResponseSla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promotedBy, parent, causedBy, watchList, uDescriptionOfIssueDeviceAffected, uServiceOffering, uUidOfUsers, uponReject, sysUpdatedOn, approvalHistory, skills, number, uMaintenanceDate, state, sysCreatedBy, uRecipientUsers, knowledge, order, uRecipientGroups, uRma, cmdbCi, deliveryPlan, contract, impact, uNameOfUser, active, uProject, workNotesList, uSciencelogicLink, priority, sysDomainPath, businessDuration, groupList, uSciencelogicRbaPolicy, approvalSet, uFloorLevel, majorIncidentState, uPo, shortDescription, correlationDisplay, deliveryTask, workStart, triggerRule, uSubscribedSo, additionalAssigneeList, notify, serviceOffering, sysClassName, uSciencelogicEventTimeLast, closedBy, followUp, parentIncident, uNisourceTicketNumber, reopenedBy, uMadeResolutionSla, uHoursOfAvailability, reassignmentCount, assignedTo, uSciencelogicUserAck, slaDue, commentsAndWorkNotes, uClientTicket, escalation, uponApproval, uMaintenanceEndDate, correlationId, uCalculatedInitialResponseSla, uSciencelogicEventPolicy, uVendorTicketNumber, madeSla, promotedOn, uProjectTask, uMajorIncident, uLastComment, childIncidents, uSciencelogicParent, resolvedBy, uBusinessService, sysUpdatedBy, uSciencelogicEventCount, openedBy, userInput, sysCreatedOn, incidentSysDomain, actionsTaken, uStrikes, taskFor, calendarStc, closedAt, uCreeticket, uSciencelogicEventTime, businessService, uClientUpdate, businessImpact, rfc, timeWorked, expectedStart, uRoomNumber, openedAt, uNextActivity, workEnd, callerId, reopenedTime, resolvedAt, subcategory, uSciencelogicRoot, workNotes, uCalculatedUpdateSla, uSciencelogicEventId, uNextSteps, uNumberOfUsersAffected, closeCode, assignmentGroup, uCalculatedResolutionSla, businessStc, uTicketCreated, cause, description, calendarDuration, closeNotes, sysId, contactType, incidentState, urgency, problemId, company, activityDue, uCreeInc, uCounter, severity, comments, uAffectedLocation, approval, uSciencelogicUserDel, dueDate, sysModCount, uSciencelogicRegion, uEndUser, reopenCount, sysTags, uMadeUpdateSla, uSciencelogicComponent, uContactNumber, uLastNextSteps, location, category, uMadeInitialResponseSla);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.promotedBy);
        dest.writeString(this.parent);
        dest.writeString(this.causedBy);
        dest.writeString(this.watchList);
        dest.writeString(this.uDescriptionOfIssueDeviceAffected);
        dest.writeString(this.uServiceOffering);
        dest.writeString(this.uUidOfUsers);
        dest.writeString(this.uponReject);
        dest.writeString(this.sysUpdatedOn);
        dest.writeString(this.approvalHistory);
        dest.writeString(this.skills);
        dest.writeString(this.number);
        dest.writeString(this.uMaintenanceDate);
        dest.writeString(this.state);
        dest.writeString(this.sysCreatedBy);
        dest.writeString(this.uRecipientUsers);
        dest.writeString(this.knowledge);
        dest.writeString(this.order);
        dest.writeString(this.uRecipientGroups);
        dest.writeString(this.uRma);
        dest.writeString(this.cmdbCi);
        dest.writeString(this.deliveryPlan);
        dest.writeString(this.contract);
        dest.writeString(this.impact);
        dest.writeString(this.uNameOfUser);
        dest.writeString(this.active);
        dest.writeString(this.uProject);
        dest.writeString(this.workNotesList);
        dest.writeString(this.uSciencelogicLink);
        dest.writeString(this.priority);
        dest.writeString(this.sysDomainPath);
        dest.writeString(this.businessDuration);
        dest.writeString(this.groupList);
        dest.writeString(this.uSciencelogicRbaPolicy);
        dest.writeString(this.approvalSet);
        dest.writeString(this.uFloorLevel);
        dest.writeString(this.majorIncidentState);
        dest.writeString(this.uPo);
        dest.writeString(this.shortDescription);
        dest.writeString(this.correlationDisplay);
        dest.writeString(this.deliveryTask);
        dest.writeString(this.workStart);
        dest.writeString(this.triggerRule);
        dest.writeString(this.uSubscribedSo);
        dest.writeString(this.additionalAssigneeList);
        dest.writeString(this.notify);
        dest.writeString(this.serviceOffering);
        dest.writeString(this.sysClassName);
        dest.writeString(this.uSciencelogicEventTimeLast);
        dest.writeString(this.closedBy);
        dest.writeString(this.followUp);
        dest.writeString(this.parentIncident);
        dest.writeString(this.uNisourceTicketNumber);
        dest.writeString(this.reopenedBy);
        dest.writeString(this.uMadeResolutionSla);
        dest.writeString(this.uHoursOfAvailability);
        dest.writeString(this.reassignmentCount);
        dest.writeString(this.assignedTo);
        dest.writeString(this.uSciencelogicUserAck);
        dest.writeString(this.slaDue);
        dest.writeString(this.commentsAndWorkNotes);
        dest.writeString(this.uClientTicket);
        dest.writeString(this.escalation);
        dest.writeString(this.uponApproval);
        dest.writeString(this.uMaintenanceEndDate);
        dest.writeString(this.correlationId);
        dest.writeString(this.uCalculatedInitialResponseSla);
        dest.writeString(this.uSciencelogicEventPolicy);
        dest.writeString(this.uVendorTicketNumber);
        dest.writeString(this.madeSla);
        dest.writeString(this.promotedOn);
        dest.writeString(this.uProjectTask);
        dest.writeString(this.uMajorIncident);
        dest.writeString(this.uLastComment);
        dest.writeString(this.childIncidents);
        dest.writeString(this.uSciencelogicParent);
        dest.writeString(this.resolvedBy);
        dest.writeString(this.uBusinessService);
        dest.writeString(this.sysUpdatedBy);
        dest.writeString(this.uSciencelogicEventCount);
        dest.writeParcelable(this.openedBy, flags);
        dest.writeString(this.userInput);
        dest.writeString(this.sysCreatedOn);
        dest.writeParcelable(this.incidentSysDomain, flags);
        dest.writeString(this.actionsTaken);
        dest.writeString(this.uStrikes);
        dest.writeString(this.taskFor);
        dest.writeString(this.calendarStc);
        dest.writeString(this.closedAt);
        dest.writeString(this.uCreeticket);
        dest.writeString(this.uSciencelogicEventTime);
        dest.writeString(this.businessService);
        dest.writeString(this.uClientUpdate);
        dest.writeString(this.businessImpact);
        dest.writeString(this.rfc);
        dest.writeString(this.timeWorked);
        dest.writeString(this.expectedStart);
        dest.writeString(this.uRoomNumber);
        dest.writeString(this.openedAt);
        dest.writeString(this.uNextActivity);
        dest.writeString(this.workEnd);
        dest.writeString(this.callerId);
        dest.writeString(this.reopenedTime);
        dest.writeString(this.resolvedAt);
        dest.writeString(this.subcategory);
        dest.writeString(this.uSciencelogicRoot);
        dest.writeString(this.workNotes);
        dest.writeString(this.uCalculatedUpdateSla);
        dest.writeString(this.uSciencelogicEventId);
        dest.writeString(this.uNextSteps);
        dest.writeString(this.uNumberOfUsersAffected);
        dest.writeString(this.closeCode);
        dest.writeString(this.assignmentGroup);
        dest.writeString(this.uCalculatedResolutionSla);
        dest.writeString(this.businessStc);
        dest.writeString(this.uTicketCreated);
        dest.writeString(this.cause);
        dest.writeString(this.description);
        dest.writeString(this.calendarDuration);
        dest.writeString(this.closeNotes);
        dest.writeString(this.sysId);
        dest.writeString(this.contactType);
        dest.writeString(this.incidentState);
        dest.writeString(this.urgency);
        dest.writeString(this.problemId);
        dest.writeString(this.company);
        dest.writeString(this.activityDue);
        dest.writeString(this.uCreeInc);
        dest.writeString(this.uCounter);
        dest.writeString(this.severity);
        dest.writeString(this.comments);
        dest.writeString(this.uAffectedLocation);
        dest.writeString(this.approval);
        dest.writeString(this.uSciencelogicUserDel);
        dest.writeString(this.dueDate);
        dest.writeString(this.sysModCount);
        dest.writeString(this.uSciencelogicRegion);
        dest.writeString(this.uEndUser);
        dest.writeString(this.reopenCount);
        dest.writeString(this.sysTags);
        dest.writeString(this.uMadeUpdateSla);
        dest.writeString(this.uSciencelogicComponent);
        dest.writeString(this.uContactNumber);
        dest.writeString(this.uLastNextSteps);
        dest.writeString(this.location);
        dest.writeString(this.category);
        dest.writeString(this.uMadeInitialResponseSla);
    }

    public IncidentResult() {
    }

    protected IncidentResult(Parcel in) {
        this.promotedBy = in.readString();
        this.parent = in.readString();
        this.causedBy = in.readString();
        this.watchList = in.readString();
        this.uDescriptionOfIssueDeviceAffected = in.readString();
        this.uServiceOffering = in.readString();
        this.uUidOfUsers = in.readString();
        this.uponReject = in.readString();
        this.sysUpdatedOn = in.readString();
        this.approvalHistory = in.readString();
        this.skills = in.readString();
        this.number = in.readString();
        this.uMaintenanceDate = in.readString();
        this.state = in.readString();
        this.sysCreatedBy = in.readString();
        this.uRecipientUsers = in.readString();
        this.knowledge = in.readString();
        this.order = in.readString();
        this.uRecipientGroups = in.readString();
        this.uRma = in.readString();
        this.cmdbCi = in.readString();
        this.deliveryPlan = in.readString();
        this.contract = in.readString();
        this.impact = in.readString();
        this.uNameOfUser = in.readString();
        this.active = in.readString();
        this.uProject = in.readString();
        this.workNotesList = in.readString();
        this.uSciencelogicLink = in.readString();
        this.priority = in.readString();
        this.sysDomainPath = in.readString();
        this.businessDuration = in.readString();
        this.groupList = in.readString();
        this.uSciencelogicRbaPolicy = in.readString();
        this.approvalSet = in.readString();
        this.uFloorLevel = in.readString();
        this.majorIncidentState = in.readString();
        this.uPo = in.readString();
        this.shortDescription = in.readString();
        this.correlationDisplay = in.readString();
        this.deliveryTask = in.readString();
        this.workStart = in.readString();
        this.triggerRule = in.readString();
        this.uSubscribedSo = in.readString();
        this.additionalAssigneeList = in.readString();
        this.notify = in.readString();
        this.serviceOffering = in.readString();
        this.sysClassName = in.readString();
        this.uSciencelogicEventTimeLast = in.readString();
        this.closedBy = in.readString();
        this.followUp = in.readString();
        this.parentIncident = in.readString();
        this.uNisourceTicketNumber = in.readString();
        this.reopenedBy = in.readString();
        this.uMadeResolutionSla = in.readString();
        this.uHoursOfAvailability = in.readString();
        this.reassignmentCount = in.readString();
        this.assignedTo = in.readString();
        this.uSciencelogicUserAck = in.readString();
        this.slaDue = in.readString();
        this.commentsAndWorkNotes = in.readString();
        this.uClientTicket = in.readString();
        this.escalation = in.readString();
        this.uponApproval = in.readString();
        this.uMaintenanceEndDate = in.readString();
        this.correlationId = in.readString();
        this.uCalculatedInitialResponseSla = in.readString();
        this.uSciencelogicEventPolicy = in.readString();
        this.uVendorTicketNumber = in.readString();
        this.madeSla = in.readString();
        this.promotedOn = in.readString();
        this.uProjectTask = in.readString();
        this.uMajorIncident = in.readString();
        this.uLastComment = in.readString();
        this.childIncidents = in.readString();
        this.uSciencelogicParent = in.readString();
        this.resolvedBy = in.readString();
        this.uBusinessService = in.readString();
        this.sysUpdatedBy = in.readString();
        this.uSciencelogicEventCount = in.readString();
        this.openedBy = in.readParcelable(OpenedBy.class.getClassLoader());
        this.userInput = in.readString();
        this.sysCreatedOn = in.readString();
        this.incidentSysDomain = in.readParcelable(IncidentSysDomain.class.getClassLoader());
        this.actionsTaken = in.readString();
        this.uStrikes = in.readString();
        this.taskFor = in.readString();
        this.calendarStc = in.readString();
        this.closedAt = in.readString();
        this.uCreeticket = in.readString();
        this.uSciencelogicEventTime = in.readString();
        this.businessService = in.readString();
        this.uClientUpdate = in.readString();
        this.businessImpact = in.readString();
        this.rfc = in.readString();
        this.timeWorked = in.readString();
        this.expectedStart = in.readString();
        this.uRoomNumber = in.readString();
        this.openedAt = in.readString();
        this.uNextActivity = in.readString();
        this.workEnd = in.readString();
        this.callerId = in.readString();
        this.reopenedTime = in.readString();
        this.resolvedAt = in.readString();
        this.subcategory = in.readString();
        this.uSciencelogicRoot = in.readString();
        this.workNotes = in.readString();
        this.uCalculatedUpdateSla = in.readString();
        this.uSciencelogicEventId = in.readString();
        this.uNextSteps = in.readString();
        this.uNumberOfUsersAffected = in.readString();
        this.closeCode = in.readString();
        this.assignmentGroup = in.readString();
        this.uCalculatedResolutionSla = in.readString();
        this.businessStc = in.readString();
        this.uTicketCreated = in.readString();
        this.cause = in.readString();
        this.description = in.readString();
        this.calendarDuration = in.readString();
        this.closeNotes = in.readString();
        this.sysId = in.readString();
        this.contactType = in.readString();
        this.incidentState = in.readString();
        this.urgency = in.readString();
        this.problemId = in.readString();
        this.company = in.readString();
        this.activityDue = in.readString();
        this.uCreeInc = in.readString();
        this.uCounter = in.readString();
        this.severity = in.readString();
        this.comments = in.readString();
        this.uAffectedLocation = in.readString();
        this.approval = in.readString();
        this.uSciencelogicUserDel = in.readString();
        this.dueDate = in.readString();
        this.sysModCount = in.readString();
        this.uSciencelogicRegion = in.readString();
        this.uEndUser = in.readString();
        this.reopenCount = in.readString();
        this.sysTags = in.readString();
        this.uMadeUpdateSla = in.readString();
        this.uSciencelogicComponent = in.readString();
        this.uContactNumber = in.readString();
        this.uLastNextSteps = in.readString();
        this.location = in.readString();
        this.category = in.readString();
        this.uMadeInitialResponseSla = in.readString();
    }

    public static final Parcelable.Creator<IncidentResult> CREATOR = new Parcelable.Creator<IncidentResult>() {
        @Override
        public IncidentResult createFromParcel(Parcel source) {
            return new IncidentResult(source);
        }

        @Override
        public IncidentResult[] newArray(int size) {
            return new IncidentResult[size];
        }
    };
}
