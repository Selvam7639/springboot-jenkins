package com.tamil.springbootjenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing...");
		logger.info("Test case executing2...");
		Assertions.assertTrue(true);
	}

}
