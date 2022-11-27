package com.zhl.oms.dao;

import com.zhl.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:46:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
