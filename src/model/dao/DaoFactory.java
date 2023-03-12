package model.dao;

import model.dao.impl.SellerDoaJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDoaJDBC();
	}
}
