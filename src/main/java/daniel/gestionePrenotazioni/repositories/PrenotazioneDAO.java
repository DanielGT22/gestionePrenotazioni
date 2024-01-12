package daniel.gestionePrenotazioni.repositories;

import daniel.gestionePrenotazioni.entities.Edificio;
import daniel.gestionePrenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Long> {
}