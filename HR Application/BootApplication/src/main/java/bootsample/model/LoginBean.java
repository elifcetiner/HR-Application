package bootsample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="LoginBean")
@NamedQueries({
	@NamedQuery(name="Login.control",query="Select e from LoginBean e where  e.loginEmail=:loginEmail and e.loginPassword=:loginPassword")
})
public class LoginBean implements Serializable{
	
	 private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="loginId")
	private int loginId;
	
	@Column(name="loginEmail")
	private String loginEmail;
	
	@Column(name="loginPassword")
	private String loginPassword;

	
	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLoginEmail() {
		return loginEmail;
	}

	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public LoginBean(String loginEmail, String loginPassword) {
		super();
		this.loginEmail = loginEmail;
		this.loginPassword = loginPassword;
	}

	public LoginBean() {
		super();
	}
	
	


	
	
}
