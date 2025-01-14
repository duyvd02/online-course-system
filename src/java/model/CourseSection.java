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
public class CourseSection {
    private int sectionID;
    private String sectionDescription;
    private int courseID;
    private String sectionName;
    private int sectionOrder;
    private Date createdDate;

    public CourseSection() {
    }

    public CourseSection(int sectionID, String sectionDescription, int courseID, String sectionName, int sectionOrder, Date createdDate) {
        this.sectionID = sectionID;
        this.sectionDescription = sectionDescription;
        this.courseID = courseID;
        this.sectionName = sectionName;
        this.sectionOrder = sectionOrder;
        this.createdDate = createdDate;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public String getSectionDescription() {
        return sectionDescription;
    }

    public void setSectionDescription(String sectionDescription) {
        this.sectionDescription = sectionDescription;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public int getSectionOrder() {
        return sectionOrder;
    }

    public void setSectionOrder(int sectionOrder) {
        this.sectionOrder = sectionOrder;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    
}
