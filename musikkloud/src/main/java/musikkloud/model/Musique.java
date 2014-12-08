package musikkloud.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the musique database table.
 * 
 */
@Entity
@NamedQuery(name="Musique.findAll", query="SELECT m FROM Musique m")
public class Musique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String artiste;

	private String fichier;

	private String serie;

	private String titre;

	//bi-directional many-to-one association to Note
	@OneToMany(mappedBy="musique")
	private List<Note> notes;

	public Musique() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtiste() {
		return this.artiste;
	}

	public void setArtiste(String artiste) {
		this.artiste = artiste;
	}

	public String getFichier() {
		return this.fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public List<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public Note addNote(Note note) {
		getNotes().add(note);
		note.setMusique(this);

		return note;
	}

	public Note removeNote(Note note) {
		getNotes().remove(note);
		note.setMusique(null);

		return note;
	}

}