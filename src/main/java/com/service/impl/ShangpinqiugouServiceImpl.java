package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;

import com.dao.ShangpinqiugouDao;
import com.entity.ShangpinqiugouEntity;
import com.service.ShangpinqiugouService;
import com.entity.view.ShangpinqiugouView;

/**
 * 商品求购 服务实现类
 * @since 2021-03-26
 */
@Service("shangpinqiugouService")
@Transactional
public class ShangpinqiugouServiceImpl extends ServiceImpl<ShangpinqiugouDao, ShangpinqiugouEntity> implements ShangpinqiugouService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShangpinqiugouView> page =new Query<ShangpinqiugouView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }

}
