package com.udea.labfaker;

import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LabfakerApplicationTests {

	@Autowired
	DataController dataController;

	@Test
	void health() {
		assertEquals("HEALTH CHECK OK", dataController.healthCheck());
	}

	@Test
	void version() {
		assertEquals("VERSION IS 1.0.0", dataController.version());
	}

	@Test
	void nations() {
		Integer nationsLength = dataController.getRadomNations().size();
		assertEquals(10, nationsLength);
	}

	@Test
	void currenciesLength() {
		Integer currenciesLength = dataController.getRadomCurrencies().size();
		assertEquals(20, currenciesLength);
	}

	@Test
	public void randomCurrenciesCodeFormat() {
		DataController dataController = new DataController();
		JsonNode response = dataController.getRadomCurrencies();
		for(int i = 0; i < response.size(); i++){
			String code = response.get(i).get("code").asText();
			assertTrue(code.matches("[A-Z]{3}"));
		}
	}

	@Test
	public void testRandomNationsPerformance() {
		DataController dataController = new DataController();
		long start = System.currentTimeMillis();
		dataController.getRadomNations();
		long end = System.currentTimeMillis();
		long timeElapsed = end - start;
		System.out.println("Time elapsed: " + timeElapsed);
		assertTrue(timeElapsed < 2000);
	}

	@Test
	void aviationsLength() {
		Integer aviationsLength = dataController.getRadomAviation().size();
		assertEquals(20, aviationsLength);
	}
}
