package musikkloud.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the note database table.
 * 
 */
@Entity
@NamedQuery(name="Note.findAll", query="SELECT n FROM Note n")
public class Note implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NotePK id;

	private String commentaire;

	private int note;

	//bi-directional many-to-one association to Musique
	@ManyToOne
	@JoinColumn(name="id_musique")
	private Musique musique;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;

	public Note() {
	}

	public NotePK getId() {
		return this.id;
	}

	public void setId(NotePK id) {
		this.id = id;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNote() {
		return this.note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Musique getMusique() {
		return this.musique;
	}

	public void setMusique(Musique musique) {
		this.musique = musique;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}