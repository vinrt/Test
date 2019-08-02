package com.spring.iot.SpringbootIOT.Service;

import org.springframework.stereotype.Service;

/**
 * Created by vinayraghavtiwari on 02/08/19.
 */

@Service
public class IotServiceImpl implements IotService {

    int a=9,b=6;
    @Override
    public int add() {
        return a+b;
    }

    @Override
    public int sub() {
        return a-b;
    }

    @Override
    public int mul() {
        return a*b;
    }

    @Override
    public double div() {
        return a%b;
    }
}
