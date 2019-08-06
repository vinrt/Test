package com.spring.iot.SpringbootIOT.Controller;

import com.spring.iot.SpringbootIOT.Configuration.BasicConfig;
import com.spring.iot.SpringbootIOT.Service.IotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinayraghavtiwari on 02/08/19.
 */

@RestController
public class IotController {

    @Autowired
    public IotService iotService;

    @Autowired
    public BasicConfig basicConfig;


    @GetMapping("/iot/add")
    public int add() {
        return iotService.add();
    }


    @GetMapping("/iot/sub")
    public  int sub()
    {
        return iotService.sub();
    }

    @GetMapping("/iot/mul")
    public  int mul()
    {
        return iotService.mul();
    }

    @GetMapping("/iot/div")
    public  double div()
    {
        return iotService.div();
    }

    @GetMapping("/dynamic-config")
    public Map dynamicConfig()
    {
        Map map = new HashMap();
        map.put("operation", basicConfig.getOperation());
        map.put("numbers",basicConfig.getNumbers());

        return map;
    }

}

