public class MoreVariablesAndPrinting {
	public static void main( String[] args ) {
		String name, eyes, teeth, hair;
		int age, height, weight;
		
		name = "Farbod Tajik";
		age = 16;
		height = 74;
		weight = 180;
		eyes = "Brown";
		teeth = "White";
		hair = "Black";
		
		System.out.println("Let's talk about " + name + ".");
		System.out.println("He's " + height + " inches tall. (or " + (height * 2.54) + " cm");
		System.out.println("He's " + weight + " lb heavy");
		System.out.println("Actually, that's not that heavy.");
		System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
		System.out.println("His teeth are usually " + teeth + " depending on the coffee.");
	}
}