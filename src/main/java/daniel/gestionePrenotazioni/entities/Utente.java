package daniel.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "utente")
@NoArgsConstructor
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String nomeUtente;

    public String nomeCompleto;

    public String email;
    @OneToMany
    private List<Prenotazione> prenotazioni;



}
