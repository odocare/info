
package com.beige.manage.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.sys.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 *
 * @author Big Hero
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
