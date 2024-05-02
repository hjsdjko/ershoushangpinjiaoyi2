package com.dao;

import com.entity.JiaoliuhuifuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoliuhuifuVO;
import com.entity.view.JiaoliuhuifuView;


/**
 * 交流回复
 * 
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface JiaoliuhuifuDao extends BaseMapper<JiaoliuhuifuEntity> {
	
	List<JiaoliuhuifuVO> selectListVO(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
	
	JiaoliuhuifuVO selectVO(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
	
	List<JiaoliuhuifuView> selectListView(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);

	List<JiaoliuhuifuView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
	
	JiaoliuhuifuView selectView(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
	
}
