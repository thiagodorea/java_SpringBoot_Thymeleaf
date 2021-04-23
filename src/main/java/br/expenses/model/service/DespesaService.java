package br.expenses.model.service;

import java.util.List;

import br.expenses.model.entity.Despesa;

public interface DespesaService {
    
    void salvar (Despesa despesa);
    
    void editar (Despesa despesa);
    
    void excluir (Long id);

    Despesa buscarPorId(Long id);

    List<Despesa> buscarTodos();
    
    List<Despesa> buscarPorCategoria(Long id);

}
