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
public class SectionComment {
    private int commentID;
    private int sectionID;
    private int userID;
    private String commentText;
    private int parentCommentID;
    private Date commentDate;
    private int replyToUserID;

    public SectionComment() {
    }

    public SectionComment(int commentID, int sectionID, int userID, String commentText, int parentCommentID, Date commentDate, int replyToUserID) {
        this.commentID = commentID;
        this.sectionID = sectionID;
        this.userID = userID;
        this.commentText = commentText;
        this.parentCommentID = parentCommentID;
        this.commentDate = commentDate;
        this.replyToUserID = replyToUserID;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getSectionID() {
        return sectionID;
    }

    public void setSectionID(int sectionID) {
        this.sectionID = sectionID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getParentCommentID() {
        return parentCommentID;
    }

    public void setParentCommentID(int parentCommentID) {
        this.parentCommentID = parentCommentID;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public int getReplyToUserID() {
        return replyToUserID;
    }

    public void setReplyToUserID(int replyToUserID) {
        this.replyToUserID = replyToUserID;
    }
    
    
}
