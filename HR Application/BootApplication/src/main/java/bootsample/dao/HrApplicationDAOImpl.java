package bootsample.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bootsample.model.HrApplicationBean;

@Repository
public class HrApplicationDAOImpl implements HrApplicationDAO {

	private EntityManager entityManager;

	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	@Override
	public List<HrApplicationBean> getAllHrApplication() {
		TypedQuery<HrApplicationBean> query = entityManager.createQuery(
				"Select e from HrApplicationBean e", HrApplicationBean.class);
		return query.getResultList();
	}

	@Override
	public HrApplicationBean getHrApplicationById(int hrApplicationId) {
		HrApplicationBean hrApplicationBean = entityManager.find(HrApplicationBean.class, hrApplicationId);
		return hrApplicationBean;
	}

	@Override
	public void addHrApplication(HrApplicationBean hrApplicationBean) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hrApplicationBean);
		entityTransaction.commit();
		
	}

	@Override
	public void deleteHrApplication(int hrApplicationId) {
		
		HrApplicationBean hrApplicationBean = getHrApplicationById(hrApplicationId);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(hrApplicationBean);
		transaction.commit();
		
	}



}
