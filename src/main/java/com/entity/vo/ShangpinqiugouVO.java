package com.entity.vo;

import com.entity.ShangpinqiugouEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 商品求购
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @email
 * @date 2021-03-26
 */
@TableName("shangpinqiugou")
public class ShangpinqiugouVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 求购商品
     */

    @TableField(value = "name")
    private String name;


    /**
     * 求购人
     */

    @TableField(value = "qgrid")
    private Long qgrid;


    /**
     * 联系方式
     */

    @TableField(value = "phoen")
    private String phoen;


    /**
     * 期望价格
     */

    @TableField(value = "money")
    private Double money;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：求购商品
	 */
    public String getName() {
        return name;
    }


    /**
	 * 获取：求购商品
	 */

    public void setName(String name) {
        this.name = name;
    }
    /**
	 * 设置：求购人
	 */
    public Long getQgrid() {
        return qgrid;
    }


    /**
	 * 获取：求购人
	 */

    public void setQgrid(Long qgrid) {
        this.qgrid = qgrid;
    }
    /**
	 * 设置：联系方式
	 */
    public String getPhoen() {
        return phoen;
    }


    /**
	 * 获取：联系方式
	 */

    public void setPhoen(String phoen) {
        this.phoen = phoen;
    }
    /**
	 * 设置：期望价格
	 */
    public Double getMoney() {
        return money;
    }


    /**
	 * 获取：期望价格
	 */

    public void setMoney(Double money) {
        this.money = money;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
