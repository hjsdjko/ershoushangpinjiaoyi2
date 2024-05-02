package com.entity.view;

import com.entity.ShangpinqiugouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;

/**
 * 商品求购
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @email
 * @date 2021-03-26
 */
@TableName("shangpinqiugou")
public class ShangpinqiugouView extends ShangpinqiugouEntity implements Serializable {
    private static final long serialVersionUID = 1L;

	public ShangpinqiugouView() {

	}

	public ShangpinqiugouView(ShangpinqiugouEntity shangpinqiugouEntity) {
		try {
			BeanUtils.copyProperties(this, shangpinqiugouEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
