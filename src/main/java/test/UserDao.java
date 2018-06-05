/******************************************************************************
 * Copyright (C) 2018 ShenZhen ComTop Information Technology Co.,Ltd
 * All Rights Reserved.
 * 本软件为深圳康拓普开发研制。未经本公司正式书面同意，其他任何个人、团体不得使用、
 * 复制、修改或发布本软件.
 *****************************************************************************/
package test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

/**
 * UserDao.java
 *
 * @author  weiliuxi
 * @since   1.0
 * @version 2018年4月4日 weiliuxi
 */
@Component
@EnableCaching
public class UserDao {

	/**  */
	private Map<Long,User> userMap = new HashMap(){
		
		private static final long serialVersionUID = 1L;
	{
		put(1L, new User(1L,"micro1"));
		put(2L, new User(2L, "micro2"));
	}};
	
	/**
	 * @param userId userId
	 * @return User
	 */
	@Cacheable("user")
	public User getUser(Long userId) {
		System.out.println("chaxu db:userID ->" + userId);
		return userMap.get(userId);
	}
	
	/**
	 * @param userId userId
	 * @param name name
	 * @return name
	 */
	@Cacheable(value = "nameCache",key = "#name")
	public User getUserByName(Long userId, String name) {
        System.out.println("查询数据库:userId ->" + userId);
        return userMap.get(userId);
    }
	
	/**
	 * @param userId userId
	 */
	@CacheEvict("user")
    public void removeFromCache(Long userId) {
        return ;
    }
}
