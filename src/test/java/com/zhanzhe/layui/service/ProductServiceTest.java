package com.zhanzhe.layui.service;

import com.zhanzhe.layui.vo.DataVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class ProductServiceTest {
    @Autowired
    private ProductService service;
    @Test
    void findData(){
        DataVO dataVO=service.findData();
        int i=0;
    }
}