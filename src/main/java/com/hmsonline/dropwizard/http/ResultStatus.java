package com.hmsonline.dropwizard.http;

public class ResultStatus {
	
	public ResultStatus(int code){
		this.statusCode = code;
	}
	public ResultStatus(int code, String message){
		this.statusCode = code;
		this.statusMsg = message;
	}	
	
	private int statusCode;
	private String statusMsg;

	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMsg() {
		return statusMsg;
	}
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	
}
