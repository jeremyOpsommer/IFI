package musikkloud.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the notes database table.
 * 
 */
@Embeddable
public class NotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_musique", insertable=false, updatable=false)
	private int idMusique;

	@Column(insertable=false, updatable=false)
	private String user;

	public NotePK() {
	}
	public int getIdMusique() {
		return this.idMusique;
	}
	public void setIdMusique(int idMusique) {
		this.idMusique = idMusique;
	}
	public String getUser() {
		return this.user;
	}
	public void setUser(String user) {
		this.user = user;
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
			&& this.user.equals(castOther.user);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMusique;
		hash = hash * prime + this.user.hashCode();
		
		return hash;
	}
}