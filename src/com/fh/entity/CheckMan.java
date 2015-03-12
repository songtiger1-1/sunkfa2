package com.fh.entity;

import java.util.Date;

public class CheckMan {
 private int id;
 private int applicationID;
 private int staffID;
 private int state;
 private Date checkDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getApplicationID() {
	return applicationID;
}
public void setApplicationID(int applicationID) {
	this.applicationID = applicationID;
}
public int getStaffID() {
	return staffID;
}
public void setStaffID(int staffID) {
	this.staffID = staffID;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
public Date getCheckDate() {
	return checkDate;
}
public void setCheckDate(Date checkDate) {
	this.checkDate = checkDate;
}
 
}
