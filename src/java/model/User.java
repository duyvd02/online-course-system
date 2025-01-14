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
public class User {
    private int userID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private Date dob;
    private String email;
    private int roleID;
    private Date registrationDate;
    private boolean isActive;
    private String avatar;
    private String bio;
    private String storedSalt;
    private int providerID;
    private int walletID;
    private String resetOTP;

    public User() {
    }

    public User(int userID, String username, String password, String firstName, String lastName, String phone, Date dob, String email, int roleID, Date registrationDate, boolean isActive, String avatar, String bio, String storedSalt, int providerID, int walletID, String resetOTP) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dob = dob;
        this.email = email;
        this.roleID = roleID;
        this.registrationDate = registrationDate;
        this.isActive = isActive;
        this.avatar = avatar;
        this.bio = bio;
        this.storedSalt = storedSalt;
        this.providerID = providerID;
        this.walletID = walletID;
        this.resetOTP = resetOTP;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getStoredSalt() {
        return storedSalt;
    }

    public void setStoredSalt(String storedSalt) {
        this.storedSalt = storedSalt;
    }

    public int getProviderID() {
        return providerID;
    }

    public void setProviderID(int providerID) {
        this.providerID = providerID;
    }

    public int getWalletID() {
        return walletID;
    }

    public void setWalletID(int walletID) {
        this.walletID = walletID;
    }

    public String getResetOTP() {
        return resetOTP;
    }

    public void setResetOTP(String resetOTP) {
        this.resetOTP = resetOTP;
    }
    
    
}
