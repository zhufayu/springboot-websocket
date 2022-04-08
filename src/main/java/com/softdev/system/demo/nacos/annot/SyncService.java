package com.softdev.system.demo.nacos.annot;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component  //Spring容器管理的单例bean组件
public @interface SyncService {
    String sourceCluster();
    String destinationCluster();
}
