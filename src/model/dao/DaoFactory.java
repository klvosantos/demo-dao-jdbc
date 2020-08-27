package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() { // classe vai expor um metodo que retorna o tipo da interface no caso (SellerDao)
		return new SellerDaoJDBC(DB.getConnection()); // Mas internamente ela vai instanciar uma implementa��o. Macete para n�o precisar expor a implementa��o e sim somente a interface
	}				
			// no programa principal sera ex de instancia�ao "SellerDao sellerDao = DaoFactory.createSellerDao();"		
}			// Dessa forma o programa n�o conhece a implementa��o e sim somente a interface, � tambem uma forma de fazer inje��o de dependencia sem explicitar a implementa��o
