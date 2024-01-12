package daniel.gestionePrenotazioni.services;

import daniel.gestionePrenotazioni.repositories.PrenotazioneDAO;
import daniel.gestionePrenotazioni.repositories.UtenteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UtenteService {
    @Autowired
    UtenteDAO utenteDAO;
}