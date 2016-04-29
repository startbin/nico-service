package com.asknico.demo.api.service;


import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asknico.demo.api.utils.RestUtils;
import com.asknico.demo.core.dao.UserMapper;
import com.asknico.demo.model.entities.User;

@Component
@Path("/users")
public class UserService {
	@Autowired
	private UserMapper userMapper;


	/**
	 * 后台
	 */
	@GET
	@Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	public Response getUsers() {
		return RestUtils.listObject2Response(userMapper.getUsers());
	}

	// 查询管理用户信息 List<User> list
	@POST
	@Path("list")
	@Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	@Consumes({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	public Response getUserList(User User) {
		return RestUtils.listObject2Response(userMapper.getUserList(User));
	}

	// 查询管理用户信息总数  count
	@GET
	@Path("count")
	@Produces({"application/json; charset=UTF-8","application/xml; charset=UTF-8"})
	@Consumes({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	public Response getUserCount() {
		return RestUtils.count2Response(userMapper.getUserCount());
	}

	// 单条查询  根据UserID 
	@GET
	@Path("{id}")
	@Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	public Response getUserByID(@PathParam("id") Integer id) {
		return RestUtils.obj2Response(userMapper.getUserByID(id));
	}

	// 单条查询  根据UserName
	@GET
	@Path("/username/{userName}")
	@Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	public Response getUserByUserName(@PathParam("userName") String userName) {
		return RestUtils.obj2Response(userMapper.getUserByUserName(userName));
	}


	// 单条删除管理用户
	@DELETE
	@Path("{id}")
	@Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
	@Transactional
	public Response deleteUserByID(@PathParam("id") Integer id) {
		return RestUtils.delete2Response(userMapper.deleteUserByID(id));
	}


	// 新增管理用户 
	@POST
	@Consumes({"application/json; charset=UTF-8","application/xml; charset=UTF-8"})
	@Produces({"application/json; charset=UTF-8","application/xml; charset=UTF-8"})
	@Transactional
	public Response createUser(User user) {
		return RestUtils.create2Response(userMapper.createUser(user));
	}


	// 修改管理用户  
	@PUT
	@Consumes({"application/json; charset=UTF-8","application/xml; charset=UTF-8"})
	@Produces({"application/json; charset=UTF-8","application/xml; charset=UTF-8"})
	@Transactional
	public Response updateUser(User user) {
		return RestUtils.update2Response(userMapper.updateUser(user));
	}
}
