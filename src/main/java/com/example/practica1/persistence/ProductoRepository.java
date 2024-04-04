package com.example.practica1.persistence;

import com.example.practica1.persistence.crud.ProductCrudRepository;
import com.example.practica1.persistence.entity.Producto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductCrudRepository productCrudRepository;
    public List<Producto> getAll(){
        return (List<Producto>) productCrudRepository.findAll();
    }
    public List<Producto> getByCategory(int idCategoria){
        return  productCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }
    public List<Producto> getEscasos(int cantidad){
        return productCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
