
public class Customer {

	private String custName;
	private String custRegistration;
	private int parkTime;
	private double parkingPrice = 2.00;
	
	public Customer(String name, String registration, int Time) {
		
		custName = name;
		custRegistration = registration;
		parkTime = Time;

	}
	
	@Override
	public String toString() {
		
		return "Name of customer: "+ custName + " Car registration: "+ custRegistration + " Parking time: "+ parkTime;
		
	}
	
	public double calculatePrice() {
		
		if(this.parkTime > 3) {
			
		    parkingPrice = parkingPrice + (parkTime - 3) * 0.5 ;
			System.out.println(parkingPrice);
			
		}
		if(this.parkingPrice > 10) {
			
			parkingPrice = 10;
			System.out.println(parkingPrice);
			
		}
		return this.parkingPrice;
		
		
		
		
	}
	
	
}
