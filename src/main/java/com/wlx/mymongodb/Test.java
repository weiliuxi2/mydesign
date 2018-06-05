/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package com.wlx.mymongodb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


/**
 * Test.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年5月3日 weiliuxi
 */
public class Test {

	/**
	 * @param args aa
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		try {  
            //连接到MongoDB服务 如果是远程连接可以替换“localhost”为服务器所在IP地址  
            //ServerAddress()两个参数分别为 服务器地址 和 端口  
            ServerAddress serverAddress = new ServerAddress("10.10.18.189",31226);  
            List<ServerAddress> addrs = new ArrayList<ServerAddress>();  
            addrs.add(serverAddress);  
              
            
            MongoClientOptions.Builder builder = MongoClientOptions.builder();
//            builder.connectionsPerHost(50);  
//            builder.threadsAllowedToBlockForConnectionMultiplier(50);  
//            builder.maxWaitTime(1000*60*2);  
//            builder.readPreference(ReadPreference.primaryPreferred());
//            builder.connectTimeout(1000*30);
//            builder.socketTimeout(1000*60);
//            builder.serverSelectionTimeout(1000 * 60);
            MongoClientOptions mco = builder.build();
            
            //MongoCredential.createScramSha1Credential()三个参数分别为 用户名 数据库名称 密码  
            MongoCredential credential = MongoCredential.createScramSha1Credential("w123456", "wlx9", "w123456".toCharArray());  
            List<MongoCredential> credentials = new ArrayList<MongoCredential>();  
            credentials.add(credential);  
              
            //通过连接认证获取MongoDB连接  
            MongoClient mongoClient = new MongoClient(addrs,credentials,mco);  
            mongoClient.getReadPreference();
            

//            mongoClient = new MongoClient(addresses,mcList,mco);
//            db = mongoClient.getDatabase(dbname); 
              
            //连接到数据库  
            MongoDatabase db = mongoClient.getDatabase("wlx9");  
            System.out.println("Connect to database successfully"); 
            
            MongoCollection<Document> a = db.getCollection("usertable");
            long begintime = System.currentTimeMillis();
            Map<String, Object> areaMap1 = null;
            Random random1 = new Random(10000);
            List<Document> list = null;
            for (int j = 0 ; j < 200000; j ++) {
            	list = new ArrayList<>();            
    			for (int i = 0; i < 200; i++) {
    				areaMap1 = new HashMap<String, Object>();
    				
    				SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddHHmmsssssss");
    				String dateStr = dateformat.format(System.currentTimeMillis());
    				
    				String dataa = dateStr+"A" + random1.nextLong();
    				System.out.println("ddddd:" + dataa);
//    				areaMap1.put("_id", dateStr+"-" + random1.nextDouble());
    				areaMap1.put("testa", dataa);
    				areaMap1.put("上海", 14);
    				areaMap1.put("广州", 8);
    				areaMap1.put("深圳", 0.5);
    				areaMap1.put("北京1", 5);
    				areaMap1.put("上海1", 14);
    				areaMap1.put("广州1", 8);
    				areaMap1.put("深圳1", 0.5);
    				areaMap1.put("北京2", 5);
    				areaMap1.put("上海2", 14);
    				areaMap1.put("广州2", 8);
    				areaMap1.put("深圳2", 0.5);
    				areaMap1.put("北京3", 5);
    				areaMap1.put("上海3", 14);
    				areaMap1.put("广州3", 8);
    				areaMap1.put("深圳3", 0.5);
    				Document ab = new Document(areaMap1);
    				list.add(ab);
    			}
    			 System.out.println("#################################################################################");
    			a.insertMany(list);           	
            }
            
            System.out.println("cost:" + (System.currentTimeMillis() - begintime));
            System.out.println("nums:" + a.count());
            
//            a.count();
            FindIterable<Document> iterable = a.find();
            
            
//            List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>();
//            MongoCursor<Document> cursor = iterable.iterator();
//            while (cursor.hasNext()) {
//                Document user = cursor.next();
//                String jsonString = user.toJson();
//                System.out.println(jsonString);
//            }
//           
//            // 连接到数据库
////            MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
//            System.out.println("Connect to database successfully");
////            mongoDatabase.createCollection("test3");
//            MongoCollection<Document> a = db.getCollection("test2");
//            System.out.println(a.count());
//            for (String name : db.listCollectionNames()) {
//                System.out.println(name);
//            }
//              
            
        } catch (Exception e) {  
           e.printStackTrace(); 
        } finally {
        }
		
	}
	
	public static void insert(){
		  
	}

}
