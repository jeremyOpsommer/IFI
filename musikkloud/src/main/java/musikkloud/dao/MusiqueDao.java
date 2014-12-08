package musikkloud.dao;

import java.util.List;

import musikkloud.model.Musique;

public interface MusiqueDao {
	
	public void ajouterMusique(Musique m);
	
	public void supprimerMusique();
	
	public List<Musique> getAll();
	
	public List<Musique> getBySerie(String serie);

}
