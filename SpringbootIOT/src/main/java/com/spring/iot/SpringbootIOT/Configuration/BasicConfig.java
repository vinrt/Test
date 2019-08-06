package com.spring.iot.SpringbootIOT.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by vinayraghavtiwari on 06/08/19.
 */

@Component
@ConfigurationProperties("calc")
public class BasicConfig {

    private String operation;
    private Integer numbers;



    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }
}
