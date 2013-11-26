package com.mexin.app.user;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception {
		System.out.println("hero world");
		return SUCCESS;
	}

}
