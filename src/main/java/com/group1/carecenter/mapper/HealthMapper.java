package com.group1.carecenter.mapper;

import com.group1.carecenter.entity.Health;

public interface HealthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Health record);

    int insertSelective(Health record);

    Health selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Health record);

    int updateByPrimaryKey(Health record);
}