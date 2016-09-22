package springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

import springboot.model.User;

@RestController
@RequestMapping(value = "/users")
public class SwaggerController {

	@ApiOperation(value = "Get all users", notes = "获取所有用户")
	@RequestMapping(method = RequestMethod.GET)
	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();

		User user = new User();
		user.setName("hello");
		list.add(user);

		User user2 = new User();
		user.setName("world");
		list.add(user2);
		return list;
	}

	@ApiOperation(value = "Get user with id", notes = "根据用户名 查询 用户")
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public User getUserById(@PathVariable String name) {
		User user = new User();
		user.setName("hello world");
		return user;
	}

}
