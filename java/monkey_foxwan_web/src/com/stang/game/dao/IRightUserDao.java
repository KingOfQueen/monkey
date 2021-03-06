package com.stang.game.dao;

import java.util.List;
import java.util.Map;

import com.stang.game.entity.detail.EntityRightUserDetail;

public interface IRightUserDao extends IEntityDao<EntityRightUserDetail> {

	public List<EntityRightUserDetail> findRightUserByMap(Map<String, Object> param);

	public int insertRightUserDetail(EntityRightUserDetail entity);

	public int updateRightUserDetail(EntityRightUserDetail entity);
	public EntityRightUserDetail findPasswordByRoleName(String uname);

	public int deleteRightUserDetail(int id);

}
