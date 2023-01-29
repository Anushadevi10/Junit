package frameworkpackage;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnit_Test03 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("In before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("In after class");

	}

	@Test
	public void test() {
		System.out.println("In test");

	}
	@Test
	public void test1() {
		System.out.println("In test1");

	}

}
