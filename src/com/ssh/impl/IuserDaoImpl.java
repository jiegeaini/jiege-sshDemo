package com.ssh.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;

//delete(Object entity): 删除指定持久化实例。
//
//deleteAll(Collection entities): 删除集合内全部持久化类实例。
//
//find(String queryString): 根据 HQL 查询字符串来返回实例集合。
//
//findByNamedQuery(String queryName): 根据命名查询返回实例集合。
//
//load或get(Classentity Class,Serializable id): 根据主键加载特定持久化类的实例。
//
//save(Object entity): 保存新的实例。
//
//saveOrUpdate(Object entity): 根据实例状态，选择保存或者更新。
//
//update(Object entity): 更新实例的状态，要求entity 是持久状态。
//
//setMaxResults(intmax Results): 设置分页的大小。


/**
 * @title 用户接口的实现类
 * @author jiege
 *
 */
public class IuserDaoImpl extends HibernateTemplate implements UserDao{

	/**
	 * @title 判断用户是否存在
	 * @param user
	 * @return
	 */
	@Override
	public boolean loginBl(User user) {
		String hql = "from User u where u.username = ? and u.password = ?";
		List<User> list = find(hql,new 
				String[]{user.getUsername(), user.getPassword()});
		Iterator<User> iterator = list.iterator();
		if (iterator.hasNext()) {
			return true;
		}
		return false;
	}

}
