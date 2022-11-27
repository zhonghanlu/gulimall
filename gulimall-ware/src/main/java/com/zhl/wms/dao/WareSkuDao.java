package com.zhl.wms.dao;

import com.zhl.wms.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 00:50:03
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
