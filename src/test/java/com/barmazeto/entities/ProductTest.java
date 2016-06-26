package com.barmazeto.entities;

import java.util.Collection;
import java.util.Set;

import org.junit.Test;

import Entities.Product;
import Entities.ProductType;
import dao.ProductDAO;
import exceptions.DAOException;

public class ProductTest {

	
	@Test
	public void test() throws DAOException{
		Product product = new Product("Shumensko",1.25, ProductType.BEER);
		System.out.println(product);
		ProductDAO dao = new ProductDAO();
		dao.addProduct(product);
//		Collection<Product> products = dao.getAllProducts();
//		for (Product product2 : products) {
//			System.out.println(product2);
//		}
	}
}
