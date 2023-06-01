package com.bank.icici.util;

import org.springframework.stereotype.Component;

import com.bank.icici.bean.Beneficiary;
import com.bank.icici.entity.BeneficiaryEntity;

@Component
public class EntityMapping {

	public BeneficiaryEntity mapBeneficiaryEntity(Beneficiary beneficiary) {

		BeneficiaryEntity beneficiaryEntity = new BeneficiaryEntity();
		beneficiaryEntity.setAccountNumber(beneficiary.getAccountNumber());
		beneficiaryEntity.setId(1001L);
		beneficiaryEntity.setBankName(beneficiary.getBankName());
		beneficiaryEntity.setIfsccode(beneficiary.getIfsccode());
		beneficiaryEntity.setName(beneficiary.getName());

		return beneficiaryEntity;

	}

}
