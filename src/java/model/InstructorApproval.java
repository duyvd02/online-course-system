/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author toila
 */
public class InstructorApproval {
    private int approvalID;
    private int instructorID;
    private boolean isApproved;
    private Date requestDate;
    private Date approvalDate;

    public InstructorApproval() {
    }

    public InstructorApproval(int approvalID, int instructorID, boolean isApproved, Date requestDate, Date approvalDate) {
        this.approvalID = approvalID;
        this.instructorID = instructorID;
        this.isApproved = isApproved;
        this.requestDate = requestDate;
        this.approvalDate = approvalDate;
    }

    public int getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(int approvalID) {
        this.approvalID = approvalID;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public boolean isIsApproved() {
        return isApproved;
    }

    public void setIsApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }
    
    
}
