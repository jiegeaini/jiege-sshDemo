package com.ssh.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.ssh.dao.UserDao;
import com.ssh.entity.User;

//delete(Object entity): ɾ��ָ���־û�ʵ����
//
//deleteAll(Collection entities): ɾ��������ȫ���־û���ʵ����
//
//find(String queryString): ���� HQL ��ѯ�ַ���������ʵ�����ϡ�
//
//findByNamedQuery(String queryName): ����������ѯ����ʵ�����ϡ�
//
//load��get(Classentity Class,Serializable id): �������������ض��־û����ʵ����
//
//save(Object entity): �����µ�ʵ����
//
//saveOrUpdate(Object entity): ����ʵ��״̬��ѡ�񱣴���߸��¡�
//
//update(Object entity): ����ʵ����״̬��Ҫ��entity �ǳ־�״̬��
//
//setMaxResults(intmax Results): ���÷�ҳ�Ĵ�С��


/**
 * @title �û��ӿڵ�ʵ����
 * @author jiege
 *
 */
public class IuserDaoImpl extends HibernateTemplate implements UserDao{

	/**
	 * @title �ж��û��Ƿ����
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
