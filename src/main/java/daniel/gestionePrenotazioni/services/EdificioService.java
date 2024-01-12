package daniel.gestionePrenotazioni.services;

import daniel.gestionePrenotazioni.entities.Edificio;
import daniel.gestionePrenotazioni.repositories.EdificioDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    @Autowired
     EdificioDAO edificioDAO;


    public  void saveEdificio(Edificio edificio) {
        if (edificio.getNome().length() < 2) throw new RuntimeException("Inserisci un nome valido.");


        edificioDAO.save(edificio);
    }

}

