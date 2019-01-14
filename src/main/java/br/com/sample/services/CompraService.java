package br.com.sample.services;

import java.util.List;

import br.com.sample.model.Compra;

public interface CompraService {
    List<Compra> getAll();
    Compra get(long id);
    void add(Compra compra);
    Compra edit(Compra compra);
    void delete(Compra compra);
    long count();

}
