package br.com.menotti.appmercado.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.menotti.appmercado.model.ListaDeCompras;

public interface ListaDeComprasDAO extends CrudRepository<ListaDeCompras, Integer>{

    public List<ListaDeCompras> findByOrderByDataListaDesc();

}