package com.test.gitjenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)
@SpringBootTest
class GitJenkinsApplicationTests {
	public static Logger log = LoggerFactory.getLogger(GitJenkinsApplication.class);
	@Test
	void contextLoads() {
		log.info("Test case executing....");
		assertEquals(true, true);
	}

}
