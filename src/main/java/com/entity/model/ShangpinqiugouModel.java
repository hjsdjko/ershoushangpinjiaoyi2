package com.entity.model;

import com.entity.ShangpinqiugouEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 商品求购
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @email
 * @date 2021-03-26
 */
public class ShangpinqiugouModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 求购商品
     */
    private String name;


    /**
     * 求购人
     */
    private Long qgrid;


    /**
     * 联系方式
     */
    private String phoen;


    /**
     * 期望价格
     */
    private Double money;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
