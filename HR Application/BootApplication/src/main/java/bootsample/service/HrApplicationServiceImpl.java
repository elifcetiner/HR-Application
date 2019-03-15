package bootsample.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bootsample.dao.HrApplicationDAO;
import bootsample.model.HrApplicationBean;


@Service
public class HrApplicationServiceImpl implements HrApplicationService {

	@Autowired
	private HrApplicationDAO hrApplicationDAO;
	
	@Override
	public List<HrApplicationBean> getAllHrApplication() {
		
		return hrApplicationDAO.getAllHrApplication();
	}

	@Override
	public HrApplicationBean getHrApplicationById(int hrApplicationId) {
		
		return hrApplicationDAO.getHrApplicationById(hrApplicationId);
	}

	@Override
	public void addHrApplication(HrApplicationBean hrApplicationBean) {
	
		hrApplicationDAO.addHrApplication(hrApplicationBean);
		
	}

	@Override
	public void deleteHrApplication(int hrApplicationId) {
		
		hrApplicationDAO.deleteHrApplication(hrApplicationId);
		
	}

	

}
