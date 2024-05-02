package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussnongyejiqiaoDao;
import com.entity.DiscussnongyejiqiaoEntity;
import com.service.DiscussnongyejiqiaoService;
import com.entity.vo.DiscussnongyejiqiaoVO;
import com.entity.view.DiscussnongyejiqiaoView;

@Service("discussnongyejiqiaoService")
public class DiscussnongyejiqiaoServiceImpl extends ServiceImpl<DiscussnongyejiqiaoDao, DiscussnongyejiqiaoEntity> implements DiscussnongyejiqiaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussnongyejiqiaoEntity> page = this.selectPage(
                new Query<DiscussnongyejiqiaoEntity>(params).getPage(),
                new EntityWrapper<DiscussnongyejiqiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussnongyejiqiaoEntity> wrapper) {
		  Page<DiscussnongyejiqiaoView> page =new Query<DiscussnongyejiqiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussnongyejiqiaoVO> selectListVO(Wrapper<DiscussnongyejiqiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussnongyejiqiaoVO selectVO(Wrapper<DiscussnongyejiqiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussnongyejiqiaoView> selectListView(Wrapper<DiscussnongyejiqiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussnongyejiqiaoView selectView(Wrapper<DiscussnongyejiqiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
