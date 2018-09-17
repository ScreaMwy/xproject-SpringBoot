package com.xproject.service;

import java.util.List;

import com.xproject.pojo.Area;

public interface AreaService {

	/**
	 * 列出区域列表
	 * @return areaList
	 */
	public abstract List<Area> findArea();

	/**
	 * 根据Id列出具体区域
	 * @param areaId
	 * @return area
	 */
	public abstract Area findAreaById(int areaId);

	/**
	 * 插入区域信息
	 * @param area
	 * @return true
	 */
	public abstract boolean addArea(Area area);

	/**
	 * 更新区域信息
	 * @param area
	 * @return true
	 */
	public abstract boolean updateArea(Area area);

	/**
	 * 删除区域信息
	 * @param area
	 * @return true
	 */
	public abstract boolean deleteArea(int areaId);
}
