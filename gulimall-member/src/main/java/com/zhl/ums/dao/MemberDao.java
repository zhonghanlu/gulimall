package com.zhl.ums.dao;

import com.zhl.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hanlu.zhong
 * @email zhonghanlu.club
 * @date 2022-11-28 01:42:44
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
