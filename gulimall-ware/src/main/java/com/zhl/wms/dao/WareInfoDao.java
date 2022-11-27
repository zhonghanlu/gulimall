package com.zhl.wms.dao;

import com.zhl.wms.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 00:50:03
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
