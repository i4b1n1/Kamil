package com.example.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EncjaRepository  extends CrudRepository<Encja,Long>{

	public List<Encja> findAll();
}
