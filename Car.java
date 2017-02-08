public class Car { 

//These are the attributes of the Car
	int gear = 1; 
	int location ; 
	int speed =0;
	final int destination =250;

//reverseGear metohod	
	void reverseGear(){
		gear = -1;
	}

// reportGear method
	int reportGear (){
		return 	gear; 
	}

	
//reportLocation method
	int reportLocation (){
		return location ;
	}

//gearUp method	
	void gearUp (){
		if (gear==6){
			System.out.println("I cannot increase the gear anymore");
		}
		else if (gear==-1){
			gear=1;
		}			
		else {
			gear=gear +1;
		}
	}


//gearDown method 
	void gearDown (){
		if (gear==1){
			System.out.println("gear can not decrease anymore");
		}	
		else if (gear== -1){
			System.out.println("cannot decrease gear because it is in reverse gear");
		}
		else {
			gear = gear - 1;
		}
	}
	
	
//reportRemaining method
	int reportRemaining (){
		return (destination - location) ;
	}

	
//moveByTime method 	
	void moveByTime (int time ){
	int delta;
	if (time<0){
		System.out.println("Time should be positive!");
	}
	else{ 
		speed= gear*20;
		delta = speed * time; 
		location = location + delta;
		}
	}
	
	
//isArrived method	
	boolean isArrived(){
		if (location >= destination){
			return true; 
			}			
		else { 
			return false;
			}
			

	}
	
}

