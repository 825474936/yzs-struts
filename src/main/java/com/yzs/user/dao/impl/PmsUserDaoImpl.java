package com.yzs.user.dao.impl;

import org.springframework.stereotype.Repository;

import com.yzs.common.core.dao.BaseDaoImpl;
import com.yzs.user.dao.PmsUserDao;
import com.yzs.user.entity.PmsUser;


/**
 * 用户表数据访问层接口实现类.
 * @author yzs
 *
 */
@Repository("pmsUserDao")
public class PmsUserDaoImpl extends BaseDaoImpl<PmsUser> implements PmsUserDao {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */

	public PmsUser findByUserNo(String userNo) {
		return super.getSqlSession().selectOne(getStatement("findByUserNo"), userNo);
	}

}
