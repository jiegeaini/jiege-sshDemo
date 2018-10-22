package com.ssh.dao;

import com.ssh.entity.User;

/**
 * @title 用户所需要操作的数据库类
 * @author jiege
 *
 */
public interface UserDao {
	/**
	 * @title 判断用户是否存在
	 * @param user
	 * @return
	 */
	boolean loginBl(User user);
}
