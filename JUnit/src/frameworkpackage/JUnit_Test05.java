package frameworkpackage;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class JUnit_Test05 {

	/*
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	*/
	
	public String name;
	public int age;
	public JUnit_Test05(String name, int age)

	{
		this.name = name;
		this.age = age;
	}
	@Test
	public void test() {
		System.out.println("Name: "+ name + "\n Age: "+ age);
    }
	@Parameters
	public static Collection<Object[]> parameter() {
		Object[][]  data = new Object[3][2];
		
		data[0][0] = "Anusha";
		data[0][1] = 35;
		data[1][0] = "Harini";
		data[1][1] = 5;
		data[2][0] = "Hari";
		data[2][1] = 36;
		return Arrays.asList(data);
		
	}

}
