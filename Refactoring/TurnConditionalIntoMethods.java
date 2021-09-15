public class TurnConditionalIntoMethods {
	
	static int bagOver70lbs(){
		
		return 200;
		
	}
	
	static int bagUnder50lbs(int bagNumber){
		
		return (bagNumber < 1)?25:35;
		
	}
	
	static int bag50To70lbs(int bagNumber){
		
		return (bagNumber < 2)?100:150;
		
	}
	
	public static void main(String[] args){
		
		int[]bagWeight = new int[]{25,55,75};
		
		int numberOfBags = bagWeight.length;
		
		int bagFees = 0;
		
		for(int i = 0; i < numberOfBags; i++){
		
			if(i < 1){
				
				if(bagWeight[i] < 50){
					
					if(i == 0) {bagFees+= 25;} else {bagFees+= 35;}
					
				} else if(bagWeight[i] < 70){
					
					if(i == 0) {bagFees+= 100;} else if(i == 1){bagFees+= 150;} else {bagFees+= 200;}
					
				} else { bagFees+= 200; }
				
			} else if(i >= 0 && bagWeight[i] < 70){
				
				if(i == 1) {bagFees+= 100;} else {bagFees+= 150;}
			
			} else {
				
				bagFees+= 200;
				
			}
		
		}
		
		System.out.println("Bag Fees: $" + bagFees);
		
		////////////////////////////
		
		bagFees = 0;
		
		for(int theBag = 0; theBag < numberOfBags; theBag++){
			
			if(bagWeight[theBag] < 50){
				
				bagFees += bagUnder50lbs(theBag);
				
			} else
				
				if(bagWeight[theBag] < 70){
					
					bagFees += bag50To70lbs(theBag);
					
				} else {
					
					bagFees += 200;
					
				}
			
		}
		
		System.out.println("Bag Fees: $" + bagFees);
		
		//////////////////////////
		
		bagFees = 0;
		
		for(int theBag = 0; theBag < numberOfBags; theBag++){
			
			if(bagWeight[theBag] < 50){ bagFees += bagUnder50lbs(theBag); }
			
			if(bagWeight[theBag] < 70 && bagWeight[theBag] >= 50) {
				
				bagFees += bag50To70lbs(theBag);
				
			}
			
			if(bagWeight[theBag] >= 70) { bagFees += 200; }
			
		}
		
		System.out.println("Bag Fees: $" + bagFees);
		
	}

}