package chapter4;

public class GradeBook01Test
{
	public static void main( String[] args )
	{
	   GradeBook01 myGradeBook = new GradeBook01(
	      "CS101 Introduction to Java Programming" );
	
	   myGradeBook.displayMessage();
	   myGradeBook.determineClassAverage();
	}
}

/* Example run

Welcome to the grade book for
CS101 Introduction to Java Programming!

Enter grade: 67
Enter grade: 78
Enter grade: 89
Enter grade: 67
Enter grade: 87
Enter grade: 98
Enter grade: 93
Enter grade: 85
Enter grade: 82
Enter grade: 100

Total of all 10 grades is 846
Class average is 84

*/

