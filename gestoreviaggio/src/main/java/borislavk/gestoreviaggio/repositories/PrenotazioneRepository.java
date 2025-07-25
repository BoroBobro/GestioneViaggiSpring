package borislavk.gestoreviaggio.repositories;

import borislavk.gestoreviaggio.entities.Dipendente;
import borislavk.gestoreviaggio.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.UUID;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, UUID> {
    boolean existsByDipendeteAndDataRichiesta(Dipendente dipendente, LocalDate dataRichiesta);
}
