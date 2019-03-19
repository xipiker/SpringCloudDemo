package pers.xipiker.springcloudeurekafeignclient.comm;

import org.springframework.stereotype.Component;
import pers.xipiker.springcloudeurekafeignclient.dao.EurekaClientFeign;

@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, " + name + ", sorry, error!";
    }
}
