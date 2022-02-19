package mk.iwec.springdemo;

public class FootballCoach implements Coach {
	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {

		return "Train penalties";
	}

	@Override
	public String getDailyFortune() {

		return "Just do it " + fortuneService.getFortune();
	}

}
