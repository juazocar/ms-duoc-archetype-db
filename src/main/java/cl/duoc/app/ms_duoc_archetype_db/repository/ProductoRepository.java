package cl.duoc.app.ms_duoc_archetype_db.repository;

import cl.duoc.app.ms_duoc_archetype_db.model.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
