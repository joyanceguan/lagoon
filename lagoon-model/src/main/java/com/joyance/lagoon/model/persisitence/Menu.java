package com.joyance.lagoon.model.persisitence;

public class Menu extends BaseModel{
    
	/**
	 * 路径
	 */
	private String path;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * url
	 */
	private String url;
	/**
	 * 父菜单id
	 */
	private Long parentId;
	/**
	 * 排序
	 */
	private Integer finalOrder;
	/**
	 * 图标
	 */
	private String icon;
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Integer getFinalOrder() {
		return finalOrder;
	}
	public void setFinalOrder(Integer finalOrder) {
		this.finalOrder = finalOrder;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
}
