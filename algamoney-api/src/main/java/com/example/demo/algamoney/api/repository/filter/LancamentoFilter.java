package com.example.demo.algamoney.api.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {
	
	private String descricao;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datavencimentoDe;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate datavencimentoAte;
	
	public String getDescrica() {
		return descricao;
	}
	public void setDescrica(String descrica) {
		this.descricao = descrica;
	}
	public LocalDate getDatavencimentoDe() {
		return datavencimentoDe;
	}
	public void setDatavencimentoDe(LocalDate datavencimentoDe) {
		this.datavencimentoDe = datavencimentoDe;
	}
	public LocalDate getDatavencimentoAteDate() {
		return datavencimentoAte;
	}
	public void setDatavencimentoAteDate(LocalDate datavencimentoAteDate) {
		this.datavencimentoAte = datavencimentoAteDate;
	}
}
