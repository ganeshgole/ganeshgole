import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class Demo {

	Scanner sc = new Scanner(System.in);
	Map<Integer, Reg> m = new TreeMap<>();
	Reg temp = new Reg();

	public void addBook() throws FileNotFoundException, IOException,
			ClassNotFoundException {
		FileOutputStream fout = new FileOutputStream("C://Java//addBook.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);

		System.out.println("Enter Id :");
		int id = sc.nextInt();

		System.out.println("Enter Book Name :");
		temp.BName = sc.next();

		System.out.println("Enter Book Author :");
		temp.BAuthor = sc.next();

		System.out.println("Enter Book Price :");
		temp.Price = sc.nextInt();

		m.put(id, temp);
		oout.writeObject(m);

		fout.close();
		oout.close();

	}

	public void viewBook() throws IOException, ClassNotFoundException {
		FileInputStream fin = new FileInputStream("C://Java//addBook.txt");
		ObjectInputStream oin = new ObjectInputStream(fin);

		m = (Map<Integer, Reg>) oin.readObject();

		System.out.println("Book Id" + "\t" + "BName" + "\t" + "BAuthor" + "\t"
				+ "Price");
		for (Entry<Integer, Reg> var : m.entrySet()) {
			int key = var.getKey();
			Reg value = var.getValue();
			System.out.println(key + "\t" + value.BName + "\t" + value.BAuthor
					+ "\t" + value.Price);

		}

		fin.close();
		oin.close();
	}
}