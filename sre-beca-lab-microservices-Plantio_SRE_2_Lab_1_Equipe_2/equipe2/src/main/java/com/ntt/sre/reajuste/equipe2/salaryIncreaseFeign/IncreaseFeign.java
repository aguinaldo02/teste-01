package com.ntt.sre.reajuste.equipe2.salaryIncreaseFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ntt.sre.reajuste.equipe2.entities.SalaryIncrease;

@Component
@FeignClient(name = "readjustment", path = "/officer")
public interface IncreaseFeign {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<SalaryIncrease> findById(@PathVariable Long id);

}
