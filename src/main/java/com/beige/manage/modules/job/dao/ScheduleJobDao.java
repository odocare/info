
package com.beige.manage.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.job.entity.ScheduleJobEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 定时任务
 *
 * @author Big Hero
 */
@Mapper
public interface ScheduleJobDao extends BaseMapper<ScheduleJobEntity> {

	/**
	 * 批量更新状态
	 */
	int updateBatch(Map<String, Object> map);
}
