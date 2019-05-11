package parking_lot;

import java.util.Map;

public class ParkingLot {
	private static ParkingLot parkingLot;
	Map<String, Car> parkingSpots;
	AutomatedTicketSystem ticketSystem;
	private int numberOfParkingSpots;
	
	private ParkingLot(int numberOfParkingSpots) {
		this.numberOfParkingSpots=numberOfParkingSpots;
	}
	public static ParkingLot getInstance(int numberOfParkingSpots) {
		if(parkingLot==null) {
			parkingLot=new ParkingLot(numberOfParkingSpots);
		}
		return parkingLot;
	}
}
