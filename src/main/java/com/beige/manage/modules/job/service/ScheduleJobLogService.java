/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *

 *
 * 版权所有，侵权必究！
 */

package com.beige.manage.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.beige.manage.common.utils.PageUtils;
import com.beige.manage.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author Big Hero
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);

}
