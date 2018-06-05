/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package utilstest.test;

import java.util.HashSet;
import java.util.Set;

import utilstest.vo.User;

/**
 * HashSetTest.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月27日 weiliuxi
 */
public class HashSetTest {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		User user = new User();
		user.setId("123");
		user.setName("333");
		set.add(user);
		user = new User();
		user.setId("123");
		user.setName("333");
		
		
		set.add(user);
		set.forEach(v -> {System.out.println(v.toString());});
	}

}
