package villesJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VillesJdbc {
	
	public static void main(String[] args) {
		// 
		createVille();
	}
	
	public static void createVille() {
		
		// information de la base de donnee
		
		String url = "jdbc:mysql://localhost/villesjdbc";
		String login = "root";
		String password = "";
		Connection cn = null;
		Statement st = null;
		
		try {
			// etape1 chargement du driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			// etape2 recupertion de la connnexion
			
			cn = DriverManager.getConnection(url, login, password);
			
			// etape 3 creation du statement
			st = cn.createStatement();
			String sql = "INSERT INTO `villes_france_free` (`ville_id`, `ville_departement`, `ville_slug`, `ville_nom`, `ville_nom_simple`, `ville_nom_reel`, `ville_nom_soundex`, `ville_nom_metaphone`, `ville_code_postal`, `ville_commune`, `ville_code_commune`, `ville_arrondissement`, `ville_canton`, `ville_amdi`, `ville_population_2010`, `ville_population_1999`, `ville_population_2012`, `ville_densite_2010`, `ville_surface`, `ville_longitude_deg`, `ville_latitude_deg`, `ville_longitude_grd`, `ville_latitude_grd`, `ville_longitude_dms`, `ville_latitude_dms`, `ville_zmin`, `ville_zmax`) VALUES\r\n" + 
					"(1, '01', 'ozan', 'OZAN', 'ozan', 'Ozan', 'O250', 'OSN', '01190', '284', '01284', 2, '26', 6, 618, 469, 500, 93, 6.6, 4.91667, 46.3833, '2866', '51546', '+45456', '462330', 170, 205),\r\n" + 
					"(2, '01', 'cormoranche-sur-saone', 'CORMORANCHE-SUR-SAONE', 'cormoranche sur saone', 'Cormoranche-sur-Saône', 'C65652625', 'KRMRNXSRSN', '01290', '123', '01123', 2, '27', 6, 1058, 903, 1000, 107, 9.85, 4.83333, 46.2333, '2772', '51379', '+44953', '461427', 168, 211),\r\n" + 
					"(3, '01', 'plagne-01', 'PLAGNE', 'plagne', 'Plagne', 'P425', 'PLKN', '01130', '298', '01298', 4, '03', 6, 129, 83, 100, 20, 6.2, 5.73333, 46.1833, '3769', '51324', '+54342', '461131', 560, 922),\r\n" + 
					"(4, '01', 'tossiat', 'TOSSIAT', 'tossiat', 'Tossiat', 'T230', 'TST', '01250', '422', '01422', 2, '25', 6, 1406, 1111, 1400, 138, 10.17, 5.31667, 46.1333, '3309', '51268', '+51854', '460828', 244, 501),\r\n" + 
					"(5, '01', 'pouillat', 'POUILLAT', 'pouillat', 'Pouillat', 'P430', 'PLT', '01250', '309', '01309', 2, '33', 6, 88, 58, 100, 14, 6.23, 5.43333, 46.3333, '3435', '51475', '+52542', '461938', 333, 770),\r\n" + 
					"(6, '01', 'torcieu', 'TORCIEU', 'torcieu', 'Torcieu', 'T620', 'TRS', '01230', '421', '01421', 1, '28', 6, 698, 643, 700, 65, 10.72, 5.4, 45.9167, '3398', '51025', '+52343', '455521', 257, 782),\r\n" + 
					"(7, '01', 'replonges', 'REPLONGES', 'replonges', 'Replonges', 'R1452', 'RPLNJS', '01620', '320', '01320', 2, '02', 6, 3500, 2841, 3300, 210, 16.6, 4.88333, 46.3, '2833', '51456', '+45310', '461837', 169, 207),\r\n" + 
					"(8, '01', 'corcelles', 'CORCELLES', 'corcelles', 'Corcelles', 'C6242', 'KRSLS', '01110', '119', '01119', 4, '06', 6, 243, 222, 200, 17, 14.16, 5.58333, 46.0333, '3597', '51151', '+53428', '460208', 780, 1081)";
			//etape 4 executer la requette
			st.executeUpdate(sql);
			System.out.println("Enrégistrement effectué avec succès !!!! ");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			
			// etape 5 liberer les ressources
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	public static void readVille() {
		
		
	}
	public static void updateVille(int id , String nom) {
		
	}
	public static Boolean deleteVille(int id) {
		
		return true;
		
	}
}
