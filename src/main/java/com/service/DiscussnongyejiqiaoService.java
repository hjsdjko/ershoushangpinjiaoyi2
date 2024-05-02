package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussnongyejiqiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussnongyejiqiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussnongyejiqiaoView;


/**
 * 农业技巧评论表
 *
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
public interface DiscussnongyejiqiaoService extends IService<DiscussnongyejiqiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussnongyejiqiaoVO> selectListVO(Wrapper<DiscussnongyejiqiaoEntity> wrapper);
   	
   	DiscussnongyejiqiaoVO selectVO(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
   	
   	List<DiscussnongyejiqiaoView> selectListView(Wrapper<DiscussnongyejiqiaoEntity> wrapper);
   	
   	DiscussnongyejiqiaoView selectView(@Param("ew") Wrapper<DiscussnongyejiqiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussnongyejiqiaoEntity> wrapper);
   	
}

