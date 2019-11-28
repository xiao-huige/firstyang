package cn.com.ssm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import cn.com.ssm.po.UserCustom;
import cn.com.ssm.service.ItemsService;

@Controller
//为了对url进行分类化管理，定义一个根路径，最终访问url是根路径+子路径
@RequestMapping("/items")
public class ItemsController {
    @Autowired
	private ItemsService itemsService;

	@RequestMapping(value="/queryItems",method = {RequestMethod.GET,RequestMethod.GET})
	public void handleRequest1(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<UserCustom> userList = itemsService.findUserList(null);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		Gson gson=new Gson();
		String json = gson.toJson(userList);
		
		writer.write(json);		
	}
	@RequestMapping(value="/queryItemsById",method = RequestMethod.GET)
	public void handleRequest2(HttpServletRequest request, HttpServletResponse response,Integer id)
			throws ServletException, IOException {
		
		 UserCustom user = itemsService.findUserById(1);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		Gson gson=new Gson();
		String json = gson.toJson(user);
		writer.write(json);	
		
	}
	//商品信息修改
	@RequestMapping("/updateUser.action")
	public void handleRequest3(HttpServletRequest request, HttpServletResponse response,@RequestParam("id") Integer iddda,@RequestBody  UserCustom userCustom)
			throws ServletException, IOException {
		userCustom.setId(1);
		userCustom.setName("lllaaa");
		userCustom.setSex("man");
		itemsService.updateUser(iddda,userCustom);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.write(Boolean.toString(true));		
	}
}
