package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	@Resource(name="daoIBatis")
	private SampleDAO sampleDAO;
	
	@Resource(name="egovIdGnrService")
	private EgovIdGnrService egovIdGnrService;
	
	public SampleServiceImpl() {
		System.out.println("[SampleServiceImpl() 생성]");
	}
	
	public void insertSample(SampleVO vo) throws Exception {
		String id = egovIdGnrService.getNextStringId();
		vo.setId(id);
		sampleDAO.insertSample(vo);
	}
	
	public void updateSample(SampleVO vo) throws Exception {
		sampleDAO.updateSample(vo);
	}
	
	public void deleteSample(SampleVO vo) throws Exception {
		sampleDAO.deleteSample(vo);
	}
	
	public SampleVO selectSample(SampleVO vo) throws Exception {
		return sampleDAO.selectSample(vo);
	}
	
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		return sampleDAO.selectSampleList(vo);
	}
	
	//조회수
	public void viewCount(String id) throws Exception {
		sampleDAO.viewCount(id);
	}

}
