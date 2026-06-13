package cl.duoc.app.ms_duoc_archetype_db.service;

import cl.duoc.app.ms_duoc_archetype_db.model.dto.ProductoDTO;
import cl.duoc.app.ms_duoc_archetype_db.model.entity.Producto;
import cl.duoc.app.ms_duoc_archetype_db.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<ProductoDTO> obtenerProductos(){
        List<ProductoDTO> listaProductos = new ArrayList<>();

        for(Producto producto : productoRepository.findAll()){
            listaProductos.add(convertEntityToDto(producto));
        }
        return listaProductos;
    }

    private ProductoDTO convertEntityToDto(Producto producto){
        return new ProductoDTO(producto.getIdProducto(), producto.getNombre(), producto.getDescripcion());
    }

}
