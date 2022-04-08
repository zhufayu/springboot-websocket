package com.softdev.system.demo.nacos.annot;

import com.softdev.system.demo.nacos.service.SkyWalkerCacheServices;

@SyncService(sourceCluster = "ClusterTypeEnum.ZK", destinationCluster = "ClusterTypeEnum.NACOS")
public class NacosServiceImpl {

//    @Autowired
    public NacosServiceImpl(SkyWalkerCacheServices skyWalkerCacheServices) {
        System.out.println("NacosServiceImpl*************" );
    }
}
