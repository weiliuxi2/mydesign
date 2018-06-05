/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package utilstest.test;

import utilstest.vo.User;

/**
 * NullTest.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月3日 weiliuxi
 */
public class NullTest {
	public static void main(String[] args) {
		User user = null;
		System.out.println(user.getAge());
	}

}
