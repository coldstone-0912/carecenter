package com.group1.carecenter.mapper;

import com.group1.carecenter.entity.UserLeave;

public interface UserLeaveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLeave record);

    int insertSelective(UserLeave record);

    UserLeave selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserLeave record);

    int updateByPrimaryKey(UserLeave record);
}