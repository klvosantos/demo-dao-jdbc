package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { // classe vai expor um metodo que retorna o tipo da interface no caso (SellerDao)
		return new SellerDaoJDBC(DB.getConnection()); // Mas internamente ela vai instanciar uma implementação. Macete para não precisar expor a implementação e sim somente a interface
	}				
			// no programa principal sera ex de instanciaçao "SellerDao sellerDao = DaoFactory.createSellerDao();"		
}			// Dessa forma o programa não conhece a implementação e sim somente a interface, é tambem uma forma de fazer injeção de dependencia sem explicitar a implementação
