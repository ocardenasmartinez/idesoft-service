package cl.marino.idesoftservice.controllers;

import cl.marino.idesoftservice.context.ControllerContextTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ControllerContextTest.class)
class ControllerTest {

	public static final String RECOLETA = "RECOLETA";

	@Autowired
	public Controller controller;

	@Test
	void test() {
		assertThat(controller.getLocales(RECOLETA)).isNotNull();
	}

}
