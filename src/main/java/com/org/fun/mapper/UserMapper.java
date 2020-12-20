package com.org.fun.mapper;

import com.org.fun.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.org.fun.result.Result;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
