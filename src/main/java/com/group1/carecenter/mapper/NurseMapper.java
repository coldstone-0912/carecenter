package com.group1.carecenter.mapper;

import com.group1.carecenter.entity.Nurse;

public interface NurseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nurse record);

    int insertSelective(Nurse record);

    Nurse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nurse record);

    int updateByPrimaryKey(Nurse record);
}