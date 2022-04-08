package com.softdev.system.demo.nacos.initializingBean;

import org.springframework.stereotype.Service;

@Service
public class ConsistentHashServiceSharding  extends AbstractServiceSharding{
    public ConsistentHashServiceSharding() {
        super();
    }

    @Override
    protected void doSharding() {
        System.out.println("ConsistentHashServiceSharding doSharding*****************");
    }
}
