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
public class CourseCertificate {
    private int certificateID;
    private int learnerID;
    private int instructorID;
    private int courseID;
    private String certificateURL;
    private Date uploadDate;

    public CourseCertificate() {
    }

    public CourseCertificate(int certificateID, int learnerID, int instructorID, int courseID, String certificateURL, Date uploadDate) {
        this.certificateID = certificateID;
        this.learnerID = learnerID;
        this.instructorID = instructorID;
        this.courseID = courseID;
        this.certificateURL = certificateURL;
        this.uploadDate = uploadDate;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public int getLearnerID() {
        return learnerID;
    }

    public void setLearnerID(int learnerID) {
        this.learnerID = learnerID;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCertificateURL() {
        return certificateURL;
    }

    public void setCertificateURL(String certificateURL) {
        this.certificateURL = certificateURL;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
    
    
}
