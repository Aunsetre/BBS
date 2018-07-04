package com.aunsetre.mapper;

import com.aunsetre.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Article record);

    Article selectByPrimaryKey(Integer aid);

    List<Article> selectAll();

    int updateByPrimaryKey(Article record);
}