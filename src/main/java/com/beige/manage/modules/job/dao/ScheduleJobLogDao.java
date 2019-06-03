
package com.beige.manage.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author Big Hero
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {

}
