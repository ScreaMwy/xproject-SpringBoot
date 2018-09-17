package com.xproject.pojo;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings({"unused"})
public class Area implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer areaId;
	private String areaName;
	private Integer priority;
	private Date createTime;
	private Date lastEditTime;
	
	public Area() {}

	public Area(Integer areaId, String areaName, Integer priority, Date createTime, Date lastEditTime) {
		this.areaId = areaId;
		this.areaName = areaName;
		this.priority = priority;
		this.createTime = createTime;
		this.lastEditTime = lastEditTime;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String name) {
		this.areaName = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	@Override
	public String toString() {
		return "Area [id=" + areaId + ", name=" + areaName + ", priority=" + priority + ", time=" + createTime + ", lastEditTime="
				+ lastEditTime + "]";
	}
}
