package com.zhanzhe.layui.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Insert;

@Data
public class Product {
    Integer id;
    String name;
    String description;
    Integer price;
    Integer stock;
    Integer categoryleveloneId;
    Integer categoryleveltwoId;
    Integer categorylevelthreeId;
    String fileName;
}
