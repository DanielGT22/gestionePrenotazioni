package daniel.gestionePrenotazioni.services;

import daniel.gestionePrenotazioni.repositories.PostazioneDAO;
import daniel.gestionePrenotazioni.repositories.PrenotazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PrenotazioneService {
    @Autowired
    PrenotazioneDAO prenotazioneDAO;
}