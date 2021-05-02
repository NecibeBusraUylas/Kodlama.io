package kodlamaIo;

public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: " + user.getName());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi: " + user.getName());
	}
	
	public void signIn(User user) {
		System.out.println( user.getId() + " " + user.getName() + " kullanýcý sisteme giriþ yaptý.");
	}
	
	public void sigOut(User user) {
		System.out.println( user.getId() + " " + user.getName() + " kullanýcý sistemden çýkýþ yaptý.");
	}
}