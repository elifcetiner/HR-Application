package bootsample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootsample.dao.LoginDAO;
import bootsample.model.LoginBean;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO loginDAO;
	

	@Override
	public void addLogin(LoginBean loginBean) {
		
		loginDAO.addLogin(loginBean);
		
	}

}
