package com.kh.herb.product.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.herb.product.model.dao.ProductDAO;
import com.kh.herb.product.model.vo.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO dao;
	
	@Override
	public List<Product> productAllList() throws Exception {
		List<Product> list = dao.productAllList();
		return list;
	}

	@Override
	public Product productInfo(int num) throws Exception {
		Product vo = dao.productInfo(num);
		return vo;
	}

}
