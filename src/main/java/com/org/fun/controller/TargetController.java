package com.org.fun.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.org.fun.entity.Target;
import com.org.fun.result.Result;
import com.org.fun.service.TargetService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zgku
 * @since 2020-12-05
 */

@RestController
@RequestMapping("/target")
public class TargetController {
    @Autowired
    private TargetService targetService;


    @GetMapping("/findTargets")
    public List<Target> findTargets(){
        List<Target> list =targetService.list();
        return list;
    }

    /**
     * 分页查询用户列表
     *
     * @return
     */
    @ApiOperation("分页查询用户列表")
    @GetMapping("/findTargetsList")
    public Result findTargetsList(@RequestParam(required = true, defaultValue = "1") Integer current,
                                  @RequestParam(required = true, defaultValue = "6") Integer size) {
        //对用户进行分页,泛型中注入的就是用户实体类
        Page<Target> page = new Page<>(current, size);
        //单表的时候其实这个方法是非常好用的
        //LambdaQueryWrapper<Target> queryWrapper = new LambdaQueryWrapper<>();
        Page<Target> userPage = (Page<Target>) targetService.page(page);
        long total = userPage.getTotal();
        List<Target> records = userPage.getRecords();
        return Result.ok().data("total", total).data("records", records);
    }



}

