import java.util.ArrayList;
import java.util.Iterator;


public class ProductGroup extends ProductComponent{
	
	// Each group and all the products contained in
	// that group are stored in this ArrayList
	
	ArrayList<ProductComponent> productComponents = new ArrayList<ProductComponent>();
	
	private String productGroupName;

	public ProductGroup(String productGroupName) {
		super();
		this.productGroupName = productGroupName;
	}

	public void add(ProductComponent newProductComponent) {
		
		productComponents.add(newProductComponent);
		
	}

	public void remove(ProductComponent newProductComponent) {
		
		productComponents.remove(newProductComponent);
		
	}

	public ProductComponent getProductComponent(int componentIndex) {
		
		return (ProductComponent)productComponents.get(componentIndex);
		
	}

	public String getProductGroupName() { return productGroupName; }

	public void displayProductInfo() {
		
		System.out.println(getProductGroupName());
		
		// Cycle through and print every product in this Product Group
		
		Iterator<ProductComponent> productIterator = productComponents.iterator();
		
		while(productIterator.hasNext()){
			
			ProductComponent productInfo = (ProductComponent) productIterator.next();
			
			productInfo.displayProductInfo();
			
		}
		
		System.out.println();
		
	}

}