package borislavk.gestoreviaggio.entities;

import borislavk.gestoreviaggio.enums.StatoViggio;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Viaggio {
    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    private String destinazione;

    @NotNull
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    private StatoViggio stato = StatoViggio.IN_PROGRAMMA;
}
