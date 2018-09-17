package com.xproject.web;

import com.xproject.pojo.Area;
import com.xproject.service.AreaService;
import com.xproject.service.impl.AreaServiceImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@RestController
@Scope("singleton")
@RequestMapping(path = {"/admin"})
public class AreaController {
	@Resource(name = "areaService", type = AreaService.class)
	private AreaService areaService;
	
	public AreaController() {}
	
	@RequestMapping(path = {"/listarea"}, method = {RequestMethod.GET})
	private Map<String, Object> listArea() {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		List<Area> areaList = areaService.findArea();
		modelMap.put("areaList", areaList);
		return modelMap;
	}
	
	@RequestMapping(path = {"/findareabyid/{areaId}"}, method = {RequestMethod.GET})
	private Map<String, Object> findAreaById(@PathVariable(name = "areaId", required = true) Integer areaId) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		Area area = areaService.findAreaById(areaId);
		modelMap.put("area", area);
		return modelMap;
	}
	
	@RequestMapping(path = {"/addarea"}, method = {RequestMethod.POST})
	private Map<String, Object> addArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.addArea(area));
		return modelMap;
	} 
	
	@RequestMapping(path = {"/updatearea"}, method = {RequestMethod.POST})
	private Map<String, Object> updateArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.updateArea(area));
		return modelMap;
	} 
	
	@RequestMapping(path = {"/removeearea"}, method = {RequestMethod.POST})
	private Map<String, Object> deleteArea(@PathVariable(name = "areaId", required = true) Integer areaId) {
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("success", areaService.deleteArea(areaId));
		return modelMap;
	} 
}
