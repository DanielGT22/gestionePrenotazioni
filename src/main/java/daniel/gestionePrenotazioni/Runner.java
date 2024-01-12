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

import java.time.LocalDate;
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


        try {
            for (int i = 0; i < 50; i++) {
                Utente utente = new Utente(
                        faker.name().firstName(),
                        faker.harryPotter().character(),
                        faker.internet().emailAddress()
                );
                utenteService.saveUtente(utente);
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                Postazione postazione = new Postazione(
                        faker.gameOfThrones().quote(),
                        Tipo.values()[faker.random().nextInt(Tipo.values().length)],
                        faker.number().numberBetween(1,500),
                        edificioService.findById(faker.number().numberBetween(1, 10))

                );
                postazioneService.savePostazione(postazione);
            }

        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {

                Utente utente =  utenteService.findById(faker.number().numberBetween(1, 10));
                Postazione postazione = postazioneService.findById(faker.number().numberBetween(1, 10));
                LocalDate dataDiPrenotazione = LocalDate.of(random.nextInt(1990,2025),random.nextInt(1,12), random.nextInt(1,28));

                
                Prenotazione prenotazione = new Prenotazione(utente, postazione, dataDiPrenotazione);
                prenotazioneService.savePrenotazione(prenotazione);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

    }


}