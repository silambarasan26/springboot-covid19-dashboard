package covid19.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import covid19.model.Covid19Data;
import covid19.model.Covid19Model;
import covid19.utils.CSVParserUtils;

@Service
public class Covid19DataService implements ICovid19DataService {

	private List<Covid19Data> stateWiseList = new ArrayList<Covid19Data>();

	@PostConstruct
	public void fetchPincodeDate() throws IOException, InterruptedException {

		List<Covid19Data> tempStateList = new ArrayList<Covid19Data>();
		CSVParserUtils parserUtils = new CSVParserUtils();
		for (Covid19Model record : parserUtils.stateWiseData()) {
			if (!"Total".equalsIgnoreCase(record.getStateName())  && !"State".equalsIgnoreCase(record.getStateName())) {
				Covid19Data stateWiseData = new Covid19Data(record.getStateName(), record.getStateCode(),
						Integer.valueOf(record.getConfirmed()), Integer.valueOf(record.getRecovered()),
						Integer.valueOf(record.getDeath()), Integer.valueOf(record.getActive()));
				tempStateList.add(stateWiseData);
			}
		}

		this.stateWiseList = tempStateList;
	}

	@Override
	public List<Covid19Data> getStateWiseList() {
		return stateWiseList;
	}

}
