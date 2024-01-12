package daniel.gestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "postazione")
@NoArgsConstructor
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String descrizione;

    public Tipo tipo;

    public int numeroMaxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id")
    private Edificio edificio;

    @OneToMany
    public List<Prenotazione> prenotazioni;


    public Postazione(String descrizione, Tipo tipo, int numeroMaxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMaxOccupanti = numeroMaxOccupanti;
        this.edificio = edificio;
    }
}
