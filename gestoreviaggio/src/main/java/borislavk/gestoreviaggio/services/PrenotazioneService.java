package borislavk.gestoreviaggio.services;

import borislavk.gestoreviaggio.entities.Prenotazione;
import borislavk.gestoreviaggio.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione creaPrenotazione(Prenotazione p){
        if (prenotazioneRepository.existsByDipendeteAndDataRichiesta(p.getDipendente(), p.getDataRichiesta()))
    }
}
