package chapter3;

public class GradeBook {
	
	
		// start 3.2 - 3.3
		// System.out.printf("Welcome To Grade Book for \n%s!\n",courseName);
		// end 3.2 - 3.3
		
	
		// Start 3.4
		private String courseName; 
		
		public void setCourseName( String name ) {
			courseName = name;
		}
		public String getCourseName() {
			return courseName;
		}
		public void displayMessage() {
			System.out.printf("Welcome to the grade book for\n%s!\n", getCourseName());
		}
		// End 3.4
}
