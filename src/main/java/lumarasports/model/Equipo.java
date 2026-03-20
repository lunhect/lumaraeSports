package lumarasports.model;
import jakarta.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

public class Equipo {
    private Long  id;

    @NotBlank(message = "Obligario")
    @Future


}
