package com.zhanzhe.layui.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhanzhe.layui.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


public interface ProductMapper extends BaseMapper<Product> {
}
