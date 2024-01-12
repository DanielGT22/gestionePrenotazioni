package daniel.gestionePrenotazioni.services;
import daniel.gestionePrenotazioni.entities.*;
import daniel.gestionePrenotazioni.entities.Utente;
import daniel.gestionePrenotazioni.exceptions.ItemNotFoundException;
import daniel.gestionePrenotazioni.repositories.PrenotazioneDAO;
import daniel.gestionePrenotazioni.repositories.UtenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UtenteService {
    @Autowired
    UtenteDAO utenteDAO;


    public  void saveUtente(Utente utente) {
        if (utente.getNomeUtente().length() < 2) throw new RuntimeException("Inserisci un nome valido.");


        utenteDAO.save(utente);
    }
    public Utente findById(long id) throws ItemNotFoundException {


        return utenteDAO.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }

}