package com.brainforrent;

class Assignment {
    private String title;
    private String dueDate;
    private String status;
    private String description;

    public Assignment(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = "PENDING";
        this.description = "";
    }

    public Assignment(String title, String dueDate, String status, String description) {
        this.title = title;
        this.dueDate = dueDate;
        this.status = status;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
