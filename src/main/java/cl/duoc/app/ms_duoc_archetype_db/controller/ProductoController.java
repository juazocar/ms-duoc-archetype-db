package cl.duoc.app.ms_duoc_archetype_db.controller;

import cl.duoc.app.ms_duoc_archetype_db.model.dto.ProductoDTO;
import cl.duoc.app.ms_duoc_archetype_db.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ResponseEntity<List<ProductoDTO>> obtenerProductos(){
        return new ResponseEntity<>(productoService.obtenerProductos(), HttpStatus.OK);
    }
}
