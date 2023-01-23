import org.shivam.beans.LoginBean;
import org.shivam.beans.RegistrationBean;
import org.shivam.dao.LoginDao;
import org.shivam.dao.RegistrationDao;

public class Main {

	public static void main(String[] args) {
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername("user");
		loginBean.setPassword("pass");

		LoginDao loginDao = new LoginDao();
		try {
			System.out.println(loginDao.validate(loginBean));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		RegistrationBean registrationBean = new RegistrationBean();
//		registrationBean.setFirstName("Shivam");
//		registrationBean.setLastName("Rathi");
//		registrationBean.setUsername("shivam");
//		registrationBean.setPassword("password");
//
//		RegistrationDao registrationDao = new RegistrationDao();
//
//		try {
//			registrationDao.registerUser(registrationBean);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
