package com.yzs.user.dao;

import com.yzs.common.core.dao.BaseDao;
import com.yzs.user.entity.PmsUser;


/**
 * 用户表数据访问层接口
 * @author yzs
 *
 */
public interface PmsUserDao extends BaseDao<PmsUser> {

	/**
	 * 根据用户登录名获取用户信息.
	 * 
	 * @param loginName
	 *            .
	 * @return user .
	 */
	PmsUser findByUserNo(String userNo);

}
