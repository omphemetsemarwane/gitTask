import java.util.Scanner;
//this program prints out "Hello World"
public class helloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = input.nextLine();
		System.out.println("Your name is: " + name);
		
		// TODO Auto-generated method stub

	}

}
