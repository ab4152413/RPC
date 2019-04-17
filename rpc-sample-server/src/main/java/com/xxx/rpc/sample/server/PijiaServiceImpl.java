package com.xxx.rpc.sample.server;

import com.xxx.rpc.sample.api.PijiaService;
import com.xxx.rpc.server.RpcService;

@RpcService(PijiaService.class)
public class PijiaServiceImpl implements PijiaService{

    @Override
    public String pijia(String name){
        return "Pijia! " + name;
    }
}
