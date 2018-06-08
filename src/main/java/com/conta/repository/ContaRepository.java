package com.conta.repository;

import java.util.List;


import org.springframework.data.repository.Repository;
 
import com.conta.model.ContaModel;
 
public interface ContaRepository extends Repository<ContaModel, Integer> {
 
	void save(ContaModel conta);
 
	void delete(ContaModel conta);
 
	List<ContaModel> findAll();
 
	ContaModel findOne(Integer id);
	
}