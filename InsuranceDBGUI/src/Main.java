import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Database db = new Database("root", "root");
		db.selectAllCustomers();
		//db.insertCustomer();
		List<List<Object>> Data = db.selectCustom();
		List<List<Object>> PolData = db.selectPolicy();
		List<List<Object>> PurchaseData = db.selectPurchases();
		System.out.println(Data.size());
		//InsuranceGUI iGUI = new InsuranceGUI();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				InsuranceGUI iGUI = new InsuranceGUI(db, Data, PolData, PurchaseData);
				iGUI.Start();
			}
		});
	}

}
