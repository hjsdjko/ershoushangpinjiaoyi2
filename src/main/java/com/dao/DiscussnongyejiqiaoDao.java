package com.dao;

import com.entity.DiscussnongyejiqiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongyejiqiaoVO;
import com.entity.view.DiscussnongyejiqiaoView;


/**
 * 农业技巧评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface DiscussnongyejiqiaoDao extends BaseMapper<DiscussnongyejiqiaoEntity> {
	
	List<DiscussnongyejiqiaoVO> selectListVO(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
	
	DiscussnongyejiqiaoVO selectVO(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
	
	List<DiscussnongyejiqiaoView> selectListView(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);

	List<DiscussnongyejiqiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
	
	DiscussnongyejiqiaoView selectView(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
	
}
