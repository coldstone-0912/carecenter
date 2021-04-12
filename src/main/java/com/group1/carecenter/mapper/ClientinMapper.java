package com.group1.carecenter.mapper;

import com.group1.carecenter.entity.Clientin;

public interface ClientinMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Clientin record);

    int insertSelective(Clientin record);

    Clientin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Clientin record);

    int updateByPrimaryKey(Clientin record);
}