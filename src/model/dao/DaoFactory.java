package model.dao;

import db.DB;
import model.dao.impl.SellerDoaJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDoaJDBC(DB.getConnection());
	}
}
