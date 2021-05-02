package kodlamaIo;

public class Student extends User{

	private String [] registeredCourses;
	
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
}