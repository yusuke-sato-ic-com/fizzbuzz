package fizzBuzz;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {

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

	@Test
	public void testToFizzBuzz() {
		assertThat(FizzBuzz.toFizzBuzz(15), is("FizzBuzz"));
		assertThat(FizzBuzz.toFizzBuzz(1), is("1"));
		assertThat(FizzBuzz.toFizzBuzz(2), is("2"));
	}

	@Test
	public void testToFizz() {
        assertThat(FizzBuzz.toFizz(3), is("Fizz"));
    	assertThat(FizzBuzz.toFizzBuzz(1), is("1"));
		assertThat(FizzBuzz.toFizzBuzz(2), is("2"));
	}

	@Test
	public void testToBuzz() {
	    assertThat(FizzBuzz.toBuzz(5), is("Buzz"));
		assertThat(FizzBuzz.toFizzBuzz(1), is("1"));
		assertThat(FizzBuzz.toFizzBuzz(2), is("2"));
	}

}
