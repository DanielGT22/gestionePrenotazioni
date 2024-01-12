package daniel.gestionePrenotazioni.services;

import daniel.gestionePrenotazioni.entities.Edificio;
import daniel.gestionePrenotazioni.entities.Postazione;
import daniel.gestionePrenotazioni.entities.Utente;
import daniel.gestionePrenotazioni.exceptions.ItemNotFoundException;
import daniel.gestionePrenotazioni.repositories.EdificioDAO;
import daniel.gestionePrenotazioni.repositories.PostazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;


    public  void savePostazione(Postazione postazione) {


        postazioneDAO.save(postazione);
    }
    public Postazione findById(long id) throws ItemNotFoundException {


        return postazioneDAO.findById(id).orElseThrow(() -> new ItemNotFoundException(id));
    }
}