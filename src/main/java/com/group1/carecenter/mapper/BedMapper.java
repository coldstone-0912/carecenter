package com.group1.carecenter.mapper;

import com.group1.carecenter.entity.Bed;

public interface BedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}