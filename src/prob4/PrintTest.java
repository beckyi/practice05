package prob4;

public class PrintTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		System.out.println("실행결과");
		System.out.println("-----\n");
		
		printer.println( 10 );
		printer.println( true );
		printer.println( 5.7 );
		printer.println( "홍길동" );

		
	}
}
