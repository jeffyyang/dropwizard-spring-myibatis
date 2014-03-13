package com.hmsonline.dropwizard.http;

public class ResponseResult {
	
	public static ResultStatus RESULT_OK =  new ResultStatus(0,"成功");
	public static ResultStatus RESULT_4001 =  new ResultStatus(4001,"权限不足,拒绝请求");
	public static ResultStatus RESULT_4002 =  new ResultStatus(4002,"请求参数错误");
	public static ResultStatus RESULT_4005 =  new ResultStatus(4005,"服务器未知错误");	
	
	private String version;
	
	private ResultStatus status; 
	private Object data;
	
	private ResponseResult(ResultStatus status){
		version = "1.0";
		this.setStatus(status);
	}
	private ResponseResult(int code , String message){
		version = "1.0";
		ResultStatus status = new ResultStatus(code,message);
		this.setStatus(status);
	}	
	public final static ResponseResult createResult(ResultStatus status){
		ResponseResult result = new ResponseResult(status);
		return result;
	}
	public final static ResponseResult createResult(int statusCode, String statusMsg){
		ResponseResult result = new ResponseResult(statusCode,statusMsg);
		return result;
	}	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	public ResultStatus getStatus() {
		return status;
	}
	public void setStatus(ResultStatus status) {
		this.status = status;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}	
	
}
