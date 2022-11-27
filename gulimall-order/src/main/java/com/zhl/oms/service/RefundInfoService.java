package com.zhl.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.oms.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:46:15
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

