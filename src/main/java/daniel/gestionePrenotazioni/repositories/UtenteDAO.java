package daniel.gestionePrenotazioni.repositories;

import daniel.gestionePrenotazioni.entities.Edificio;
import daniel.gestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UtenteDAO extends JpaRepository<Utente, Long> {
}