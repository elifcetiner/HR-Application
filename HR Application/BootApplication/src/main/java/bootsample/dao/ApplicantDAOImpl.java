package bootsample.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import bootsample.model.ApplicantBean;
import bootsample.model.HrApplicationBean;


@Repository
public class ApplicantDAOImpl implements ApplicantDAO{

	private EntityManager entityManager;
	
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		entityManager = entityManagerFactory.createEntityManager();
	}
		
	@Override
	public void save(ApplicantBean applicantBean) {
    	EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(applicantBean);		
		entityTransaction.commit();		
		
	}

	@Override
	public void update(ApplicantBean applicantBean,List<HrApplicationBean> hrApplicationBeans) {
	
	}

	
	@Override
	public List<ApplicantBean> list() {
		TypedQuery<ApplicantBean> query = entityManager.createQuery(
				"Select e from ApplicantBean e", ApplicantBean.class);
		return query.getResultList();
	}

	@Override
	public void remove(int applicantId) {
		
		ApplicantBean applicantBean = get(applicantId);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(applicantBean);
		transaction.commit();
		
	}

	@Override
	public ApplicantBean get(int applicantId) {
		ApplicantBean applicantBean = entityManager.find(ApplicantBean.class, applicantId);
		return applicantBean;
	}


	
}
