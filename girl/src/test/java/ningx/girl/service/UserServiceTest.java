package ningx.girl.service;

import ningx.girl.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring-mvc.xml"})
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void verifyPwdByEmail(){
		System.out.println(userService.verifyPwdByEmail("ningxiao1020@foxmail.com", "112233"));
	}
}
