package com.cxl.cxlmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cxl.cxlmall.product.entity.BrandEntity;
import com.cxl.cxlmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CxlmallProductApplicationTests {

    @Autowired
    BrandService service;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("华为");
//        service.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> list = service.list(new QueryWrapper<BrandEntity>().eq("name", "华为"));
        list.forEach((item)->{
            System.out.println(item);
        });

    }

}
