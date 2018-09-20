package com.estbon.gradle.demo;

import com.estbon.gradle.example.Apple;
import com.xiaoleilu.hutool.json.JSONUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author liushuaishuai
 * @version 1.0
 * @date 2018/9/7 15:29
 * @description
 */
public class Demo17 {

    public static void main(String[] args) {


        System.out.println(UUID.randomUUID().toString());

        System.out.println(new Date());


        Map<Long, Apple> map = new HashMap<>();

        map.put(1l,new Apple(2,"red"));
        map.put(2l,new Apple(3,"red"));

        System.out.println(JSONUtil.parseFromMap(map));


    }
}
