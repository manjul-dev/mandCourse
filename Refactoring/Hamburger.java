public class Hamburger extends Sandwich{
	
	// BAD WAY
	/*
	private boolean customerWantsCondiments = true;
	
	Hamburger(boolean wantsCondiments){
		
		customerWantsCondiments = wantsCondiments;
		
	}
	
	public void makeSandwich(){
		
		cutBun();
		
		// addMeat() will be overridden by subclasses
		
		addMeat();
			
		addVegetables();
		
		// addCondiments() will be overridden by subclasses
		// customerWantsCondiments() should be created as
		// a hook method that executes optional code
		
		if(customerWantsCondiments()){
		
			addCondiments();
		
		}
		
		wrapSandwich();
		
	}
	*/
	
	void addMeat() {
		
		System.out.println("Hamburger Added");
		
	}


	void addCondiments() {
		
		System.out.println("Special Sauce Added");
		
	}

}