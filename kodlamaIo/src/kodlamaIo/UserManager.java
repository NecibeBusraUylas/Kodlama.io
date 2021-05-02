package kodlamaIo;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: " + user.getName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi: " + user.getName());
	}
	
	public void signIn(User user) {
		System.out.println( user.getId() + " " + user.getName() + " kullan�c� sisteme giri� yapt�.");
	}
	
	public void sigOut(User user) {
		System.out.println( user.getId() + " " + user.getName() + " kullan�c� sistemden ��k�� yapt�.");
	}
}