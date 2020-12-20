package com.org.fun.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.org.fun.entity.Target;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */
public interface TargetService extends IService<Target> {

    IPage<Target> findTargetPage(Page<Target> page, QueryWrapper<Target> wrapper);


}
