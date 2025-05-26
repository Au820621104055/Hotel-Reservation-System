package com.service;

import java.util.ArrayList;
import java.util.List;

import com.management.RIResidentManagement;
import com.model.RIResident;
import com.utili.ApplicationUtil;


public class RIResidentService {
	RIResidentManagement mgmt = new RIResidentManagement();
	int id=0;
	ApplicationUtil au = new ApplicationUtil();
	
    public boolean buildRIResidentList(List<String> lines) {
        List<RIResident> list = new ArrayList<>();
        for (String line : lines) {
            String[] data = line.split(":");
            if (data.length == 12) {
                RIResident r = new RIResident(generateId(),
                		data[0],
                		au.stringToInt(data[1]),
                		data[2],
                		au.stringToLong(data[3]),
                		data[4],
                		data[5],
                		au.stringToInt(data[6]),
                		au.stringToInt(data[7]),
                		au.stringToInt(data[8]),
                		au.stringToInt(data[9]),
                		data[10],
                		au.stringToLong(data[11]));
                
                list.add(r);
            }
        }
        return addRIResidentList(list);
    }

    public boolean addRIResidentList(List<RIResident> list) {
        return mgmt.insertRIResidentList(list);
    }

    public String generateId() {
    	id++;
        return "RI_ID-"+id;
    }

    public boolean updateRIResidentPhoneNumberUsingResidentId(String id, long phone) {
        return mgmt.updatePhoneByResidentId(id, phone);
    }

    public boolean updateOccupancyUsingResidentId(String id, int ad, int ch12, int ch5) {
        return mgmt.updateOccupancyByResidentId(id, ad, ch12, ch5);
    }

    public boolean updateRIResidentPhoneNumberUsingIdProof(long idProof, long phone) {
        return mgmt.updatePhoneByIdProof(idProof, phone);
    }

    public boolean updateOccupancyUsingIdProof(long idProof, int ad, int ch12, int ch5) {
        return mgmt.updateOccupancyByResidentId(idProof, ad, ch12, ch5);
    }

    public boolean updateRIResidentPhoneNumberUsingContactNumber(long contact, long phone) {
        return mgmt.updatePhoneByContact(contact, phone);
    }

    public boolean updateOccupancyUsingContactNumber(long contact, int ad, int ch12, int ch5) {
        return mgmt.updateOccupancyByResidentId(contact, ad, ch12, ch5);
    }

    public RIResident retreiveRIResidentDetails(String id) {
        return mgmt.getRIResidentById(id);
    }

    public boolean deleteRIResidentDetailsFromDB(String id) {
        return mgmt.deleteRIResident(id);
    }

    public RIResident retreiveRIResidentDetailsForBooking(String id) {
        return mgmt.getRIResidentById(id);
    }
}

