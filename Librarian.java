import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

 class Lib
{
	int Lid;
	String Lname;
}
	 


public class Librarian {
	Scanner sc = new Scanner(System.in);
	File f1 = new File("C://Java//Librarian.txt");
	Map<Integer, String> m = new TreeMap<>();
    Lib temp=new Lib();    
	Choice ch=new Choice();
	public void addLibrarian() throws IOException {

		FileOutputStream fout1 = new FileOutputStream(f1);
		ObjectOutputStream oout1 = new ObjectOutputStream(fout1);
		
			System.out.println("Enter Librarian ID :");
			temp.Lid = sc.nextInt();
			System.out.println("Add Librarian Name");
			temp.Lname = sc.next();

			if (m.containsKey(temp.Lid)) {
				System.out.println("Librarian Already Added");
				
			} else {
				m.put(temp.Lid, temp.Lname);
				oout1.writeObject(m);
			}
	
		}

	

	public  void Llogin() throws FileNotFoundException,
			ClassNotFoundException, IOException {

		System.out.println("Enter Login ID :");
		int Lid1 = sc.nextInt();

		System.out.println("Enter Login Name :");
		String Lname1 = sc.next();

		FileInputStream fin1 = new FileInputStream(f1);
		ObjectInputStream oin1 = new ObjectInputStream(fin1);

		m =  (Map<Integer, String>) oin1.readObject();
		System.out.println("Librarian ID" + "\t" + "Librarian Name");
		for (Map.Entry<Integer, String> var : m.entrySet()) {
     		if (m.containsKey(Lid1) && m.containsValue(Lname1)) {
			ch.choice();
		}
	}
	}
	
	public void viewLibrarian() throws IOException,
			ClassNotFoundException {
	
		FileInputStream fin1 = new FileInputStream(f1);
		ObjectInputStream oin1 = new ObjectInputStream(fin1);

		m =  (Map<Integer, String>) oin1.readObject();
		System.out.println("Librarian ID" + "\t" + "Librarian Name");
		for (Map.Entry<Integer, String> var : m.entrySet()) {
			int key = var.getKey();
			String value = var.getValue();
			System.out.println(key + " " + value);

		}

	}

}
