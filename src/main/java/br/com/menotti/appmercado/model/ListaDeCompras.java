package br.com.menotti.appmercado.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tbl_lista")
public class ListaDeCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lista")
    private Integer id;
    @Column(name = "data_criacao")
    private LocalDate data;
    @Column(name = "local_mercado", length = 50)
    private String nomeMercado;
    @Column(name = "valor_total")
    private Double valorTotal;
    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "lista", cascade = CascadeType.ALL)
    private List<ItemLista> itens;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<ItemLista> getItens() {
        return itens;
    }

    public void setItens(List<ItemLista> itens) {
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
