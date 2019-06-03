
package com.beige.manage.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.beige.manage.common.utils.PageUtils;
import com.beige.manage.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Big Hero
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
