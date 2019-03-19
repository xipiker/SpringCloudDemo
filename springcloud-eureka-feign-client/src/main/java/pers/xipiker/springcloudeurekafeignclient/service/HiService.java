package pers.xipiker.springcloudeurekafeignclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.xipiker.springcloudeurekafeignclient.dao.EurekaClientFeign;

@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
}
