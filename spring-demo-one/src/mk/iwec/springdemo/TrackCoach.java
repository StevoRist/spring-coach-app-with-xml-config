package mk.iwec.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;

	public TrackCoach() {

	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String GetDailyWorkout() {

		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {

		return "Come on you bastard " + fortuneService.getFortune();
	}

}
