package com.model;
import java.util.Date;
public class Booking {
	private String bookingId;
	private String residentId;
	private String residentName;
	private int durationOfStay;
	private int numberOfAdults;
	private int numberOfChildrenAbove12;
	private int numberOfChildrenAbove5;
	private Date checkInDate;
    private Date checkOutDate;
    private String floorNumber;
    private String roomNumber;
    private String preferredPackage;
    private String acAccess;
    private String poolAccess;
    private String gymAccess;
    
	public Booking(String bookingId, String residentId, String residentName, int durationOfStay, int numberOfAdults,
			int numberOfChildrenAbove12, int numberOfChildrenAbove5, Date checkInDate, Date checkOutDate,
			String floorNumber, String roomNumber, String preferredPackage, String acAccess, String poolAccess,
			String gymAccess) {
		super();
		this.bookingId = bookingId;
		this.residentId = residentId;
		this.residentName = residentName;
		this.durationOfStay = durationOfStay;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildrenAbove12 = numberOfChildrenAbove12;
		this.numberOfChildrenAbove5 = numberOfChildrenAbove5;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.floorNumber = floorNumber;
		this.roomNumber = roomNumber;
		this.preferredPackage = preferredPackage;
		this.acAccess = acAccess;
		this.poolAccess = poolAccess;
		this.gymAccess = gymAccess;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getResidentId() {
		return residentId;
	}

	public void setResidentId(String residentId) {
		this.residentId = residentId;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public int getDurationOfStay() {
		return durationOfStay;
	}

	public void setDurationOfStay(int durationOfStay) {
		this.durationOfStay = durationOfStay;
	}

	public int getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public int getNumberOfChildrenAbove12() {
		return numberOfChildrenAbove12;
	}

	public void setNumberOfChildrenAbove12(int numberOfChildrenAbove12) {
		this.numberOfChildrenAbove12 = numberOfChildrenAbove12;
	}

	public int getNumberOfChildrenAbove5() {
		return numberOfChildrenAbove5;
	}

	public void setNumberOfChildrenAbove5(int numberOfChildrenAbove5) {
		this.numberOfChildrenAbove5 = numberOfChildrenAbove5;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getPreferredPackage() {
		return preferredPackage;
	}

	public void setPreferredPackage(String preferredPackage) {
		this.preferredPackage = preferredPackage;
	}

	public String getAcAccess() {
		return acAccess;
	}

	public void setAcAccess(String acAccess) {
		this.acAccess = acAccess;
	}

	public String getPoolAccess() {
		return poolAccess;
	}

	public void setPoolAccess(String poolAccess) {
		this.poolAccess = poolAccess;
	}

	public String getGymAccess() {
		return gymAccess;
	}

	public void setGymAccess(String gymAccess) {
		this.gymAccess = gymAccess;
	}
	

}
