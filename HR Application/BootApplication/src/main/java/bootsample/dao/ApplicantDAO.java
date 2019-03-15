package bootsample.dao;

import java.util.List;
import bootsample.model.ApplicantBean;
import bootsample.model.HrApplicationBean;

public interface ApplicantDAO {

	public List<ApplicantBean> list();
	
	public void remove(int applicantId);
	
	public ApplicantBean get(int applicantId);
	
	public void save(ApplicantBean applicantBean);
	
	public void update(ApplicantBean applicantBean,List<HrApplicationBean> hrApplicationBeans);

}
