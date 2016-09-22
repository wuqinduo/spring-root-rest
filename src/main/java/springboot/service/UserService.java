package springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.mapper.UserMapper;
import springboot.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserInfo(){
		User user = userMapper.findUserInfo();
		return user;
	}
}
