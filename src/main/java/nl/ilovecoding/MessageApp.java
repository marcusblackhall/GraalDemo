package nl.ilovecoding;



import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class MessageApp {

	String callMethodOfClass(String className) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class<?> aClass = Class.forName("nl.ilovecoding." + className);

		Method name = aClass.getMethod("send");

		Object instance = aClass.getDeclaredConstructor().newInstance();
		return (String) name.invoke(instance);
	}

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

		if (args == null || args.length == 0 ){
			System.out.println("Provide a class name");
			System.exit(4);
		}
		String className = args[0];

	    MessageApp messageApp = new MessageApp();
		String message = messageApp.callMethodOfClass(className);
		System.out.println(message);


	}
	
}