package com.dao;

import com.entity.ShangpinqiugouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinqiugouView;

/**
 * 商品求购 Dao 接口
 *
 * @since 2021-03-26
 */
public interface ShangpinqiugouDao extends BaseMapper<ShangpinqiugouEntity> {

   List<ShangpinqiugouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
