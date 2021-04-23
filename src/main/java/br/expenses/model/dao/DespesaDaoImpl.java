package br.expenses.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.expenses.model.entity.Despesa;

@Repository
public class DespesaDaoImpl extends AbstractDao<Despesa, Long> implements DespesaDao  {

    @Override
    public List<Despesa> findByCategoriaId(Long id) {
        return createQuery("select d from Despesa d where d.categoria.id = ?1", id);
    }
    
}
