package com.spring.iot.SpringbootIOT.Controller;

import com.spring.iot.SpringbootIOT.Service.IotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vinayraghavtiwari on 02/08/19.
 */

@RestController
public class IotController {

    @Autowired
    public IotService iotService;

    @GetMapping("/iot/add")
    public int add() {
        return iotService.add();
    }


}
