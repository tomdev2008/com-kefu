/*
 * Copyright (C) 2017 优客服-多渠道客服系统
 * Modifications copyright (C) 2018 Chatopera Inc, <https://www.chatopera.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.chatopera.cc.app.cache;

import com.alibaba.fastjson.JSONObject;

import java.util.Collection;
import java.util.concurrent.locks.Lock;

public interface CacheBean {
	/**
	 * 
	 */
	public Object put(String key , Object value , String orgi) ;
	
	/**
	 * 
	 */
	public void clear(String orgi);
	
	
	public Object delete(String key , String orgi) ;

	public Object delete(String key);

	public Object update(String key , String orgi , Object object) ;
	
	/**
	 * 
	 * @param key
	 * @param orgi
	 * @return
	 */
	public Object getCacheObject(String key, String orgi) ;


	public Object getCacheObject(String key);


	
	/**
	 * 
	 * @param key
	 * @param orgi
	 * @return
	 */
	public Object getCacheObject(String key, String orgi,Object defaultValue) ;
	
	/**
	 * 获取所有缓存对象
	 * @param orgi
	 * @return
	 */
	public Collection<?> getAllCacheObject(String orgi) ; 
	
	
	public CacheBean getCacheInstance(String cacheName);
	
	public Object getCache();
	
	public JSONObject getStatics();


	public long getSize();




}
