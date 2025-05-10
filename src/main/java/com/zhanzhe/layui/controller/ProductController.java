package com.zhanzhe.layui.controller;

import com.zhanzhe.layui.service.ProductService;
import com.zhanzhe.layui.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/list")
    public DataVO list(){
        return productService.findData();
    }

}
