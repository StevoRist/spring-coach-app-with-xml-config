package mk.iwec.springdemo;

public class HandballCoach implements Coach {
	private FortuneService fortuneService;
	// create new fields for email and team
	private String emailAdress;
	private String team;

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		System.out.println("HandballCoach: inside setter method - setEmailAdress");
		this.emailAdress = emailAdress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("HandballCoach: inside setter method - setTeam");
		this.team = team;
	}

	// create no-args constructor
	public HandballCoach() {
		System.out.println("HandballCoach: inside no-args constructor");
	}

// setter method called by spring when injecting dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("HandballCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {

		return "Work on game plan";
	}

	@Override
	public String getDailyFortune() {

		return "Are you deff? " + fortuneService.getFortune();
	}

}
