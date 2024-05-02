package com.controller;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;

import com.entity.ShangpinqiugouEntity;

import com.service.ShangpinqiugouService;
import com.utils.PageUtils;
import com.utils.R;

/**
 * 商品求购
 * 后端接口
 * @author
 * @email
 * @date 2021-03-26
*/
@RestController
@Controller
@RequestMapping("/shangpinqiugou")
public class ShangpinqiugouController {
    private static final Logger logger = LoggerFactory.getLogger(ShangpinqiugouController.class);

    @Autowired
    private ShangpinqiugouService shangpinqiugouService;

    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params){
        logger.debug("Controller:"+this.getClass().getName()+",page方法");
        PageUtils page = shangpinqiugouService.queryPage(params);
        return R.ok().put("data", page);
    }
    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        logger.debug("Controller:"+this.getClass().getName()+",info方法");
        ShangpinqiugouEntity shangpinqiugou = shangpinqiugouService.selectById(id);
        if(shangpinqiugou!=null){
            return R.ok().put("data", shangpinqiugou);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ShangpinqiugouEntity shangpinqiugou, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",save");
        Wrapper<ShangpinqiugouEntity> queryWrapper = new EntityWrapper<ShangpinqiugouEntity>()
            .eq("name", shangpinqiugou.getName())
            .eq("qgrid", shangpinqiugou.getQgrid())
            .eq("phoen", shangpinqiugou.getPhoen())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangpinqiugouEntity shangpinqiugouEntity = shangpinqiugouService.selectOne(queryWrapper);
        if(shangpinqiugouEntity==null){
            shangpinqiugouService.insert(shangpinqiugou);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShangpinqiugouEntity shangpinqiugou, HttpServletRequest request){
        logger.debug("Controller:"+this.getClass().getName()+",update");
        //根据字段查询是否有相同数据
        Wrapper<ShangpinqiugouEntity> queryWrapper = new EntityWrapper<ShangpinqiugouEntity>()
            .notIn("id",shangpinqiugou.getId())
            .eq("name", shangpinqiugou.getName())
            .eq("qgrid", shangpinqiugou.getQgrid())
            .eq("phoen", shangpinqiugou.getPhoen())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShangpinqiugouEntity shangpinqiugouEntity = shangpinqiugouService.selectOne(queryWrapper);
        if(shangpinqiugouEntity==null){
            shangpinqiugouService.updateById(shangpinqiugou);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        logger.debug("Controller:"+this.getClass().getName()+",delete");
        shangpinqiugouService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
}

