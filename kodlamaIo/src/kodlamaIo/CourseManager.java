package kodlamaIo;

public class CourseManager {

	public void registerToCourse(Course course) {
		System.out.println(course.courseName + " kursuna kayıt oldunuz.");
	}
	
	public void getCourse(Course course) {
		System.out.println(course.courseName + " sayfası açıldı.");
	}
}
