package th.co.orcsoft.workshop;

public class FizzBuzzExample {
	public static void main(String[] args) {
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(fizzBuzz.say(i));
		}
	}
}
