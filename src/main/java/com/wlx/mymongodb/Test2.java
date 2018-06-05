/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.wlx.mymongodb;

import java.text.SimpleDateFormat;

/**
 * Test2.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月3日 weiliuxi
 */
public class Test2 {

	/**
	 * @param args aa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmsssssss");
		String dateStr = dateformat.format(System.currentTimeMillis());
		System.out.println("ddddd:" + dateStr);
	}

}
