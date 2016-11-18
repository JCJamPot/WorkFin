import java.util.*;

public class errors {

	

	public static int validateGame(){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("(c)ard or (d)ice game?");

		while(!sc.hasNext("[cCdD]")){
			System.out.println("Please enter (c)ard or (d)ice game!");
			sc.next();
		}
		if (sc.hasNext("[cC]")){
			return 1;
		}else{
			return 0;
		}
	}

	public static void nextLn(String prompt) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press <RETURN> to " + prompt);
		sc.nextLine();
	}

}