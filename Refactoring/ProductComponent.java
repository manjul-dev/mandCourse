// Replace an implicit tree structure made up
// of primitives with the Composite Pattern

// What do you do when you want to model a tree
// structure? You can either list the info as primitives
// and then search through them for what you want
// or you can create objects that represent each 
// level of the tree with the composite pattern

// This acts as an interface for every Product
// and ProductGroup that is created

public abstract class ProductComponent {

	void add(ProductComponent newProductComponent) {
	}
	
	void remove(ProductComponent newProductComponent) {
	}
	
	ProductComponent getProductComponent(int componentIndex) {
		return null;
	}
	
	String getProductGroupName() {
		return null;
	}
	
	abstract void displayProductInfo();
	
}