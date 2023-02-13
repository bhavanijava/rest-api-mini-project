package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.model.FixedCharges;

@Repository
public interface FixedChargesRepo extends JpaRepository<FixedCharges, String> {

}
