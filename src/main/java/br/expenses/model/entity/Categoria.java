package br.expenses.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@SuppressWarnings("Serializable")
@Entity
@Table(name = "CATEGORIAS")
public class Categoria extends AbstractEntity<Long> { 
    
    @NotBlank
    @Size(min =3, max=60)
    @Column(name="descricao", nullable = false, unique=true, length = 60)
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Despesa> despesas;
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }


}
