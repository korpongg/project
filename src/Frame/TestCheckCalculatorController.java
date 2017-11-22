package Frame;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCheckCalculatorController {
	private ChecKCalController controller ;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalPassed() {
		//boolean result=controller.checkCal(a)("aaaa","12345", new File("filename.txt"));
		
		assertTrue(result == true);
	}

}
