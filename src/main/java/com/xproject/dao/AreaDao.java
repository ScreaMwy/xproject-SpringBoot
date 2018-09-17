package com.xproject.dao;

import java.util.List;

import com.xproject.pojo.Area;

public interface AreaDao {

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
	 * @return 影响的行数
	 */
	public abstract int insertArea(Area area);

	/**
	 * 更新区域信息
	 * @param area
	 * @return 影响的行数
	 */
	public abstract int updateArea(Area area);

	/**
	 * 删除区域信息
	 * @param area
	 * @return 影响的行数
	 */
	public abstract int deleteArea(int areaId);

}