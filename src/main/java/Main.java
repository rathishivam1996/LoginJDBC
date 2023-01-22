import org.shivam.dao.LoginDao;
import org.shivam.loginbean.LoginBean;

public class Main {

	public static void main(String[] args) {
		LoginBean loginBean = new LoginBean();
		loginBean.setUsername("shivam");
		loginBean.setPassword("shivam");

		LoginDao loginDao = new LoginDao();
		try {
			System.out.println(loginDao.validate(loginBean));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
