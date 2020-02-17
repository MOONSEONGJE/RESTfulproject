package com.sdinfo.smarthome.rest.refrigerator.controller;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.service.*;

@Controller
public class RefrigeratorController {
	@Autowired
	RefrigeratorService RefrigeratorService; 
	 
	@RequestMapping(value = "/data", method = {RequestMethod.GET}, produces = "application/json; charset=utf8")

		public @ResponseBody List<RefrigeratorVo> query() throws Exception{
		
		return RefrigeratorService.getAll();
	}
}
