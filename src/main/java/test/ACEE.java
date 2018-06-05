/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package test;

import java.text.DecimalFormat;

/**
 * ACEE.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月11日 weiliuxi
 */
public class ACEE {

	/**
	 * @param args aa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat fnum = new DecimalFormat("##0.00");
		String rate = "0.8648853302001953";
		String limitValue = "2.44140625";
		float fValue = Float.parseFloat(rate) / Float.parseFloat(limitValue) * 100;
		
		String aa = fnum.format(fValue);
		System.out.println(aa);
	}

}
