package mk.iwec.springdemo;

public class App {

	public static void main(String[] args) {
		// create object
		Coach theCoach = new TrackCoach();

		// use the object
		System.out.println(theCoach.GetDailyWorkout());

	}

}
