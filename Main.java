import java.util.Scanner;
public class Main
{ public static String name,hobby;
	public static void main(String[] args) {
		System.out.println("Hello I am Chatbot");
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scanner.nextLine();
		System.out.println("Hi " + name);
		System.out.println("What do u do for fun?");
		hobby = scanner.nextLine();
	if(hobby.equals("cooking")){
		    System.out.println(name + " Wow, u'll be a great Chef!");
		}else if(hobby.equals("dancing")){
		    System.out.println(name + " Mmmh u got the moves...");
		}else if(hobby.equals("Watching movies")){
		    System.out.println(name +" You will become lazy");
		}else{
		    System.out.println(name + " U are very interesting..");
		}
	}
}