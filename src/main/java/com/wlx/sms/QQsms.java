/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.wlx.sms;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

/**
 * QQsms.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月19日 weiliuxi
 */
public class QQsms {

	public static void main(String[] args) throws Exception {
		 SmsSingleSender sender = new SmsSingleSender(1400073687, "e4c5555dd8454aeaf232b5fdd8d49d79");
         SmsSingleSenderResult result = sender.send(0, "86", "18819386614", "【腾讯】验证码测试1234", "", "123");
         System.out.println(result.errMsg);
	}
}
