package br.com.menotti.appmercado.controller;

import br.com.menotti.appmercado.service.IListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaController {
    @Autowired
    private IListaService service;
}
