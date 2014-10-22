package ningx.girl.service;

import ningx.girl.dao.UserMapper;
import ningx.girl.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 根据邮箱校验密码
	 * @param email 
	 * @param password
	 * @return true:校验成功   false:校验失败
	 */
	public boolean verifyPwdByEmail(String email,String password){
		User user = userMapper.selectByEmail(email);
		if (user!=null&&user.getPassword().equals(password)){
			return true;
		}
		return false;
	}
}
