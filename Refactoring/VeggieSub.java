public class VeggieSub extends Sandwich{
	
	// BAD WAY
	/*
	private boolean customerWantsCondiments = true;
		
	VeggieSub(boolean wantsCondiments){
			
		customerWantsCondiments = wantsCondiments;
			
	}
		
	public void makeSandwich(){
			
		cutBun();
				
		addVegetables();
			
		if(customerWantsCondiments()){
			
			addCondiments();
			
		}
			
		wrapSandwich();
			
	}
	*/
	
	boolean customerWantsMeat(){ return false; }

	void addMeat() {
		
	}


	void addCondiments() {
		
		System.out.println("Vinegar and Oil Added");
		
	}

}