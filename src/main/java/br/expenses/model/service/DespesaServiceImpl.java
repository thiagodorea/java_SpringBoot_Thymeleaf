package br.expenses.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.expenses.model.dao.DespesaDao;
import br.expenses.model.entity.Despesa;

@Service
@Transactional(readOnly = false)
public class DespesaServiceImpl implements DespesaService {

    @Autowired
    private  DespesaDao dao;


    @Override
    public void salvar(Despesa despesa) {
        dao.save(despesa); 
    }

    @Override
    public void editar(Despesa despesa) {
        dao.update(despesa);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Despesa buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Despesa> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public List<Despesa> buscarPorCategoria(Long id) {
        return dao.findByCategoriaId(id);
    }
    
}
