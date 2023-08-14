package egovframework.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleVO;

@Repository("daoIBatis")
public class SampleDAOIBatis extends EgovAbstractDAO implements SampleDAO {

	public SampleDAOIBatis() {
		System.out.println("[SampleDAOIBatis() 생성]");
	}

	@Override
	public void insertSample(SampleVO vo) throws Exception {
		System.out.println("[IBatis로 insertSample() 기능 처리]");
		insert("SampleDAO.insertSample",vo);
	}

	@Override
	public void updateSample(SampleVO vo) throws Exception {
		System.out.println("[IBatis로 updateSample() 기능 처리]");
		update("SampleDAO.updateSample",vo);
	}

	@Override
	public void deleteSample(SampleVO vo) throws Exception {
		System.out.println("[IBatis로 deleteinsertSample() 기능 처리]");
		delete("SampleDAO.deleteSample",vo);
	}

	@Override
	public SampleVO selectSample(SampleVO vo) throws Exception {
		System.out.println("[IBatis로 selectSample() 기능 처리]");
		return (SampleVO) select("SampleDAO.selectSample",vo);
	}

	@Override
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception {
		System.out.println("[IBatis로 selectSampleList() 기능 처리]");
		return (List<SampleVO>) list("SampleDAO.selectSampleList",vo);
	}
	
	//조회수
	@Override
	public void viewCount(String id) throws Exception {
		System.out.println("[IBatis로 viewCount() 기능 처리]");
		update("SampleDAO.viewCount",id);
	}
 
	
}
