package com.rszdm.spbtmbtsswg.service;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface BaseService<T> {

    Integer add(T t);

    Integer delete(int id);

    T queryById(int id);

    List<T> queryAll();

    Integer update(T t);
}
