package borislavk.gestoreviaggio.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Prenotazione {
    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    private LocalDate dataRichiesta;

    private String note;

    @ManyToOne
    private Dipendente dipendente;

    @ManyToOne
    private Viaggio viaggio;

}
