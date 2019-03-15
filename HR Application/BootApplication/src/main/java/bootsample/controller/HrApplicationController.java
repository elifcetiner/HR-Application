package bootsample.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import bootsample.model.HrApplicationBean;
import bootsample.service.ApplicantService;
import bootsample.service.HrApplicationService;


@Controller
@RequestMapping("/hrApplications")
public class HrApplicationController {

	@Autowired
	private HrApplicationService hrApplicationService;
	

	@RequestMapping("/secure")
	public String defaultPage(Model model) {
		List<HrApplicationBean> hrApplications = hrApplicationService.getAllHrApplication();
		model.addAttribute("hrApplications", hrApplications);
		return "hrApplicationSecure";
	}
	
	@RequestMapping("/all")
	public String allHrApplications(Model model) {
			
		List<HrApplicationBean> hrApplications = hrApplicationService.getAllHrApplication();
		model.addAttribute("hrApplications", hrApplications);
		return "hrApplicationList";
	}

	@RequestMapping("/hrApplication")
	public String getHrApplicationById(@RequestParam(name = "hrApplicationId") int hrApplicationId, Model model) {
		HrApplicationBean hrApplication = hrApplicationService.getHrApplicationById(hrApplicationId);
		model.addAttribute("hrApplication", hrApplication);
		return "hrApplicationDetail";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addHrApplication(@ModelAttribute("newHrApplication") HrApplicationBean hrApplicationBean,BindingResult bindingResult) {
	
		return "hrApplicationAdd";
	}
	
	@RequestMapping("/deleteHrApplication{hrApplicationId}")
	public String deleteHrApplication(@RequestParam("hrApplicationId") int hrApplicationId, Model model) {
		hrApplicationService.deleteHrApplication(hrApplicationId);
		return "hrApplicationList";
	}
		
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveHrApplication(@ModelAttribute("newHrApplication") HrApplicationBean hrApplicationBean,BindingResult bindingResult) {
	
		hrApplicationService.addHrApplication(hrApplicationBean);
		return "hrApplicationList";
	}
	
}
