package com.brainforrent;

import java.util.*;

public class Group {
    private String groupId;
    private String groupName;
    private String description;
    private Organizer organizer;
    private List<Member> members;
    private List<Assignment> assignments;
    private Date createdDate;

    public Group(String groupId, String groupName, String description) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.description = description;
        this.members = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.createdDate = new Date();
    }

    public Group(String groupId, String groupName, Organizer organizer) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.organizer = organizer;
        this.description = ""; // default empty description
        this.members = new ArrayList<>();
        this.assignments = new ArrayList<>();
        this.createdDate = new Date();
    }

    // Getter and Setter for groupId (this fixes the "not used" warning)
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    // Getters and Setters for other fields
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    // Methods to manage members
    public void addMember(Member member) {
        if (member != null && !members.contains(member)) {
            members.add(member);
        }
    }

    public void removeMember(Member member) {
        members.remove(member);
    }

    public int getMemberCount() {
        return members.size();
    }

    // Methods to manage assignments
    public void addAssignment(Assignment assignment) {
        if (assignment != null && !assignments.contains(assignment)) {
            assignments.add(assignment);
        }
    }

    public void removeAssignment(Assignment assignment) {
        assignments.remove(assignment);
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public int getAssignmentCount() {
        return assignments.size();
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", memberCount=" + members.size() +
                ", assignmentCount=" + assignments.size() +
                ", createdDate=" + createdDate +
                '}';
    }
}
