package com.aunsetre.mapper;

import com.aunsetre.pojo.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Short uid);

    int insert(User record);

    User selectByPrimaryKey(Short uid);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}