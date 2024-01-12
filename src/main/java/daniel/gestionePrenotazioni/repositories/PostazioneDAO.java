package daniel.gestionePrenotazioni.repositories;

import daniel.gestionePrenotazioni.entities.Edificio;
import daniel.gestionePrenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostazioneDAO extends JpaRepository<Postazione, Long> {
}