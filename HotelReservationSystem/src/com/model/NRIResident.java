package com.model;

public class NRIResident extends Resident {
    private String passportNo;
    private String passportType;
    private String nationality;
    private String purposeForVisit;
	public NRIResident(String residentId, String residentName, int age, String gender, long contactNumber, String email,
			String address, int numberOfAdults, int numberOfChildrenAbove12, int numberOfChildrenAbove5,
			int durationOfStay, String residentType , String passportNo,String passportType,String nationality,String purposeForVisit) {
		super(residentId, residentName, age, gender, contactNumber, email, address, numberOfAdults, numberOfChildrenAbove12,
				numberOfChildrenAbove5, durationOfStay, residentType);
		this.passportNo=passportNo;
		this.passportType=passportType;
		this.nationality=nationality;
		this.purposeForVisit=purposeForVisit;
		
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public String getPassportType() {
		return passportType;
	}
	public void setPassportType(String passportType) {
		this.passportType = passportType;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPurposeForVisit() {
		return purposeForVisit;
	}
	public void setPurposeForVisit(String purposeForVisit) {
		this.purposeForVisit = purposeForVisit;
	}
    
    
}