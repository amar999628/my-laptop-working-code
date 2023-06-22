package com.nkxgen.spring.orm.model;

public class TaskCountDto {
    private int projectId;
    private int taskCount;
    private int tasksCompleted;
    private double hoursWorked;

    public TaskCountDto(int projectId, int taskCount, int tasksCompleted, double hoursWorked) {
        this.projectId = projectId;
        this.taskCount = taskCount;
        this.tasksCompleted = tasksCompleted;
        this.hoursWorked = hoursWorked;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getTaskCount() {
        return taskCount;
    }

    public void setTaskCount(int taskCount) {
        this.taskCount = taskCount;
    }

    public int getTasksCompleted() {
        return tasksCompleted;
    }

    public void setTasksCompleted(int tasksCompleted) {
        this.tasksCompleted = tasksCompleted;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
