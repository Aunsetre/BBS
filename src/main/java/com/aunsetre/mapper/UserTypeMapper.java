package com.aunsetre.mapper;

import com.aunsetre.pojo.UserType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserTypeMapper {
    int deleteByPrimaryKey(Short utypeid);

    int insert(UserType record);

    UserType selectByPrimaryKey(Short utypeid);

    List<UserType> selectAll();

    int updateByPrimaryKey(UserType record);
}