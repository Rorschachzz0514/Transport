package com.zhanzhe.layui.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductMapperTest   {
    //自动装载注解
    @Autowired//(required = false)
    private ProductMapper mapper;
    @Test
    void test(){
        mapper.selectList(null).forEach(System.out::println);
    }

}