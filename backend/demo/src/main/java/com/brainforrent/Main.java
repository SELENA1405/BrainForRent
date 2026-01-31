package com.brainforrent;

/**
 * Project: AcademiaSync
 * Description: A role-based academic management system.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to AcademiaSync System ===\n");

        // 1. SIMULATE AUTHENTICATION & USER CREATION
        // Sarah is an Organizer (High Privileges)
        Organizer organizer = new Organizer("U001", "Sarah", "sarah@university.edu");

        // John is a Member (View-Only Privileges)
        Member member = new Member("M001", "John", "john@university.edu");

        // 2. GROUP MANAGEMENT
        // Create a study group and add the member
        Group csGroup = new Group("G101", "Computer Science 101", organizer);
        csGroup.addMember(member);
        System.out.println("Group '" + csGroup.getGroupName() + "' created with Sarah as Organizer.");

        // 3. ACADEMIC TRACKING (Action by Organizer)
        System.out.println("\n--- Organizer Actions ---");
        Assignment oopProject = new Assignment("A01", "OOP Final Project", "CS101", "2026-05-20");
        organizer.addAssignment(csGroup, oopProject);

        // 4. NOTIFICATIONS (Automated System Logic)
        // System.out.println("\n--- System Notifications ---");
        // NotificationService.sendAlert(member, "New assignment added: " +
        // oopProject.getTitle());

        // 5. ACADEMIC AWARENESS (Action by Member)
        // System.out.println("\n--- Member View ---");
        // member.viewAssignments(csGroup);

        // 6. SIMULATED PEER PAYMENT (Optional Motivation Mechanism)
        // System.out.println("\n--- Peer-to-Peer Compensation ---");
        // Payment compensation = new Payment("P999", 5.00, member, organizer);
        // PaymentService.processPayment(compensation);

        System.out.println("\n=== System Simulation Complete ===");
    }
}