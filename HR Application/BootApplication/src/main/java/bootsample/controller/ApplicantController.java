package bootsample.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import bootsample.model.ApplicantBean;
import bootsample.model.HrApplicationBean;
import bootsample.service.ApplicantService;
import bootsample.service.HrApplicationService;

@Controller
@RequestMapping("/applicants")
public class ApplicantController {

	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	private HrApplicationService hrApplicationService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView addApplicant(@ModelAttribute("newApplicant") ApplicantBean applicantBean,BindingResult bindingResult) {
		Map<String, Object> model = new HashMap<String,Object>();
		model.put("hrApplications",  hrApplicationService.getAllHrApplication());
		return new ModelAndView("applicantAdd",model);
	}
    
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveApplicant(@ModelAttribute("newApplicant") ApplicantBean applicantBean,BindingResult bindingResult){
		applicantService.save(applicantBean);
	
		return "redirect:/hrApplications/secure";
	}
	
	@RequestMapping("/all")
	public String allApplicant(Model model) {
	
		List<ApplicantBean> applicantBeans = applicantService.list();
		model.addAttribute("applicantBeans",applicantBeans);
		return "applicantList";

	}

	
	@RequestMapping("/deleteApplicant{applicantId}")
	public String deleteApplicant(@RequestParam("applicantId") int applicantId, Model model) {
		applicantService.remove(applicantId);
		return "applicantList";
	}
	
	
	@RequestMapping("/applicant")
	public String getApplicantById(@RequestParam(name = "applicantId") int applicantId, Model model) {
		ApplicantBean applicantBean = applicantService.get(applicantId);
		model.addAttribute("applicantBean",applicantBean);
		return "applicantDetail";
		
	}
	


}
