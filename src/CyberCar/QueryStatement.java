package CyberCar;

public class QueryStatement {
	
	public final static String 
	ADD_EMPLOYE_QUERY =
	"INSERT INTO employe( nom, prenom, nom_Jeune_Fille, adresse, login, mot_De_Passe, departement, telephone, mail, s_Conjugale, nb_Enfant, a_Medical, fonction, date_Embauche, salaire, nb_Conges, nb_Conges_Restants, date_Fin) VALUES(?,?,?,?,?, ?,?,?,?,?, ?,?,?,?,?, ?,?,?)";
	
	public final static String
	UPDATE_EMPLOYE_QUERY =
	"UPDATE employe SET nom=?, prenom=?, nom_Jeune_Fille=?, adresse=?, login=?, mot_De_Passe=?, departement=?, telephone=?, mail=?, s_Conjugale=?, nb_Enfant=?, a_Medical=?, fonction=?, date_Embauche=?, salaire=?, nb_Conges=?, nb_Conges_Restants=?, date_Fin=? where id= ?";
	
	public final static String DELETE_EMPLOYE_QUERY = "DELETE FROM employe WHERE id=?";
	
	public final static String SELECT_ALL_EMPLOYE_QUERY = "SELECT * FROM employe";

}
