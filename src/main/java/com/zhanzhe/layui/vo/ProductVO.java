package com.zhanzhe.layui.vo;

import lombok.Data;

@Data
public class ProductVO {
    Integer id;
    String name;
    String description;
    Integer price;
    Integer stock;
    String categorylevelone;
    String categoryleveltwo;
    String categorylevelthree;
    String fileName;
}
