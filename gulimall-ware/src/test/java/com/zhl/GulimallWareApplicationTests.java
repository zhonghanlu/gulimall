package com.zhl;

import com.zhl.wms.entity.WareInfoEntity;
import com.zhl.wms.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    WareInfoService wareInfoService;

    @Test
    void contextLoads() {

        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setAddress("测试");
        wareInfoService.save(wareInfoEntity);
        System.out.println("操作成功");

    }

}
