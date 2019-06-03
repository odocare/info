
package com.beige.manage.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author Big Hero
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);

}
