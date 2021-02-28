package com.example.demo.algamoney.api.repository.lancamento;

import java.util.List;

import com.example.demo.algamoney.api.model.Lancamento;
import com.example.demo.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentofilter);
	
}
