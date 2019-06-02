/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *

 *
 * 版权所有，侵权必究！
 */

package com.beige.manage.modules.sys.form;

import lombok.Data;

/**
 * 登录表单
 *
 * @author Big Hero
 */
@Data
public class SysLoginForm {
    private String username;
    private String password;
    private String captcha;
    private String uuid;


}