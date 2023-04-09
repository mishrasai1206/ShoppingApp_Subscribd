package com.subscribd.Project_Subscribd.DAO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subscribd.Project_Subscribd.Entity.Merchant;
import com.subscribd.Project_Subscribd.Repo.MerchantRepo;

@Repository
public class MerchantDao {
	@Autowired
	private MerchantRepo merchantRepo;

	public Merchant saveMerchant(Merchant merchant) {
		return merchantRepo.save(merchant);
	}

	public Merchant findMerchantById(int id) {
		return merchantRepo.findById(id).get();
	}

	public Merchant updateMerchantById(Merchant merchant, int id) {
		Optional<Merchant> optional = merchantRepo.findById(id);
		if (optional.isEmpty()) {
			return null;
		}
		merchant.setMerchantId(id);
		return merchantRepo.save(merchant);

	}
	
	public Merchant deleteMerchantById(int id) {
		Merchant merchant = merchantRepo.findById(id).get();
		merchantRepo.delete(merchant);
		return merchant;
	}
}
