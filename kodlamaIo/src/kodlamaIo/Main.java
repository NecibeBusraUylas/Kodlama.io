package kodlamaIo;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setName("Büþra Uylaþ");
		student.setEmail("busra@email.com");
		student.setPassword("12345");
		String[] courses=new String[1];
		courses[0]="C#- ANGULAR";
		student.setRegisteredCourses(courses);
		
		StudentManager studentManager= new StudentManager();
		studentManager.add(student);

		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Engin Demiroð");
		instructor.setEmail("engin@email.com");
		student.setPassword("12345");
		String[] courses2=new String[1];
		courses[0]="C#- ANGULAR";
		instructor.setCourses(courses2);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
		studentManager.signIn(student);
		System.out.println("Öðrenci: " + student.getName() + " Kurslarý");
		String[] registeredCourses=student.getRegisteredCourses();
		for (String registeredCourse:registeredCourses) {
		System.out.println(registeredCourse);
		}	
		studentManager.registerToCourse(student, "JAVA- REACT");
		System.out.println("Öðrenci: " + student.getName() + " Kurslarý");
		String[] registeredCourses2=student.getRegisteredCourses();
		for (String registeredCourse:registeredCourses2) {
		System.out.println(registeredCourse);
		}	
		studentManager.sigOut(student);
		
		
//		 Course course1 = new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)","Engin Demirog",100);
//	     Course course2 = new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý(Java +React)","Engin Demirog",32);     
//	     Course[] courses= {course1,course2};   	     
//	     System.out.println("---Kurslar---");
//	     for(Course course:courses) {
//	    	 System.out.println("Id: " + course.id);
//	    	 System.out.println("Kurs Adý: " + course.courseName);
//	    	 System.out.println("Eðitmen: " + course.instructor);
//	    	 System.out.println("Tamamlanma Oraný: " + course.completionRate);
//	    	 System.out.println();
//	     }	    
//	        
//		Category category1= new Category(1,"Kurslarým");
//		Category category2= new Category(2,"Tüm Kurslar");
//		Category category3= new Category(3,"Kampa Hazýrlýk");
//		Category category4= new Category(4,"Sýkça Sorulan Sorular");
//		Category[] categories= {category1,category2,category3,category4};		
//		System.out.println("---Kategoriler---");
//		for(Category category:categories) {
//	    	 System.out.println("Id: " + category.id);
//	    	 System.out.println("Kategori Adý: " + category.categoryName);
//	    	 System.out.println();
//	     }
//		
//		CourseManager courseManager = new CourseManager();
//		courseManager.registerToCourse(course1);
//		courseManager.getCourse(course1);
//		System.out.println();
//		
//		CategoryManager categoryManager=new CategoryManager();
//		categoryManager.getCategory(category1);
	}
}
