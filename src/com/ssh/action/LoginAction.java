package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @title 用来接收用户登录的请求
 * @author jiege
 *
 */
import com.ssh.entity.User;
import com.ssh.service.UserService;
/**
 * @title 用来接收登录信息的action
 * @author jiege
 *
 */
public class LoginAction extends ActionSupport{
	//注入user对象
	private User user;
	//注入service类
	private UserService service;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @title 登录方法 来判断用户是否存在
	 * @return
	 */
	public String login() {
		if (service.isLogin(user)) {
			return "good";
		}
		return "error";
		
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the service
	 */
	public UserService getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(UserService service) {
		this.service = service;
	}
	
	
}
