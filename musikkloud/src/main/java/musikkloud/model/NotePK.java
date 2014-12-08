package musikkloud.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the note database table.
 * 
 */
@Embeddable
public class NotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_musique", insertable=false, updatable=false)
	private int idMusique;

	@Column(name="id_user", insertable=false, updatable=false)
	private int idUser;

	public NotePK() {
	}
	public int getIdMusique() {
		return this.idMusique;
	}
	public void setIdMusique(int idMusique) {
		this.idMusique = idMusique;
	}
	public int getIdUser() {
		return this.idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NotePK)) {
			return false;
		}
		NotePK castOther = (NotePK)other;
		return 
			(this.idMusique == castOther.idMusique)
			&& (this.idUser == castOther.idUser);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMusique;
		hash = hash * prime + this.idUser;
		
		return hash;
	}
}