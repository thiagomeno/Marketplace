package br.com.menotti.appmercado.repository;

import br.com.menotti.appmercado.model.Produto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
    public List<Produto> findAllByNomeContaining(String palavraChave);
}
