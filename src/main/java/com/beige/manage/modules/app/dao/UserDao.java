
package com.beige.manage.modules.app.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beige.manage.modules.app.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author Big Hero
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
