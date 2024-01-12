package daniel.gestionePrenotazioni;

import com.github.javafaker.Faker;
import daniel.gestionePrenotazioni.repositories.EdificioDAO;
import daniel.gestionePrenotazioni.services.EdificioService;
import daniel.gestionePrenotazioni.services.PostazioneService;
import daniel.gestionePrenotazioni.services.PrenotazioneService;
import daniel.gestionePrenotazioni.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import daniel.gestionePrenotazioni.entities.*;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Random;
@Component
public class Runner implements CommandLineRunner {


    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private PrenotazioneService prenotazioneService;



    @Override
    public void run(String... args) throws Exception {

            Faker faker = new Faker(new Locale("it"));
            Random random = new Random();



        try {
            for (int i = 0; i < 10; i++) {
                Edificio edificio = new Edificio(
                        faker.color().name(),
                        faker.address().streetAddress(),
                        faker.address().city()
                );
                edificioService.saveEdificio(edificio);
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }


    }

}