package com.aunsetre.mapper;

import com.aunsetre.pojo.Classfyonarticletype;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClassfyonarticletypeMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Classfyonarticletype record);

    Classfyonarticletype selectByPrimaryKey(Integer cid);

    List<Classfyonarticletype> selectAll();

    int updateByPrimaryKey(Classfyonarticletype record);
}