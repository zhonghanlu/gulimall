package com.zhl.sms.dao;

import com.zhl.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:38:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
