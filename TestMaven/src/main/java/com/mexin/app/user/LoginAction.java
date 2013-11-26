package com.mexin.app.user;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;
import com.test.evan.HelloWorldServlet;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(LoginAction.class);
	
	private String username;    
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

	private String password;
	
	@Override
	public void validate() {
		if(this.getUsername() == null || "".equals(this.getUsername().trim())) {
			this.addFieldError("username", "username.error");
		}
		if(null==this.getPassword()||"".equals(this.getPassword().trim())){    
            this.addFieldError("password", "password error");//添加错误信息    
        }    
	}
	
	public String execute() throws Exception {
		if("Evan".equals(this.getUsername().trim())&&"password".equals(this.getPassword().trim())){
			logger.info("The entered username and password are correct!");
            return SUCCESS;       
        }    
        else{    
            this.addFieldError("username", "username or password error"); 
            logger.info("The entered username or password is wrong!");
            return INPUT;        
        }    

	}
}
