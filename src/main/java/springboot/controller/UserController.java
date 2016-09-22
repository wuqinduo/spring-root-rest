package springboot.controller;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.ApiOperation;

import springboot.model.User;
import springboot.service.UserService;

@Controller
public class UserController {

	private Logger logger =    Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value = "getUserInfo", notes = "获取用户信息")
	@RequestMapping("/getUserInfo")
    @ResponseBody
	public User getUerInfo(){
		User user = userService.getUserInfo();
		if(user!= null){
			System.out.println(user.toString());
			logger.info("user:"+user);
		}
		return user;
	}
}
