package com.fh.entity;

import java.util.Date;

public class Application {
 private int id;
 private int applicationID;
 private String name;
 private String type;
 private int staffID;
 private Date startDate;
 private Date endDate;
 private int state;
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getStaffID() {
	return staffID;
}
public void setStaffID(int staffID) {
	this.staffID = staffID;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}
public int getState() {
	return state;
}
public void setState(int state) {
	this.state = state;
}
 
}
