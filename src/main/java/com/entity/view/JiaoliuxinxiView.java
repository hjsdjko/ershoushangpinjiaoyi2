package com.entity.view;

import com.entity.JiaoliuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 交流信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-01 17:42:09
 */
@TableName("jiaoliuxinxi")
public class JiaoliuxinxiView  extends JiaoliuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoliuxinxiView(){
	}
 
 	public JiaoliuxinxiView(JiaoliuxinxiEntity jiaoliuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoliuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
