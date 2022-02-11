package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Bug {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bugid;
	private String emailid;
	private String owner;
	private String priority;
	private String status;
	private String projectname;
	private String createddate;
	private String completeddate;
	private String description;
	
	@OneToOne(mappedBy ="bug")
	Project project;
	public Integer getBugid() {
		return bugid;
	}
	public void setBugid(Integer bugid) {
		this.bugid = bugid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getCreateddate() {
		return createddate;
	}
	public void setCreateddate(String createddate) {
		this.createddate = createddate;
	}
	public String getCompleteddate() {
		return completeddate;
	}
	public void setCompleteddate(String completeddate) {
		this.completeddate = completeddate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}