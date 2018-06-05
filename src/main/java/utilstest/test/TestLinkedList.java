/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package utilstest.test;

import java.util.LinkedList;

/**
 * TestLinkedList.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月27日 weiliuxi
 */
public class TestLinkedList {

	public static void main(String[] args) {
		 LinkedList<String> list=new LinkedList<>();
	        int maxTestCount=50000;

	        //测试添加
	        long start =System.currentTimeMillis();

	        for(int i =0;i<maxTestCount;i++){
	            list.add(0,String.valueOf(i));
	        }

	        long end =System.currentTimeMillis();

	        System.out.println("LinkedList add cost time :"+(end-start));

	        //测试查询
	        start =System.currentTimeMillis();

	        for(int i =0;i<maxTestCount;i++){
	            list.get(i);
	        }

	        end =System.currentTimeMillis();

	        System.out.println("LinkedList get cost time :"+(end-start));


	        //测试查询
	        start =System.currentTimeMillis();

	        for(int i =maxTestCount;i>0;i--){
	            list.remove(0);
	        }

	        end =System.currentTimeMillis();

	        System.out.println("LinkedList remove cost time :"+(end-start));
	}
}
