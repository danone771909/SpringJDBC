package spring.orm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:application-context-jdbc.xml"})
public class TestJDBC {
	
	@Autowired
	private ApplicationContext context;
	
	@Test
	public void testUserManagerCountAllUsers() {
	
		UserManager userManager = context.getBean(UserManager.class);	    
		Assert.assertNotNull(userManager);
		System.out.println(userManager.countAllUsers());
	}
}
