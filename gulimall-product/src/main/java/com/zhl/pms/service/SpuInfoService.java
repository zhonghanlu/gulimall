package com.zhl.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.pms.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:56:51
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

