package com.demand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demand.model.DemandModel;

@Repository
public interface DemandRepo extends JpaRepository<DemandModel, Long>{

	DemandModel getBydid(Long did);


}
