package com.devopsbuddy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.devopsbuddy.web.i18n.I18NService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DevopsbuddyApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private I18NService i18nService;
	
	public void testMessageByLocaleService() {
		
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		
		String actual = i18nService.getMessage(messageId);
		assertThat(expectedResult,is(actual));
	}
	

}
