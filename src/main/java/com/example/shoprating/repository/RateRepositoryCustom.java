package com.example.shoprating.repository;

import java.util.HashMap;

public interface RateRepositoryCustom {
	public HashMap<String, Double> getAverageListOfProducts();
	public String getIdByUserIdandProductID(String userId, String productId);
}
