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


import com.dao.JiaoliuhuifuDao;
import com.entity.JiaoliuhuifuEntity;
import com.service.JiaoliuhuifuService;
import com.entity.vo.JiaoliuhuifuVO;
import com.entity.view.JiaoliuhuifuView;

@Service("jiaoliuhuifuService")
public class JiaoliuhuifuServiceImpl extends ServiceImpl<JiaoliuhuifuDao, JiaoliuhuifuEntity> implements JiaoliuhuifuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoliuhuifuEntity> page = this.selectPage(
                new Query<JiaoliuhuifuEntity>(params).getPage(),
                new EntityWrapper<JiaoliuhuifuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoliuhuifuEntity> wrapper) {
		  Page<JiaoliuhuifuView> page =new Query<JiaoliuhuifuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoliuhuifuVO> selectListVO(Wrapper<JiaoliuhuifuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoliuhuifuVO selectVO(Wrapper<JiaoliuhuifuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoliuhuifuView> selectListView(Wrapper<JiaoliuhuifuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoliuhuifuView selectView(Wrapper<JiaoliuhuifuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
