package daniel.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "prenotazione")
@NoArgsConstructor
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @ManyToOne
    @JoinColumn(name = "utente_id")
    public Utente utente;

    @ManyToOne
    @JoinColumn(name = "postazione_id")
    public Postazione postazione;

    public LocalDate dataDiPrenotazione;

}

