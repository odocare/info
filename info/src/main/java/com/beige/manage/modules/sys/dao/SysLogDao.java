/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.beige.manage.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Big Hero
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}