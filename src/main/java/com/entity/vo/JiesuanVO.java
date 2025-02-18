package com.entity.vo;

import com.entity.JiesuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 结算
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-12 20:16:54
 */
public class JiesuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 结算时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiesuanshijian;
		
	/**
	 * 站点收益
	 */
	
	private Integer zhandianshouyi;
		
	/**
	 * 站点支出
	 */
	
	private Integer zhandianzhichu;
		
	/**
	 * 员工支出
	 */
	
	private Integer yuangongzhichu;
		
	/**
	 * 结余
	 */
	
	private Integer jieyu;
		
	/**
	 * 收货量
	 */
	
	private Integer shouhuoliang;
		
	/**
	 * 发货量
	 */
	
	private Integer fahuoliang;
				
	
	/**
	 * 设置：结算时间
	 */
	 
	public void setJiesuanshijian(Date jiesuanshijian) {
		this.jiesuanshijian = jiesuanshijian;
	}
	
	/**
	 * 获取：结算时间
	 */
	public Date getJiesuanshijian() {
		return jiesuanshijian;
	}
				
	
	/**
	 * 设置：站点收益
	 */
	 
	public void setZhandianshouyi(Integer zhandianshouyi) {
		this.zhandianshouyi = zhandianshouyi;
	}
	
	/**
	 * 获取：站点收益
	 */
	public Integer getZhandianshouyi() {
		return zhandianshouyi;
	}
				
	
	/**
	 * 设置：站点支出
	 */
	 
	public void setZhandianzhichu(Integer zhandianzhichu) {
		this.zhandianzhichu = zhandianzhichu;
	}
	
	/**
	 * 获取：站点支出
	 */
	public Integer getZhandianzhichu() {
		return zhandianzhichu;
	}
				
	
	/**
	 * 设置：员工支出
	 */
	 
	public void setYuangongzhichu(Integer yuangongzhichu) {
		this.yuangongzhichu = yuangongzhichu;
	}
	
	/**
	 * 获取：员工支出
	 */
	public Integer getYuangongzhichu() {
		return yuangongzhichu;
	}
				
	
	/**
	 * 设置：结余
	 */
	 
	public void setJieyu(Integer jieyu) {
		this.jieyu = jieyu;
	}
	
	/**
	 * 获取：结余
	 */
	public Integer getJieyu() {
		return jieyu;
	}
				
	
	/**
	 * 设置：收货量
	 */
	 
	public void setShouhuoliang(Integer shouhuoliang) {
		this.shouhuoliang = shouhuoliang;
	}
	
	/**
	 * 获取：收货量
	 */
	public Integer getShouhuoliang() {
		return shouhuoliang;
	}
				
	
	/**
	 * 设置：发货量
	 */
	 
	public void setFahuoliang(Integer fahuoliang) {
		this.fahuoliang = fahuoliang;
	}
	
	/**
	 * 获取：发货量
	 */
	public Integer getFahuoliang() {
		return fahuoliang;
	}
			
}
