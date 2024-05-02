package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinqiugouEntity;
import java.util.Map;

/**
 * 商品求购 服务类
 * @since 2021-03-26
 */
public interface ShangpinqiugouService extends IService<ShangpinqiugouEntity> {

     PageUtils queryPage(Map<String, Object> params);

}