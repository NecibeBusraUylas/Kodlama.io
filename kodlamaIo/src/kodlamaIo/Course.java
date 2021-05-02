package kodlamaIo;

public class Course {
	
	int id;
	String courseName;
	String instructor;
	int completionRate;
	
	public Course(int id,String courseName,String instructor,int completionRate) {
		
		this.id=id;
		this.courseName=courseName;
		this.instructor=instructor;
		this.completionRate=completionRate;
	}
}
