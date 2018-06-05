/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.wlx.mymongodb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


/**
 * ThreadMo.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月3日 weiliuxi
 */
public class ThreadMo {


	public static void main(String[] args) {
		ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 10, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(100));
		
		pool.execute(new RunThread());
	}

}

class RunThread implements Runnable{

	/* 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		  ServerAddress serverAddress = new ServerAddress("10.10.11.186",31408);  
          List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
          addrs.add(serverAddress);  
            
          
          MongoClientOptions.Builder builder = MongoClientOptions.builder();
//          builder.connectTimeout(1000*3*1);
//          builder.socketTimeout(1000);
          builder.serverSelectionTimeout(1000 * 60);
          MongoClientOptions mco = builder.build();
          
          //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码  
          MongoCredential credential = MongoCredential.createScramSha1Credential("w123456", "wlx", "w123456".toCharArray());  
          List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
          credentials.add(credential);  
            
          //通过连接认证获取MongoDB连接  
          MongoClient mongoClient = new MongoClient(addrs,credentials,mco);  
          mongoClient.getReadPreference();
          

//          mongoClient = new MongoClient(addresses,mcList,mco);
//          db = mongoClient.getDatabase(dbname); 
            
          //连接到数据库  
          MongoDatabase db = mongoClient.getDatabase("wlx");  
          System.out.println("Connect to database successfully"); 
          
          MongoCollection<Document> a = db.getCollection("test2");
          long begintime = System.currentTimeMillis();
          for (int i = 100 ; i < 2000; i ++) {
          	Map<String, Object> areaMap1 = new HashMap<String,Object>();
//      		areaMap1.put("_id", i);
           areaMap1.put("北京", 5);
            areaMap1.put("上海", 14);
            areaMap1.put("广州",8);
            areaMap1.put("深圳",0.5);
            Document ab = new Document(areaMap1);
            a.insertOne(ab);
          }
          
          FindIterable<Document> iterable = a.find();
//
          List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>();
          MongoCursor<Document> cursor = iterable.iterator();
          while (cursor.hasNext()) {
              Document user = cursor.next();
              String jsonString = user.toJson();
              System.out.println(jsonString);
          }
          System.out.println("检索全部完毕");
//          return list;
          System.out.println("cost:" + (System.currentTimeMillis() - begintime));

	}
	
}

