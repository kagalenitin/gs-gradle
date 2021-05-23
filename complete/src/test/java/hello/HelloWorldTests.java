package hello;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class HelloWorldTests {

	private ByteArrayOutputStream baos = new ByteArrayOutputStream();
	private PrintStream ps = new PrintStream(baos);

	@Before
	public void setup() {
		System.setOut(ps);
	}

	@Test
	public void shouldPrintTimeToConsole() {
		HelloWorld.main(new String[] { });

		assertThat(output(), containsString("The current local time is"));
	}

	@Test
	public void shouldPrintHelloWorldToConsole() {
		HelloWorld.main(new String[] { });

		assertThat(output(), containsString("Hello world!"));
	}

	@Test
	public void shouldPrintAddition() {
		HelloWorld.main(new String[] { });
		assertThat(output(), containsString("7"));
	}

	@Test
	public void shouldPrintWrongAddition() {
		assertNotEquals(4, new Greeter().addition(5, 4));
	}
	private String output() {
		return new String(baos.toByteArray(), StandardCharsets.UTF_8);
	}
}
