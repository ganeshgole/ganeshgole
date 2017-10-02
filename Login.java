import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Login {

	static Scanner sc = new Scanner(System.in);
    Librarian ob=new Librarian();

    public  void loginAdmin() throws FileNotFoundException, ClassNotFoundException, IOException {

		System.out.println("Enter Username : ");
		String user = sc.next();
		System.out.println("Enter Password : ");
		String pass = sc.next();

		if (user.equals("admin") && pass.equals("admin123")) {

			System.out.println("Login Successfull");
			System.out.println("Proceed Furthur :\n\n");
			
			System.out.println("Enter Choice :\n1.To Add Librarian :\n2.View Librarian");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:
				ob.addLibrarian();
				break;
			case 2:
			     ob.viewLibrarian();
			}
			
			
			

		} else {
			System.out.println("Login Failed");
		}

	}

	public void MainChoice() throws FileNotFoundException, ClassNotFoundException, IOException {
		
		Login kk=new Login();
		System.out.println("Enter Your Choice :");
		System.out.println("1.Admin Login\n2.Librarian Login");
		int LL=sc.nextInt();
		
		switch(LL) {
		case 1:
			System.out.println("Admin Login :");
			kk.loginAdmin();

			break;
		case 2:
			System.out.println("Librarian Login:");
		    ob.Llogin();
				
	
	}
}
}