package com.zhanzhe.layui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zhanzhe.layui.entity.Product;
import com.zhanzhe.layui.entity.ProductCategory;
import com.zhanzhe.layui.mapper.ProductCategoryMapper;
import com.zhanzhe.layui.mapper.ProductMapper;
import com.zhanzhe.layui.service.ProductService;
import com.zhanzhe.layui.vo.DataVO;
import com.zhanzhe.layui.vo.ProductVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public DataVO<ProductVO> findData() {
        DataVO dataVO=new DataVO<>();
        dataVO.setCode(0);
        dataVO.setMsg("");
        dataVO.setCount(productMapper.selectCount(null));
        List<Product> productList=productMapper.selectList(null);
        List<ProductVO> productVOList=new ArrayList<>();
        for (Product product : productList) {
            ProductVO productVO=new ProductVO();
            BeanUtils.copyProperties(product,productVO);
            QueryWrapper wrapper=new QueryWrapper();


            wrapper.eq("id",product.getCategoryleveloneId());
            ProductCategory productCategory=productCategoryMapper.selectOne(wrapper);
            if (productCategory!=null){
                productVO.setCategorylevelone(productCategoryMapper.selectOne(wrapper).getName());

            }

            wrapper=new QueryWrapper();

            wrapper.eq("id",product.getCategoryleveltwoId());
            //System.out.println("-------------------------------------------------------------------------------------");
            //System.out.println(product.getCategoryleveltwoId());
            productCategory=productCategoryMapper.selectOne(wrapper);
            //System.out.println("-------------------------------------------------------------------------------------");

            //System.out.println(productCategory);
            if (productCategory!=null){
                productVO.setCategoryleveltwo(productCategoryMapper.selectOne(wrapper).getName());

            }
            wrapper=new QueryWrapper();

            wrapper.eq("id",product.getCategorylevelthreeId());
            productCategory=productCategoryMapper.selectOne(wrapper);
            if (productCategory!=null){
                productVO.setCategorylevelthree(productCategoryMapper.selectOne(wrapper).getName());

            }
            productVOList.add(productVO);
        }
        dataVO.setData(productVOList);
//        Product p =new Product();
//        p.setId(3);
//        p.setName("不良人手办");
//        productMapper.insert(p);
        return dataVO;
    }
}
