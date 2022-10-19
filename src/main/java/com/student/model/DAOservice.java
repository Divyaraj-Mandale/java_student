package com.student.model;

import java.sql.ResultSet;

public interface DAOservice {
public void connectDB();

public boolean verifycon(String email, String password);

public void createregistration(String name, String city, String email, String mobile);

public ResultSet getListRegistration();

public void deleteRegistration(String email);
}
