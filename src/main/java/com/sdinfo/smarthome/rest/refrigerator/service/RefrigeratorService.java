package com.sdinfo.smarthome.rest.refrigerator.service;


import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;
import com.sdinfo.smarthome.rest.refrigerator.mapper.*;
 
@Service
public class RefrigeratorService {
 
    @Autowired
    RefrigeratorMapper RefrigeratorMapper;
    
    public List<RefrigeratorVo> getAll() throws Exception{
    	List<RefrigeratorVo> testVo = null;
    	
    	try {
    		testVo = RefrigeratorMapper.getAll();
    	}catch (Exception e) {
    		e.printStackTrace();
    	}
        return testVo;
    }
}

