package com.zhl.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.wms.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 00:50:03
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

