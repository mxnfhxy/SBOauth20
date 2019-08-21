package com.rszdm.spbtmbtsswg.dao;

import com.rszdm.spbtmbtsswg.entity.Casio;

import java.util.List;

public interface CasioMapper {
    int deleteByPrimaryKey(Integer objectid);

    int insert(Casio record);

    int insertSelective(Casio record);

    Casio selectByPrimaryKey(Integer objectid);

    int updateByPrimaryKeySelective(Casio record);

    int updateByPrimaryKey(Casio record);

    List<Casio> queryAll();
}