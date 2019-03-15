package bootsample.dao;

import java.util.List;
import bootsample.model.HrApplicationBean;

public interface HrApplicationDAO {
	
	public List<HrApplicationBean> getAllHrApplication();
		
	public HrApplicationBean getHrApplicationById(int hrApplicationId);
	
	public void addHrApplication(HrApplicationBean hrApplicationBean);
	
	public void deleteHrApplication(int hrApplicationId);
	


}
