package exceptionstests;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;

import static org.hamcrest.CoreMatchers.is;

public class ItestTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentException() {
		new Itest().getIllegalArgumentException();
	}
	
	@Test
	public void testExceptionMessage() {
		try {
			new Itest().getIllegalArgumentException();
		} catch (IllegalArgumentException e) {
			assertThat(e.getMessage(), is ("exception message"));
		}
	}
	
	// exception test with rule doesnt work
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testExpectedException() throws IllegalArgumentException {
		new Itest().getIllegalArgumentException();
		
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage(Matchers.containsString("exception message"));
		
	}
}
