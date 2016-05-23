package com.yzs.user.base;

import com.yzs.common.page.web.constant.SessionConstant;
import com.yzs.common.page.web.struts.Struts2ActionSupport;
import com.yzs.user.entity.PmsUser;


/**
 * Web系统权限模块基础支撑Action
 * @author yzs
 *
 */
@SuppressWarnings("serial")
public class BaseAction extends Struts2ActionSupport implements UserLoginedAware {

	/**
	 * 取出当前登录用户对象
	 */
	@Override
	public PmsUser getLoginedUser() {
		PmsUser user = (PmsUser) this.getSessionMap().get(SessionConstant.USER_SESSION_KEY);
		return user;
	}

}
