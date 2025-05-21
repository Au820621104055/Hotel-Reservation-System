package com.model;

public class Resident {
	private String residentId;
    private String residentName;
    private int age;
    private String gender;
    private long contactNumber;
    private String email;
    private String address;
    private int numberOfAdults;
    private int numberOfChildrenAbove12;
    private int numberOfChildrenAbove5;
    private int durationOfStay;
    private String residentType;
	public Resident(String residentId, String residentName, int age, String gender, long contactNumber, String email,
			String address, int numberOfAdults, int numberOfChildrenAbove12, int numberOfChildrenAbove5,
			int durationOfStay, String residentType) {
		super();
		this.residentId = residentId;
		this.residentName = residentName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildrenAbove12 = numberOfChildrenAbove12;
		this.numberOfChildrenAbove5 = numberOfChildrenAbove5;
		this.durationOfStay = durationOfStay;
		this.residentType = residentType;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public int getDurationOfStay() {
		return durationOfStay;
	}
	public void setDurationOfStay(int durationOfStay) {
		this.durationOfStay = durationOfStay;
	}
	public String getResidentType() {
		return residentType;
	}
	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}
}
