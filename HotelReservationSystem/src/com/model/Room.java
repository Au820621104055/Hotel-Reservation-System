package com.model;

public class Room {
	private String roomNumber;
    private String floorNumber;
    private String isOccupied;
    private int maxOccupancy;
    private String hasAc;
    private String hasSwimmingPoolAccess;
    private String hasGymAccess;
	public Room(String roomNumber, String floorNumber, String isOccupied, int maxOccupancy, String hasAc,
			String hasSwimmingPoolAccess, String hasGymAccess) {
		super();
		this.roomNumber = roomNumber;
		this.floorNumber = floorNumber;
		this.isOccupied = isOccupied;
		this.maxOccupancy = maxOccupancy;
		this.hasAc = hasAc;
		this.hasSwimmingPoolAccess = hasSwimmingPoolAccess;
		this.hasGymAccess = hasGymAccess;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(String floorNumber) {
		this.floorNumber = floorNumber;
	}
	public String getIsOccupied() {
		return isOccupied;
	}
	public void setIsOccupied(String isOccupied) {
		this.isOccupied = isOccupied;
	}
	public int getMaxOccupancy() {
		return maxOccupancy;
	}
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}
	public String getHasAc() {
		return hasAc;
	}
	public void setHasAc(String hasAc) {
		this.hasAc = hasAc;
	}
	public String getHasSwimmingPoolAccess() {
		return hasSwimmingPoolAccess;
	}
	public void setHasSwimmingPoolAccess(String hasSwimmingPoolAccess) {
		this.hasSwimmingPoolAccess = hasSwimmingPoolAccess;
	}
	public String getHasGymAccess() {
		return hasGymAccess;
	}
	public void setHasGymAccess(String hasGymAccess) {
		this.hasGymAccess = hasGymAccess;
	}

}
