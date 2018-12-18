package cn.lch.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lch.service.dao.impl.GoodsServiceDaoImpl;

@Controller
public class Controller01 {
	@Autowired
	private GoodsServiceDaoImpl service;
	
	@RequestMapping(value="/find.action",produces="application/json;charset=UTF-8")
	public String findGoodsController(){
		service.FindAllGoods();
		return "/j01.jsp";
	}
}
