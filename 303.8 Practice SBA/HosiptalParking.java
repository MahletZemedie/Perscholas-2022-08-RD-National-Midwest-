package com.perscholas.practiceSBA;

/*
 * @ author- Mahlet Zemedie
 * Date - 12/10/2022
 */

 interface IParkingSystem {
	
	public  final double nightOnly = 30;
	 public  final double morning = 20; 
	 public  final double twentyFour = 45;
	 

}

class HosiptalParking implements IParkingSystem{
	
	double surcharge = 0.2;
	int time;
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}

	public HosiptalParking(int time) {		
		this.time=time;
	}
	
	public double processTicket() {
		double ticket = 0;
		if (getTime()==12) {
			ticket = IParkingSystem.morning + (IParkingSystem.morning) * surcharge;
		}else if (getTime()==7) {
			ticket = IParkingSystem.morning + (IParkingSystem.nightOnly) * surcharge;
	}else if(getTime()==5) {
		ticket = IParkingSystem.morning + (IParkingSystem.twentyFour) * surcharge;
	}
		return ticket;
		
}
	
public static void main(String [] args){
		
		HosiptalParking hospital = new HosiptalParking(12); 
		MallParking mall = new MallParking(12);
		System.out.println("Price for hospital parking  is " + hospital.processTicket());
		System.out.println("Price for mall parking is " + mall.processTicket());
		
		}
}

class MallParking extends HosiptalParking implements IParkingSystem {
	
	int time; 
	double surcharge = 0.1;
	
	public MallParking(int time) {
		super(time);
	}
	@Override
	public double processTicket() {
		double ticket = 0;
		if (getTime()==12) {
			ticket = IParkingSystem.morning + (IParkingSystem.morning) * surcharge;
		}else if (getTime()==7) {
			ticket = IParkingSystem.morning + (IParkingSystem.nightOnly) * surcharge;
	}else if(getTime()==5) {
		ticket = IParkingSystem.morning + (IParkingSystem.twentyFour) * surcharge;
	}
		return ticket;
		
	}
	
	
	
}

	

	


 
