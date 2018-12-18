package cn.lch.service.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.lch.dao.GoodsDao;
import cn.lch.entity.Goods;
import cn.lch.service.dao.GoodsServiceDao;

@Component
public class GoodsServiceDaoImpl implements GoodsServiceDao{
	
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> FindAllGoods() {
		
		return dao.FindAllGoods();
	}
	
	
}
