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
		controller = new ChecKCalController();
	}

	@AfterEach
	void tearDown() throws Exception {
		controller=null;
	}

	@Test
	void testCalPassed() {
		boolean result=controller.checkCal("123");
		
		assertTrue(result);
	}
	

	@Test
	void testCalFailed() {
		
		
	double result=controller.checkNotNum("abc");
	
		assertTrue(result==0);
	}

	

	@Test
	void testCalNull() {
		
		
	double result=controller.checkNull(null);
	
		assertTrue(result==0);
	}
	
	@Test
	void testCalNotHaveWord() {
		
		
	double result=controller.checkNotHaveWord("");
	
		assertTrue(result==0);
	}
}
