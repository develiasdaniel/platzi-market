package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

//<Tabla, TipodeDatoDesuID>
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
    //se puede usar la anotacion query
    // @Query(value = "select * from categoria where id_categoria = ?",nativeQuery = true)
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,boolean estado);

    Optional<List<Producto>> findByNombreAndPrecioVentaGreaterThanAndEstado(String nombre,double precioVenta,boolean estado);
}
