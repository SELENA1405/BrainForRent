package com.brainforrent;

public class Organizer extends User {
    public Organizer(String userId, String name, String email) {
        super(userId, name, email);
        this.role = "ORGANIZER";
    }

    public void addAssignment(Group group, Assignment assignment) {
        group.addAssignment(assignment);
        System.out.println("Organizer " + name + " added assignment: " + assignment.getTitle());
    }
}