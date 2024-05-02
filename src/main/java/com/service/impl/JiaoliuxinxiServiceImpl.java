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


import com.dao.JiaoliuxinxiDao;
import com.entity.JiaoliuxinxiEntity;
import com.service.JiaoliuxinxiService;
import com.entity.vo.JiaoliuxinxiVO;
import com.entity.view.JiaoliuxinxiView;

@Service("jiaoliuxinxiService")
public class JiaoliuxinxiServiceImpl extends ServiceImpl<JiaoliuxinxiDao, JiaoliuxinxiEntity> implements JiaoliuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoliuxinxiEntity> page = this.selectPage(
                new Query<JiaoliuxinxiEntity>(params).getPage(),
                new EntityWrapper<JiaoliuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoliuxinxiEntity> wrapper) {
		  Page<JiaoliuxinxiView> page =new Query<JiaoliuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoliuxinxiVO> selectListVO(Wrapper<JiaoliuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoliuxinxiVO selectVO(Wrapper<JiaoliuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoliuxinxiView> selectListView(Wrapper<JiaoliuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoliuxinxiView selectView(Wrapper<JiaoliuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
