package parking_lot;

public class Car {
	private String registrationNumber;
	private Colour colour;
	private String ticket;

	public Car(String registrationNumber, Colour colour) {
		this.registrationNumber = registrationNumber;
		this.colour = colour;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

}
