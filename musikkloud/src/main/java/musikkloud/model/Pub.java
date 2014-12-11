package musikkloud.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Pubs database table.
 * 
 */
@Entity
@Table(name="Pubs")
@NamedQuery(name="Pub.findAll", query="SELECT p FROM Pub p")
public class Pub implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pub")
	private int idPub;

	private String nom1;

	private String nom2;

	private int url;

	public Pub() {
	}

	public int getIdPub() {
		return this.idPub;
	}

	public void setIdPub(int idPub) {
		this.idPub = idPub;
	}

	public String getNom1() {
		return this.nom1;
	}

	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}

	public String getNom2() {
		return this.nom2;
	}

	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}

	public int getUrl() {
		return this.url;
	}

	public void setUrl(int url) {
		this.url = url;
	}

}