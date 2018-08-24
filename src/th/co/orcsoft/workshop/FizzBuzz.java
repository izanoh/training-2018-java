package th.co.orcsoft.workshop;

public class FizzBuzz {

	public String say(int input) {

		Divide divideBy3 = new DivideBy3();
		Divide divideBy5 = new DivideBy5();

		Divide[] rules = {divideBy3, divideBy5};
		
		if(divideBy3.canDivide(input) && divideBy5.canDivide(input)) {
			return "FizzBuzz";
		}
		
		for (Divide rule : rules){
			if(rule.canDivide(input)){
				return rule.say(input);
			}
		}
		
		return String.valueOf(input);
	}
}

interface Divide {
	boolean canDivide(int input);
	String say(int input);
}

class DivideBy3 implements Divide{
	
	@Override
	public boolean canDivide(int input) {
		return input%3==0;
	}

	@Override
	public String say(int input) {
		if (canDivide(input)) {
			return "Fizz";
		} else {
			return String.valueOf(input);
		}
	}
}

class DivideBy5 implements Divide{
	
	@Override
	public boolean canDivide(int input) {
		return input%5==0;
	}

	@Override
	public String say(int input) {
		if (canDivide(input)) {
			return "Buzz";
		} else {
			return String.valueOf(input);
		}
	}
	
	
}

