package daniel.gestionePrenotazioni.services;

import daniel.gestionePrenotazioni.repositories.EdificioDAO;
import daniel.gestionePrenotazioni.repositories.PostazioneDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PostazioneService {
    @Autowired
    PostazioneDAO postazioneDAO;
}