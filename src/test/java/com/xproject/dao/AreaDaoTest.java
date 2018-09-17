package com.xproject.dao;

import org.junit.Ignore;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Date;

import com.xproject.dao.AreaDao;
import com.xproject.pojo.Area;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
	@Resource(name = "areaDao", type = AreaDao.class)
	private AreaDao areaDao;
	
	@Test
	@Ignore
	public void testFindArea() {
		List<Area> areaList = areaDao.findArea();
		Assert.assertEquals(2, areaList.size());
	}

	@Test
	@Ignore
	public void testFindAreaById() {
		Area area = areaDao.findAreaById(1);
		Assert.assertEquals("广州", area.getAreaName());
	}

	@Test
	@Ignore
	public void testInsertArea() {
		Area area = new Area();
		area.setAreaId(3);
		area.setAreaName("佛山");
		area.setPriority(2);
		area.setCreateTime(null);
		area.setLastEditTime(null);
		
		int effection = areaDao.insertArea(area);
		Assert.assertEquals(1, effection);
	}

	@Test
	@Ignore
	public void testUpdateArea() {
		Area area = new Area();
		area.setAreaName("中山");
		area.setAreaId(3);
		area.setLastEditTime(new Date());
		
		int effection = areaDao.updateArea(area);
		Assert.assertEquals(1, effection);
	}

	@Test
	@Ignore
	public void testDeleteArea() {
		int effection = areaDao.deleteArea(3);
		Assert.assertEquals(1, effection);
	}
}
