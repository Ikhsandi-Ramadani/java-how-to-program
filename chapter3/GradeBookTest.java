package chapter3;
import java.util.Scanner;

public class GradeBookTest {

	public static void main( String[] args) {
		// start 3.2 - 3.3
//		Scanner input = new Scanner( System.in );
//		GradeBook myGradeBook = new GradeBook();
//		
//		System.out.println("Please enter the course name: ");
//		String nameOfCourse = input.nextLine();
//		System.out.println();
//		
//		myGradeBook.displayMessage(nameOfCourse);
		// end 3.2 - 3.3
		
		// Start 3.4 - 3.8
		Scanner input = new Scanner( System.in );
		GradeBook myGradeBook = new GradeBook();
		
		System.out.printf("Initial course name is: %s\n\n", myGradeBook.getCourseName());
		
		System.out.println("Please enter the course name: ");
		String theName = input.nextLine();
		myGradeBook.setCourseName(theName);
		System.out.println();
		
		myGradeBook.displayMessage();
		// End 3.4 - 3.8
	}
}
