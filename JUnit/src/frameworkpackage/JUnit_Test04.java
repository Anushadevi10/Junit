package frameworkpackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit_Test04 {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test Print");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Test Print");
	}

	@Test
	public void test() {
		System.out.println("During Test");
	}

}
