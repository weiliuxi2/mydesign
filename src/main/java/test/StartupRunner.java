/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * StartupRunner.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月4日 weiliuxi
 */
@Component
public class StartupRunner implements CommandLineRunner {

	/**  */
	@Autowired
	private UserDao userDao;
	
	/* 
	 * @see org.springframework.boot.CommandLineRunner#run(java.lang.String[])
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("第一次查询");
        System.out.println(userDao.getUser(1L));
        System.out.println("第二次查询");
        System.out.println(userDao.getUser(1L));
        System.out.println("shanchu chache");
        userDao.removeFromCache(1L);
        System.out.println("第3次查询");
        System.out.println(userDao.getUser(1L));
	}

}
