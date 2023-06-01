package com.bank.icici.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.icici.entity.BeneficiaryEntity;

@Repository
public interface BeneficiaryRepository extends JpaRepository<BeneficiaryEntity, Long>{

}