package com.ntt.sre.reajuste.equipe2.dto;

public class IncreaseDTO {
	
	private Long id;
	private String office;
	private Double initial_salary;
	private Double percentage_increase;
	private Double new_salary;
	
	public IncreaseDTO() {
		
	}
	
	public IncreaseDTO(Long id, String office, Double initial_salary, Double percentage_increase,
			Double new_salary) {
		super();
		this.id = id;
		this.office = office;
		this.initial_salary = initial_salary;
		this.percentage_increase = percentage_increase;
		this.new_salary = new_salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Double getInitial_salary() {
		return initial_salary;
	}

	public void setInitial_salary(Double initial_salary) {
		this.initial_salary = initial_salary;
	}

	public Double getPercentage_increase() {
		return percentage_increase;
	}

	public void setPercentage_increase(Double percentage_increase) {
		this.percentage_increase = percentage_increase;
	}

	public Double getNew_salary() {
		return new_salary;
	}

	public void setNew_salary(Double new_salary) {
		this.new_salary = new_salary;
	}
	

}
