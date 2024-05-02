package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoliuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoliuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoliuxinxiView;


/**
 * 交流信息
 *
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface JiaoliuxinxiService extends IService<JiaoliuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoliuxinxiVO> selectListVO(Wrapper<JiaoliuxinxiEntity> wrapper);
   	
   	JiaoliuxinxiVO selectVO(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
   	
   	List<JiaoliuxinxiView> selectListView(Wrapper<JiaoliuxinxiEntity> wrapper);
   	
   	JiaoliuxinxiView selectView(@Param("ew") Wrapper<JiaoliuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoliuxinxiEntity> wrapper);
   	
}

