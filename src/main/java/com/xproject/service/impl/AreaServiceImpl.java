package com.xproject.service.impl;

import java.util.List;
import java.util.Date;

import com.xproject.pojo.Area;
import com.xproject.dao.AreaDao;
import com.xproject.service.AreaService;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("areaService")
@Scope(scopeName = "singleton")
public class AreaServiceImpl implements AreaService {
	@Resource(name = "areaDao", type = AreaDao.class)
	private AreaDao areaDao;
	
	public AreaServiceImpl() {}
	
	@Override
	public List<Area> findArea() {
		return areaDao.findArea();
	}

	@Override
	public Area findAreaById(int areaId) {
		return areaDao.findAreaById(areaId);
	}

	@Transactional
	@Override
	public boolean addArea(Area area) {
		// 空值判断，控制areaName不能为空
		if (null != area.getAreaName() && "".equals(area.getAreaName())) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());
			try {
				// 插入区域信息
				int effection = areaDao.insertArea(area);
				if (effection > 0) {
					return true;
				} else {
					throw new RuntimeException("区域信息插入失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("区域信息插入失败！" + e.getMessage());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean updateArea(Area area) {
		// 空值判断，控制areaId不能为空
		if (null != area.getAreaId() && area.getAreaId() > 0) {
			area.setLastEditTime(new Date());
			try {
				// 更新区域信息
				int effection = areaDao.updateArea(area);
				if (effection > 0) {
					return true;
				} else {
					throw new RuntimeException("区域信息更新失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("区域信息更新失败！" + e.getMessage());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

	@Transactional
	@Override
	public boolean deleteArea(int areaId) {
		if (areaId > 0) {
			try {
				// 删除区域信息
				int effection = areaDao.deleteArea(areaId);
				if (effection > 0) {
					return true;
				} else {
					throw new RuntimeException("区域信息删除失败！");
				}
			} catch (Exception e) {
				throw new RuntimeException("区域信息删除失败！" + e.getMessage());
			}
		} else {
			throw new RuntimeException("区域信息不能为空！");
		}
	}

}
