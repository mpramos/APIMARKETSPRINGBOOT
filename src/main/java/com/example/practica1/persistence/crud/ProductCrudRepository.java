package com.example.practica1.persistence.crud;

import com.example.practica1.persistence.ProductoRepository;
import com.example.practica1.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductCrudRepository extends CrudRepository<Producto,Integer> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    List<Producto> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);

}
