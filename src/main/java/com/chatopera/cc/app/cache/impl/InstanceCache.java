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
package com.chatopera.cc.app.cache.impl;

import com.chatopera.cc.app.basic.MainContext;
import com.chatopera.cc.app.cache.CacheBean;
import com.chatopera.cc.app.cache.CacheInstance;
import com.chatopera.cc.app.cache.impl.*;

/**
 * Hazlcast缓存处理实例类
 * @author admin
 *
 */
public class InstanceCache implements CacheInstance {
	/**
	 * 服务类型枚举
	 * @author admin
	 *
	 */
	public enum CacheServiceEnum{
		HAZLCAST_CLUSTER_AGENT_USER_CACHE, HAZLCAST_CLUSTER_AGENT_STATUS_CACHE, HAZLCAST_CLUSTER_QUENE_USER_CACHE,HAZLCAST_ONLINE_CACHE , HAZLCAST_CULUSTER_SYSTEM , HAZLCAST_IMR_CACHE , API_USER_CACHE , CALLCENTER_CURRENT_CALL ,CALLCENTER_AGENT,JOB_CACHE,HAZLCAST_CALLOUT_CACHE;
		public String toString(){
			return super.toString().toLowerCase();
		}
	}
	
	@Override
	public CacheBean getAgentStatusCacheBean() {
		// TODO Auto-generated method stub
		return MainContext.getContext().getBean(AgentStatusCache.class).getCacheInstance(CacheServiceEnum.HAZLCAST_CLUSTER_AGENT_STATUS_CACHE.toString()) ;
	}
	@Override
	public CacheBean getAgentUserCacheBean() {
		// TODO Auto-generated method stub
		return MainContext.getContext().getBean(AgentUserCache.class).getCacheInstance(CacheServiceEnum.HAZLCAST_CLUSTER_QUENE_USER_CACHE.toString()) ;
	}
	@Override
	public CacheBean getOnlineCacheBean() {
		return MainContext.getContext().getBean(OnlineCache.class).getCacheInstance(CacheServiceEnum.HAZLCAST_ONLINE_CACHE.toString()) ;
	}
	@Override
	public CacheBean getSystemCacheBean() {
		return MainContext.getContext().getBean(SystemCache.class).getCacheInstance(CacheServiceEnum.HAZLCAST_CULUSTER_SYSTEM.toString()) ;
	}

	@Override
	public CacheBean getApiUserCacheBean() {
		return MainContext.getContext().getBean(ApiUserCache.class).getCacheInstance(CacheServiceEnum.API_USER_CACHE.toString()) ;
	}

}
