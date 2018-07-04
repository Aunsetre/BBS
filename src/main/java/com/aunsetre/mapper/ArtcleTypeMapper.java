package com.aunsetre.mapper;

import com.aunsetre.pojo.ArtcleType;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArtcleTypeMapper {
    int deleteByPrimaryKey(Short atid);

    int insert(ArtcleType record);

    ArtcleType selectByPrimaryKey(Short atid);

    List<ArtcleType> selectAll();

    int updateByPrimaryKey(ArtcleType record);
}