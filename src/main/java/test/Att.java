/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Att.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月24日 weiliuxi
 */
public class Att {

	/**
	 * @param args aa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cookieHeader = "_isLogout=false; access-token=eyJhbGciOiJIUzUxMiJ9.eyJhY2NvdW50IjoiZHJ0enVodSIsInVzZXJJZCI6IkFDNTIwMzU1RkZBNTQyMEE4NDM3QkFERjVDNjEzNTRDIiwiZW1wbG95ZWVJZCI6IjE5RDlEMEM4MDNFRDQxQTZCOTRDN0VFRUVDNjIyNkQ2IiwiZW1wbG95ZWVOYW1lIjoiZHJ0enVodSIsIm9yZ0lkIjoiQTY3QzI5MTAxQzE5NDlCOEEzNDJDNDJGN0UzMEU2RDAiLCJvcmdDb2RlIjoiZXRsZ3lub3IiLCJvcmdOYW1lIjoi55S16J6N6YCaMjAxOCIsInN1YiI6ImRydHp1aHUiLCJpYXQiOjE1MjQ1MzIyODYsImV4cCI6MTUyNDUzNDMxMiwicmVmcmVzaEludGVydmFsIjozMCwianRpIjoiYmJmOWE5ZDYtMmQ5MS00YmFiLWFmZTctNzZkMjc5NzQ5OTNlIiwicmVmcmVzaERhdGUiOjE1MjQ1MzI1MTIzNDl9.FGm1U30jurnttm8N2Yud9KG20RlAdr5gOEx_-usHUiF0G4ixx4CeyWOoXuXX_Y9i8J6-uy1Y3q6bQrlQrJa0fA";
		int start = cookieHeader.indexOf("access-token=");
        String aa = start == -1 ? cookieHeader : cookieHeader.substring(start + 13);
        System.out.println(aa);
        Map map = new HashMap();
        List list = new ArrayList();
        map.isEmpty();
	}

}
