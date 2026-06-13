package cl.duoc.app.ms_duoc_archetype_db.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductoDTO {

    private Long id;
    private String nombre;
    private String descripcion;
}
