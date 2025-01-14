/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author toila
 */
public class SubCategory {
    private int subCategoryID;
    private int categoryID;
    private String subCategoryName;

    public SubCategory() {
    }

    public SubCategory(int subCategoryID, int categoryID, String subCategoryName) {
        this.subCategoryID = subCategoryID;
        this.categoryID = categoryID;
        this.subCategoryName = subCategoryName;
    }

    public int getSubCategoryID() {
        return subCategoryID;
    }

    public void setSubCategoryID(int subCategoryID) {
        this.subCategoryID = subCategoryID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }
    
    
}
