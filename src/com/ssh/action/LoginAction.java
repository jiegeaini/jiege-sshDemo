package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @title ���������û���¼������
 * @author jiege
 *
 */
import com.ssh.entity.User;
import com.ssh.service.UserService;
/**
 * @title �������յ�¼��Ϣ��action
 * @author jiege
 *
 */
public class LoginAction extends ActionSupport{
	//ע��user����
	private User user;
	//ע��service��
	private UserService service;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @title ��¼���� ���ж��û��Ƿ����
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
