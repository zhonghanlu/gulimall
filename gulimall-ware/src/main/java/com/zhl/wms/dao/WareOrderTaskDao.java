package com.zhl.wms.dao;

import com.zhl.wms.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 00:50:03
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
