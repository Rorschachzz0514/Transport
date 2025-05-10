package com.zhanzhe.layui.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ParameterMapperTest {
@Autowired
    private ParameterMapper mapper;
@Test
    void text(){
    QueryWrapper wrapper=new QueryWrapper();
    wrapper.eq("id",1);
    System.out.println(this.mapper.selectOne(wrapper));
}
}