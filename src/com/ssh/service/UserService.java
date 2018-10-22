package com.ssh.service;

import org.junit.Test;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;

public class UserService {
	//ע��ʵ��dao
	private UserDao dao;
	/**
	 * @title �����ж��û��Ƿ����
	 * @param user
	 * @return
	 */
	public boolean isLogin(User user) {
		return dao.loginBl(user);
	}
	
	


	/**
	 * @return the dao
	 */
	public UserDao getDao() {
		return dao;
	}




	/**
	 * @param dao the dao to set
	 */
	public void setDao(UserDao dao) {
		this.dao = dao;
	}


	
}
