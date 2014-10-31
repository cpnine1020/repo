package ningx.girl.service;

import ningx.girl.dao.UserMapper;
import ningx.girl.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 根据邮箱验证密码
	 * @param email 
	 * @param password
	 * @return true:验证通过  false:验证失败
	 */
	@Transactional(readOnly = true)
	public boolean verifyPwdByEmail(String email,String password){
		User user = userMapper.selectByEmail(email);
		if (user!=null&&user.getPassword().equals(password)){
			return true;
		}
		return false;
	}
}
