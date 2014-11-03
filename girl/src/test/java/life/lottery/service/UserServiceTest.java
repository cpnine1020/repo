package life.lottery.service;

import life.lottery.service.UserService;

import org.hamcrest.Matchers;
import org.junit.Assert;
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
		Assert.assertThat(userService.verifyPwdByEmail("test@foxmail.com", "test"),Matchers.is(true));
	}
}
