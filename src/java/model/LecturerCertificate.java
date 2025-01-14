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
public class LecturerCertificate {
    private int certificateID;
    private int approvalID;
    private String certificateURL;
    private Date uploadDate;

    public LecturerCertificate() {
    }

    public LecturerCertificate(int certificateID, int approvalID, String certificateURL, Date uploadDate) {
        this.certificateID = certificateID;
        this.approvalID = approvalID;
        this.certificateURL = certificateURL;
        this.uploadDate = uploadDate;
    }

    public int getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(int certificateID) {
        this.certificateID = certificateID;
    }

    public int getApprovalID() {
        return approvalID;
    }

    public void setApprovalID(int approvalID) {
        this.approvalID = approvalID;
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
