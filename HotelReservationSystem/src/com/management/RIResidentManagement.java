package com.management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.RIResident;

public class RIResidentManagement {
	
	static Connection con=null;
	
	public static Connection getConnection()
	{
		con=DBConnectionManager.getConnection();
		return con;
	}

	public boolean insertRIResidentList(List<RIResident> list) {
		
        try {
        	PreparedStatement ps = getConnection().prepareStatement("INSERT INTO riresident (resident_id, resident_name, age, gender, contact_number, email, address, number_of_adults, number_of_children_above12, number_of_children_above5, duration_of_stay, resident_type, idproof_aadharno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"); 
            for (RIResident r : list) {
                ps.setString(1, r.getResidentId());
                ps.setString(2, r.getResidentName());
                ps.setInt(3, r.getAge());
                ps.setString(4, r.getGender());
                ps.setLong(5, r.getContactNumber());
                ps.setString(6, r.getEmail());
                ps.setString(7, r.getAddress());
                ps.setInt(8, r.getNumberOfAdults());
                ps.setInt(9, r.getNumberOfChildrenAbove12());
                ps.setInt(10, r.getNumberOfChildrenAbove5());
                ps.setInt(11, r.getDurationOfStay());
                ps.setString(12, r.getResidentType());
                ps.setLong(13, r.getIdproofAadharno());
                ps.addBatch();
            }
            int result=ps.executeUpdate();
            if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
	}
	

	public boolean updatePhoneByResidentId(String id, long phone) {
		try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE riresident SET contact_number=? WHERE resident_id=?");
            ps.setLong(1, phone);
            ps.setString(2, id);
            int result =ps.executeUpdate();
            if(result >0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return false;
	}
	
    public boolean updateOccupancyByResidentId(String id, int ad, int ch12, int ch5) {
    	try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE riresident SET number_of_adults=?, number_of_children_above12=?, number_of_children_above5=? WHERE resident_id=?");
            ps.setInt(1, ad);
            ps.setInt(2, ch12);
            ps.setInt(3, ch5);
            ps.setString(4, id);
            int result = ps.executeUpdate();
            if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return false;
    }


	public boolean updateOccupancyByResidentId(long id, int ad, int ch12, int ch5) {
		try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE riresident SET number_of_adults=?, number_of_children_above12=?, number_of_children_above5=? WHERE resident_id=?");
            ps.setInt(1, ad);
            ps.setInt(2, ch12);
            ps.setInt(3, ch5);
            ps.setLong(4, id);
            int result = ps.executeUpdate();
            if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return false;
	}

	public boolean updatePhoneByIdProof(long idProof, long phone) {
		try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE riresident SET contact_number=? WHERE idproof_aadharno=?");
            ps.setLong(1, phone);
            ps.setLong(2, idProof);
            int result = ps.executeUpdate();
            if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return false;
	}

	public boolean updatePhoneByContact(long oldphone, long newphone) {
		try {
			PreparedStatement ps = getConnection().prepareStatement("UPDATE riresident SET contact_number=? WHERE contact_number=?");
			ps.setLong(1, newphone);
			ps.setLong(2, oldphone);
			int result = ps.executeUpdate();
			if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return false;
		}
	

	public RIResident getRIResidentById(String id) {
		try  {
            PreparedStatement ps = getConnection().prepareStatement("SELECT * FROM riresident WHERE resident_id=?");
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                RIResident r = new RIResident(
                rs.getString("resident_id"),
                rs.getString("resident_name"),
                rs.getInt("age"),
                rs.getString("gender"),
                rs.getLong("contact_number"),
                rs.getString("email"),
                rs.getString("address"),
                rs.getInt("number_of_adults"),
                rs.getInt("number_of_children_above12"),
                rs.getInt("number_of_children_above5"),
                rs.getInt("duration_of_stay"),
                rs.getString("resident_type"),
                rs.getLong("idproof_aadharno"));
                return r;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

	}

	public boolean deleteRIResident(String id) {
		try {
            PreparedStatement ps = getConnection().prepareStatement("DELETE FROM riresident WHERE resident_id=?");
            ps.setString(1, id);
            int result = ps.executeUpdate();
            if(result>0) {
            	return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return false;
    }
}
