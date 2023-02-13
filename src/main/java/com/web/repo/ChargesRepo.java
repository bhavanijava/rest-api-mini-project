package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.Charges;

@Repository
public interface ChargesRepo extends JpaRepository<Charges, Integer> {

}
