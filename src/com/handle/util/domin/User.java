package com.handle.util.domin;

import java.util.Date;

public class User {

    private int userId;

    private String userName;

    private String passWord;

    private UserType userType;

    private int userTypeId;

    private String emailAddress;

    private Date rigisterDate;

    private Date lastAccessDate;

    private int sexId;

    private Sex sex;

    private String vCard;

    public int getUserId() {

        return userId;
    }

    public void setUserId(int userId) {

        this.userId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getPassWord() {

        return passWord;
    }

    public void setPassWord(String passWord) {

        this.passWord = passWord;
    }

    public UserType getUserType() {

        return userType;
    }

    public void setUserType(UserType userType) {

        this.userType = userType;
    }

    public int getUserTypeId() {

        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {

        this.userTypeId = userTypeId;
    }

    public String getEmailAddress() {

        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public Date getRigisterDate() {

        return rigisterDate;
    }

    public void setRigisterDate(Date rigisterDate) {

        this.rigisterDate = rigisterDate;
    }

    public Date getLastAccessDate() {

        return lastAccessDate;
    }

    public void setLastAccessDate(Date lastAccessDate) {

        this.lastAccessDate = lastAccessDate;
    }

    public int getSexId() {

        return sexId;
    }

    public void setSexId(int sexId) {

        this.sexId = sexId;
    }

    public Sex getSex() {

        return sex;
    }

    public void setSex(Sex sex) {

        this.sex = sex;
    }

    public String getvCard() {

        return vCard;
    }

    public void setvCard(String vCard) {

        this.vCard = vCard;
    }

}
