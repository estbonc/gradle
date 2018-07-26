package com.estbon.gradle.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/3 20:14
 * @description
 */
@Component
@Data
public class Lss {

    @Value("${lss.name}")
    private String name;

    @Value("${lss.age}")
    private int age;

}
