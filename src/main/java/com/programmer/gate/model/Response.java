package com.programmer.gate.model;

import java.io.Serializable;

public class Response implements Serializable{
	private String status;
	private Object object;
	
	
	public Response() {
		super();
	}

	public Response(String status, Object object) {
		super();
		this.status = status;
		this.object = object;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	
	
}