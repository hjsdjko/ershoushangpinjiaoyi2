package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoliuhuifuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoliuhuifuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoliuhuifuView;


/**
 * 交流回复
 *
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface JiaoliuhuifuService extends IService<JiaoliuhuifuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoliuhuifuVO> selectListVO(Wrapper<JiaoliuhuifuEntity> wrapper);
   	
   	JiaoliuhuifuVO selectVO(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
   	
   	List<JiaoliuhuifuView> selectListView(Wrapper<JiaoliuhuifuEntity> wrapper);
   	
   	JiaoliuhuifuView selectView(@Param("ew") Wrapper<JiaoliuhuifuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoliuhuifuEntity> wrapper);
   	
}

