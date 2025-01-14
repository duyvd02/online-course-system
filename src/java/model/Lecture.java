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
public class Lecture {
    private int lectureID;
    private int sectionID;
    private String lectureName;
    private String lectureURL;
    private Date createdDate;
    private String lectureDescription;

    public Lecture() {
    }

    public Lecture(int lectureID, int sectionID, String lectureName, String lectureURL, Date createdDate, String lectureDescription) {
        this.lectureID = lectureID;
        this.sectionID = sectionID;
        this.lectureName = lectureName;
        this.lectureURL = lectureURL;
        this.createdDate = createdDate;
        this.lectureDescription = lectureDescription;
    }

    public int getLectureID() {
        return lectureID;
    }

    public void setLectureID(int lectureID) {
        this.lectureID = lectureID;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getLectureURL() {
        return lectureURL;
    }

    public void setLectureURL(String lectureURL) {
        this.lectureURL = lectureURL;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getLectureDescription() {
        return lectureDescription;
    }

    public void setLectureDescription(String lectureDescription) {
        this.lectureDescription = lectureDescription;
    }
    
    
}
