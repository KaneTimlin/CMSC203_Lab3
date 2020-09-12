import java.util.Scanner;

/**
 * 
 * @author Kane Timlin
 *
 */

public class MovieDriver {


	/**
	 * The main method
	 */
	public static void main(String[] args) {
		String userInput;
		Movie movie = new Movie();
		Scanner input = new Scanner(System.in);
		do {
			
			printMovie(movie, input);
			System.out.println("Do you want to enter another? (yes or no)");
			input.nextLine();
			userInput = input.nextLine().toLowerCase();
			
		} while (userInput.equals("yes"));
		System.out.println("Thank you for using my program!!");
	}
	
	/**
	 * @param movie a movie object
	 * @param input the user's input object, to get input from the command line
	 */
	
	public static void printMovie(Movie movie, Scanner input) {		
		

		System.out.println("Enter the name of a movie");
		movie.setTitle(input.nextLine());
		System.out.println("Enter the rating of the movie (eg PG13)");
		movie.setRating(input.nextLine());
		System.out.println("Enter the number of tickets sold for this movie");
		movie.setSoldTickets(input.nextInt());
		System.out.println(movie.toString());
	}
}
