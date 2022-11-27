package com.zhl.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhl.common.utils.PageUtils;
import com.zhl.ums.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:42:44
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

