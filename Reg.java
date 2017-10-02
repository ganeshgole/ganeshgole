import java.io.Serializable;

public class Reg implements Serializable {

	
	String BName;
	String BAuthor;
	int Price;
	
	       public Reg()
	       {
	    	   
	       }
	
	
	public Reg(String BName, String BAuthor, int Price) {
		this.BName=(String) BName;
		this.BAuthor=BAuthor;
		this.Price=Price;

		
	}
	
}
