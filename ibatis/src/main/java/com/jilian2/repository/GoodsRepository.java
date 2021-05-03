package com.jilian2.repository;

import com.jilian2.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
