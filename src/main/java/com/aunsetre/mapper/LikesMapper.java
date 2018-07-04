package com.aunsetre.mapper;

import com.aunsetre.pojo.Likes;
import java.util.List;

public interface LikesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Likes record);

    Likes selectByPrimaryKey(Integer id);

    List<Likes> selectAll();

    int updateByPrimaryKey(Likes record);
}