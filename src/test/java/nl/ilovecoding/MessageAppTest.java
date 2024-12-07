package nl.ilovecoding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

class MessageAppTest {


	@Test
	@DisplayName("Execute a test with native image")
	void shouldAnswerWithTrue() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

		MessageApp messageApp = new MessageApp();
		String msg =  messageApp.callMethodOfClass("MeanMessage");
		assertEquals("I am mean",msg);


	}
}
