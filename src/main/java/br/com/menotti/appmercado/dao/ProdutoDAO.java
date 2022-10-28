package br.com.menotti.appmercado.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.menotti.appmercado.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

    List<Produto> findByNomeContaining(String palavra);
}