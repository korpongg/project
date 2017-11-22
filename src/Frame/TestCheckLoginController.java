package Frame;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCheckLoginController {
	private ChecKLoginController controller ;
	@BeforeEach
	void setUp() throws Exception {
		controller = new ChecKLoginController();
	}

	@AfterEach
	void tearDown() throws Exception {
		controller = null;
	}

	@Test
	void testLoginPassed() {
		
		
		boolean result=controller.checkLogin("aaaa","12345", new File("filename.txt"));
		
		assertTrue(result == true);
	}
	
	@Test
	void testLoginFailed() {
		
		
		boolean result=controller.checkLogin("ssss","9999", new File("filename.txt"));
		
		assertTrue(result == false);
	}

}
