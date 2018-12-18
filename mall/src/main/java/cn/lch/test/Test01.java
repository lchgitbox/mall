package cn.lch.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.lch.entity.Goods;
import cn.lch.service.dao.impl.GoodsServiceDaoImpl;

public class Test01 {
	public static void main(String[] args) {			
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*String[] name= context.getBeanDefinitionNames();
	    for (String s : name) {
			System.out.println(s);
		}
		*/
		
		GoodsServiceDaoImpl service =  context.getBean(GoodsServiceDaoImpl.class);
		
		List<Goods> list = service.FindAllGoods();
		
		System.out.println(list.get(0).getName());
	}
}
