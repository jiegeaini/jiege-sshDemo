package com.ssh.dao;

import com.ssh.entity.User;

/**
 * @title �û�����Ҫ���������ݿ���
 * @author jiege
 *
 */
public interface UserDao {
	/**
	 * @title �ж��û��Ƿ����
	 * @param user
	 * @return
	 */
	boolean loginBl(User user);
}
