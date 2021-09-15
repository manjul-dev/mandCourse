// Each product represents a leaf in the ProductGroup

public class Product extends ProductComponent{

	private String productName;
	private double productPrice;
	
	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductName() { return productName;}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() { return productPrice; }

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	void displayProductInfo() {
		
		System.out.println(getProductName() + " $" + getProductPrice());
		
	}

}