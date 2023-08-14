package egovframework.sample.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;

@Controller
@SessionAttributes("sample")
public class SampleController {

	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/insertSample.do" , method=RequestMethod.GET)
	public String insertSampleView(SampleVO vo) throws Exception{
		return "insertSample";
	}
	
	@RequestMapping(value="/insertSample.do" , method=RequestMethod.POST)
	public String insertSample(SampleVO vo) throws Exception{
		
			sampleService.insertSample(vo);

		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/updateSample.do")
	public String updateSample(@ModelAttribute("sample")SampleVO vo) throws Exception{
		sampleService.updateSample(vo);
		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/deleteSample.do")
	public String deleteSample(SampleVO vo) throws Exception{
		sampleService.deleteSample(vo);
		return "forward:selectSampleList.do";
	}
	
	@RequestMapping(value="/selectSample.do")
	public String selectSample(SampleVO vo,Model model) throws Exception {
		sampleService.viewCount(vo.getId()); //조회수 증가 시켜주기
		model.addAttribute("sample", sampleService.selectSample(vo));
		return "selectSample";
	}
	
	@RequestMapping(value="/selectSampleList.do")
	public String selectSampleList(SampleVO vo, ModelMap model) throws Exception {
		
		model.addAttribute("sampleList", sampleService.selectSampleList(vo));
		
		return "selectSampleList";
	}
	

}
