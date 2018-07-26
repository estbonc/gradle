package com.estbon.gradle.util;

import com.estbon.gradle.config.Lss;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/4/3 20:15
 * @description
 */
public class TestUtils {

    @Autowired
    private Lss lss;


    public String getName(){
        return lss.getName();
    }


}
