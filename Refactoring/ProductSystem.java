public class ProductSystem {

	public static void main(String[] args){
		
		// Add product groups
		
		ProductComponent produce = new ProductGroup("Produce");
		
		ProductComponent cereal = new ProductGroup("Cereal");
		
		// Top level component that contains all products
		
		ProductComponent everyProduct = new ProductGroup("All Products\n");
		
		// Add produce and cereal groups to everyProduct list
		
		everyProduct.add(produce);
		everyProduct.add(cereal);
		
		// Add individual products to the groups
		
		produce.add(new Product("Tomato", 1.99));
		produce.add(new Product("Orange", .99));
		produce.add(new Product("Potato", .35));
		
		cereal.add(new Product("Special K", 4.79));
		cereal.add(new Product("Cheerios", 3.68));
		cereal.add(new Product("Raisin Bran", 3.68));
		
		// Display all products sorted into groups
		
		everyProduct.displayProductInfo();
		
	}
	
}