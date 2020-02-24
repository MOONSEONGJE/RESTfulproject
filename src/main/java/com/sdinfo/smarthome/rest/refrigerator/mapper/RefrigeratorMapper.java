package com.sdinfo.smarthome.rest.refrigerator.mapper;

import java.util.*;

import com.sdinfo.smarthome.rest.refrigerator.domain.*;;


public interface RefrigeratorMapper {

	public List<RefrigeratorVo> TBL_REFRIGERATOR() throws Exception;
	int inputData(RefrigeratorVo param) throws Exception;
}
