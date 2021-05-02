package kodlamaIo;

public class Instructor extends User{
	
	private String[] courses;
	private int yearOfExperience;
	private String areaOfProfession;
	
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public String getAreaOfProfession() {
		return areaOfProfession;
	}
	public void setAreaOfProfession(String areaOfProfession) {
		this.areaOfProfession = areaOfProfession;
	} 
}