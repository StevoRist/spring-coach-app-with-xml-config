package mk.iwec.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// check if this are the same beans
		boolean result = (theCoach == alphaCoach);
// print out the results
		System.out.println("\nPointing to the same result: " + result);
		System.out.println("\nMemory location for the coach: " + theCoach);
		System.out.println("\nMemory location for the alphacoach: " + alphaCoach + "\n");
		// close the context
		context.close();
	}

}
