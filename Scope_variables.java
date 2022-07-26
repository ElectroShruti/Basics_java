package basic_java;

public class Scope_variables {
	public String pName;  
	//variable visible to product class only  
	private double pPrice;  
	//creating a constructor and parsed product name as a parameter  
	public void Product (String pname)   
	{  
	pName = pname;  
	}  
	//function sets the product price  
	public void setPrice(double pprice)   
	{  
	pPrice= pprice;  
	}  
	//method prints all product info  
	public void getInfo()   
	{  
	System.out.println("Product Name: " +pName );  
	System.out.println("Product Price: " +pPrice);  
	}  
	public static void main(String args[])   
	{  
		Scope_variables pro = new Scope_variables ();  
	pro.setPrice(65000);  
	pro.getInfo();  
	}  
	}  


