package kodlamaIo;

public class StudentManager extends UserManager{

	public void registerToCourse(Student student, String course) {
		String [] courses =student.getRegisteredCourses();
		System.out.println(student.getName() + " " + course + " kursuna kaydoldu.");
		int length=student.getRegisteredCourses().length;
		String newArray[] =new String[length + 1];
		
		for (int i = 0; i < length; i++)
            newArray[i] = courses[i];
  
        newArray[length] = course;
        
        student.setRegisteredCourses(newArray);
	}
	
	public void addComment(Student student,String message) {
		System.out.println(student.getName() + message);
	}
	
	public void updateComment(Student student,String message) {
		System.out.println("Yorum güncellendi. " + student.getName() + message);
	}
	
	public void myCourses(Student student,String message) {
		System.out.println("Kurslarım");
		for (String registeredCourse: student.getRegisteredCourses()) {
			System.out.println(registeredCourse);
		}
	}
}