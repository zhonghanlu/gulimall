package com.zhl.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.pms.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:56:51
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

