package com.zhl.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.wms.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 00:50:03
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

