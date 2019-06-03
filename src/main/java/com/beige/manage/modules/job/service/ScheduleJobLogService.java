
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
