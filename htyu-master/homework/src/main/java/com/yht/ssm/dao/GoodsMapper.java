package com.yht.ssm.dao;

import java.util.List;

import com.yht.ssm.model.Goods;

public interface GoodsMapper {
	
	int insert(Goods goods);
	
	int deleteById(int id);
	
	int updateById(int id); 
	
	Goods selectById(int id);
	
	List<Goods> findAll();

}
