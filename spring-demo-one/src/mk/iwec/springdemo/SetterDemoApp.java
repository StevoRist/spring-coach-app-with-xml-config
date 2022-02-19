package mk.iwec.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		HandballCoach theCoach = context.getBean("myHandballCoach", HandballCoach.class);
		// call methods on the bean(later!)
		System.out.println(theCoach.GetDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//call methods for literal values
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		// close the context(optional)
		
		context.close();

	}

}
