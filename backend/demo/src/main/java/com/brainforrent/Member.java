package com.brainforrent;

class Member extends User {
    public Member(String userId, String name, String email) {
        super(userId, name, email);
        this.role = "MEMBER";
    }

    public void viewAssignments(Group group) {
        System.out.println("Viewing assignments for group: " + group.getGroupName());
        for (Assignment a : group.getAssignments()) {
            System.out.println("- " + a.getTitle() + " (Due: " + a.getDueDate() + ")");
        }
    }
}
