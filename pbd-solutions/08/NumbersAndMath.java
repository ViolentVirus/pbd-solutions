public class NumbersAndMath
{
	public static void main( String[] args )
	{
		// It's saying that it will now count its chickens
		System.out.println( "I will now count my chickens:" );
        // It's saying "Hens" then doing math
		System.out.println( "Hens " + ( 25.0 + 30.0 / 6.0 ) );
		// It's saying "Roosters" then doing math
		System.out.println( "Roosters " + ( 100.0 - 25.0 * 3.0 % 4.0 ) );
		// It's saying it will count the eggs
		System.out.println( "Now I will count the eggs:" );
		// It's doing math
		System.out.println( 3.0 + 2.0 + 1.0 - 5.0 + 4.0 % 2.0 - 1.0 / 4.0 + 6.0 );
		// It's asking if 3+2<5-7
		System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
		// It's doing math
		System.out.println( 3.0 + 2.0 < 5.0 - 7.0 );
		// It's asking what is 3+2
		System.out.println( "What is 3 + 2? " + ( 3.0 + 2.0 ) );
		// It's asking what is 5-7
		System.out.println( "What is 5 - 7? " + ( 5.0 - 7.0 ) );
		// It's saying that's why its false
		System.out.println( "Oh, that's why it's false." );
		// It's saying how about some more
		System.out.println( "How about some more." );
		// It's asking if its greater and doing math
		System.out.println( "Is it greater? " + ( 5.0 > -2.0 ) );
		// It's asking if its greater or equal and doing math
		System.out.println( "Is it greater or equal? " + ( 5.0 >= -2.0 ) );
		// It's asking if its less or equal and doing math
		System.out.println( "Is it less or equal? " + ( 5.0 <= -2.0 ) );
	}
}