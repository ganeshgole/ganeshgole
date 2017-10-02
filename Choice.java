import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Choice {

	static Scanner sc = new Scanner(System.in);
	
		Demo d=new Demo();
	
	public void choice() throws FileNotFoundException, ClassNotFoundException, IOException {
		//try {
		System.out.println("Enter Your Choice :");
		System.out.println(
				"1.Display Available Books : \n2.Add Book\n3.Delete Book\n4.Issue Book\n5.View Issued Book\n6.Return Book\n0.For Exit");
		int ch = sc.nextInt();

		switch (ch) {

		case 1:
			System.out.println("Available Book");
			d.viewBook();
			break;
		case 2:
			System.out.println("Add Book");
			d.addBook();
			break;
		case 3:
			System.out.println("Delete Book");
			break;
		case 4:
			System.out.println("Issue Book");
			break;
		case 5:
			System.out.println("View Issued Book");
			break;
		case 6:
			System.out.println("Return Book");
			break;
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("Enter Valid Choice");
				//Choice.choice();
				break;
		}
	//}catch(Exception e) {
		//System.out.println("Please Enter Valid Choice :");
		//System.out.println("Enter Choice Between 0 to 6");
	//	Choice.choice();
	//}
	}
}
