/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.wlx.lambdatest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MapTest.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月20日 weiliuxi
 */
public class MapTest {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", "123");
		map.put("lists", Arrays.asList(new String("tttt"),new String("qqq")));
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		    System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		map.forEach((k,v) -> {
			if (v instanceof List) {
//				v = v.toString().replace("[", "").replace("]", "");
				map.put(k,  v.toString().replace("[", "").replace("]", ""));
			}
		});
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		    System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
	}
}
