package com.eteration.qanda.models;

public class Answer extends Post {
	Boolean status; // true if it is correct answer

	public Answer() {
		super();
	}
	public Answer(Boolean status) {
		super();
		this.status = status;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
