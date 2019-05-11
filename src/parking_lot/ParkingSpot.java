package parking_lot;

public class ParkingSpot {
	private String number;
	private boolean free;
	private Car car;
	ParkingSpot(String number,Car car){
		this.number=number;
		this.car=car;
	}
}
