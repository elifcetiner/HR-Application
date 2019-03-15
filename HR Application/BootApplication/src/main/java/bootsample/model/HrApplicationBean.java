package bootsample.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="HrApplicationBean")
public class HrApplicationBean implements Serializable {
	
	 private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="hrApplicationId")
	private int hrApplicationId;
	
	@Column(name="jobTitle")
	private String jobTitle;
	
	@Column(name="jobDescription",columnDefinition = "TEXT")
	private String jobDescription;
	
	@Column(name="numberOfPeople")
	private int numberOfPeople;
	
	@Column(name="lastDate")
	private LocalDate lastDate = LocalDate.now();
	
	public int getHrApplicationId() {
		return hrApplicationId;
	}

	public void setHrApplicationId(int hrApplicationId) {
		this.hrApplicationId = hrApplicationId;
	}


	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}	
	
	public HrApplicationBean(String jobTitle, String jobDescription, int numberOfPeople, LocalDate lastDate) {
		super();
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.numberOfPeople = numberOfPeople;
		this.lastDate = lastDate;
	}

	public LocalDate getLastDate() {
		return lastDate;
	}

	public void setLastDate(LocalDate lastDate) {
		this.lastDate = lastDate;
	}

	public HrApplicationBean() {
		super();
	}
	
}
