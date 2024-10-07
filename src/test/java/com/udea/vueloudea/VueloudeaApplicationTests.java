package com.udea.vueloudea;

import com.udea.vueloudea.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class VueloudeaApplicationTests {

	@Autowired
	UserController userController;

	@Test
	void testHealthCheck() {
		UserController userController = new UserController();
		String response = userController.healthCheck();
		assertEquals("PROYECTO ACTIVO.-...", response);
	}
}

