package com.softdev.system.demo.nacos.initializingBean;

import org.springframework.beans.factory.InitializingBean;

public abstract class AbstractServiceSharding implements InitializingBean {

    protected abstract void doSharding();

    //初始化bean的时候执行，可以针对某个具体的bean进行配置
    @Override
    public void afterPropertiesSet() throws Exception {
       System.out.println("AbstractServiceSharding afterPropertiesSet***************");
    }
}
