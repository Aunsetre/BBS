package com.aunsetre.mapper;

import com.aunsetre.pojo.ChildComment;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChildCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChildComment record);

    ChildComment selectByPrimaryKey(Integer id);

    List<ChildComment> selectAll();

    int updateByPrimaryKey(ChildComment record);
}