package com.ntt.sre.reajuste.equipe2.services;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ntt.sre.reajuste.equipe2.dto.IncreaseDTO;
import com.ntt.sre.reajuste.equipe2.entities.SalaryIncrease;
import com.ntt.sre.reajuste.equipe2.salaryIncreaseFeign.IncreaseFeign;

@Service
public class IncreaseService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private IncreaseFeign increaseFeign;
		
	public IncreaseDTO getIncrease(Long id) {
		/*Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+id);
		/*restTemplate.getForObject(companyHost + "/officer/{id}", SalaryIncrease.class, uriVariables);*/
		SalaryIncrease increase = increaseFeign.findById(id).getBody();	
		return new IncreaseDTO(increase.getId(), 
								increase.getOffice(), 
								increase.getInitial_salary(), 
								increase.getPercentage_increase(),
								increase.getIncrease());
	}
	
	
	

	/*public void addSalary(Long id, Double new_salary) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+id);
		Salary salary = restTemplate.postForEntity(companyHost + "/officer/{id}", Salary.class, uriVariables);	
	}*/
	
}
