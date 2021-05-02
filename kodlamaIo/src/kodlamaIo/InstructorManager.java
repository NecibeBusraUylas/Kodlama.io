package kodlamaIo;

public class InstructorManager extends UserManager{

	public void addNewCourse(Instructor instructor,String course) {
		String [] courses =instructor.getCourses();
		System.out.println("Ýsim Soyisim: " + instructor.getName() + "sisteme yeni kurs ekledi.");
		int length=instructor.getCourses().length;
		String newArray[] =new String[length + 1];
		
		for (int i = 0; i < length; i++)
            newArray[i] = courses[i];
  
        newArray[length] = course;
        
        instructor.setCourses(newArray);
	}
}