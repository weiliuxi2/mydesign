/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ReflectTest.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月18日 weiliuxi
 */
public class ReflectTest {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		try {
			Class<?> class1 = Class.forName("test.User");
			User  user = (User) class1.newInstance();
			
			Method method = class1.getMethod("setName",String.class );
			method.invoke(user, "3333");
			
//			user.setName("aaaaaa");
			System.out.println(user);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
