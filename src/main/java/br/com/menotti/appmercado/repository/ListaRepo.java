package br.com.menotti.appmercado.repository;

import br.com.menotti.appmercado.model.ListaDeCompras;
import org.springframework.data.repository.CrudRepository;

public interface ListaRepo extends CrudRepository<ListaDeCompras, Integer> {
}
