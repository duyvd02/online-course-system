/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author toila
 */
public class Course {
    private int courseID;
    private String courseName;
    private String description;
    private int createdBy;
    private Date createdDate;
    private boolean isPublished;
    private int subCategoryID;
    private int levelID;
    private BigDecimal price;
    private String imageURL;
    private int totalEnrolled;
    private Date lastUpdate;
    private String requirements;
    private boolean isCancelled;

    public Course() {
    }

    public Course(int courseID, String courseName, String description, int createdBy, Date createdDate, boolean isPublished, int subCategoryID, int levelID, BigDecimal price, String imageURL, int totalEnrolled, Date lastUpdate, String requirements, boolean isCancelled) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.description = description;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.isPublished = isPublished;
        this.subCategoryID = subCategoryID;
        this.levelID = levelID;
        this.price = price;
        this.imageURL = imageURL;
        this.totalEnrolled = totalEnrolled;
        this.lastUpdate = lastUpdate;
        this.requirements = requirements;
        this.isCancelled = isCancelled;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isIsPublished() {
        return isPublished;
    }

    public void setIsPublished(boolean isPublished) {
        this.isPublished = isPublished;
    }

    public int getSubCategoryID() {
        return subCategoryID;
    }

    public void setSubCategoryID(int subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getTotalEnrolled() {
        return totalEnrolled;
    }

    public void setTotalEnrolled(int totalEnrolled) {
        this.totalEnrolled = totalEnrolled;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public boolean isIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
}
