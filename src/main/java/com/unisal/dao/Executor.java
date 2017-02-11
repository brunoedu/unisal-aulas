package com.unisal.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.unisal.model.City;

public class Executor {
	
	private static final CityDAO cityDAO = CityDAO.getInstance();

	public static void main(String[] args) {
		// INSERT
		City city = new City();
		
		city.setNome("Itajubá");
		city.setGeocodigo(0.0);
		city.setLatitude(0.0);
		city.setLongitude(0.0);
		
		
		try {
			cityDAO.insert(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}
		
		// SELECT BY GEOCODIGO
/*		try {
			City city = cityDAO.getCityByGeocodigo(0);
			System.out.println(city.toString());
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}*/
		
		// DELETE
		/*City city = new City();
		
		city.setId(new Long("1"));		
		
		try {
			cityDAO.delete(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}*/
		
		// UPDATE
		
		city.setId(new Long("5"));	
		city.setGeocodigo(555555555);
		city.setLatitude(666666666);
		city.setLongitude(77777);
		
		
		try {
			cityDAO.update(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}
	}

}
