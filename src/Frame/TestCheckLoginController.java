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
		
		assertTrue(result);
	}
	
	@Test
	void testLoginFailed() {
		
		
	String result=controller.checkLoginNull("aaaa","12345",null);
		assertTrue(result=="Not have");
	}
	
	


}
