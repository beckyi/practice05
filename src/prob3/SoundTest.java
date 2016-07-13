package prob3;

public class SoundTest {

	public static void main(String[] args) {
		System.out.println("실행결과");
		System.out.println("-----\n");
		printSound( new Cat() );
		printSound( new Dog() );
		printSound( new Sparrow() );
		printSound( new Duck() );
	}
	
	public static void printSound( Soundable soundable ) {
		System.out.println( soundable.sound() );
		
	}
}