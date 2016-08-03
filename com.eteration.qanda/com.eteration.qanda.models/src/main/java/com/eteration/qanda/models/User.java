package com.eteration.qanda.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer userId;
	
	@Column(name="useremail")
	private String 	userEmail;
	
	@Column(name="username")
	private String 	userName;
	
	@Column(name="userpassword")
	private String 	userPassword;
	
	@Column(name="userpoints")
	private Integer userPoints;
	
	@Column(name="usertype")
	private String	userType;
	
	public User() {
		super();
	}
	public User(Integer userId, String userEmail, String userName, String userPassword, Integer userPoints, String userType) {
		super();
		this.userId = userId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPoints = userPoints;
		this.userType = userType;
	}
	public Integer getUserId(){
		return userId;
	}
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Integer getUserPoints() {
		return userPoints;
	}
	public void setUserPoints(Integer userPoints) {
		this.userPoints = userPoints;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
