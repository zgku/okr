package com.org.fun.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.org.fun.entity.Target;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */
public interface TargetMapper extends BaseMapper<Target> {

    IPage<Target> findUserPage(Page<Target> page, @Param(Constants.WRAPPER) QueryWrapper<Target> wrapper);
}
