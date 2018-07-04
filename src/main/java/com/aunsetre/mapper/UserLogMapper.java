package com.aunsetre.mapper;

import com.aunsetre.pojo.UserLog;
import java.util.List;

public interface UserLogMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(UserLog record);

    UserLog selectByPrimaryKey(Integer lid);

    List<UserLog> selectAll();

    int updateByPrimaryKey(UserLog record);
}