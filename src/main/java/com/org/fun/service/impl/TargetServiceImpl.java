package com.org.fun.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.org.fun.entity.Target;
import com.org.fun.mapper.TargetMapper;
import com.org.fun.service.TargetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */
@Service
public class TargetServiceImpl extends ServiceImpl<TargetMapper, Target> implements TargetService {

    @Autowired
    private TargetMapper targetMapper;


    @Override
    public IPage<Target> findTargetPage(Page<Target> page, QueryWrapper<Target> wrapper) {
        return this.targetMapper.findUserPage(page,wrapper);
    }
}
