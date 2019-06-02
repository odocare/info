/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *

 *
 * 版权所有，侵权必究！
 */

package com.beige.manage.modules.app.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.beige.manage.modules.app.entity.UserEntity;
import com.beige.manage.modules.app.form.LoginForm;

/**
 * 用户
 *
 * @author Big Hero
 */
public interface UserService extends IService<UserEntity> {

	UserEntity queryByMobile(String mobile);

	/**
	 * 用户登录
	 * @param form    登录表单
	 * @return        返回用户ID
	 */
	long login(LoginForm form);
}
