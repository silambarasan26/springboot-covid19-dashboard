package covid19.model;

import java.util.Date;

import com.opencsv.bean.CsvBindByPosition;

public class Covid19Model {

	@CsvBindByPosition(position = 0)
	private String stateName;
	@CsvBindByPosition(position = 7)
	private String stateCode;
	@CsvBindByPosition(position = 1)
	private String confirmed;
	@CsvBindByPosition(position = 2)
	private String recovered;
	@CsvBindByPosition(position = 3)
	private String death;
	@CsvBindByPosition(position = 4)
	private String active;

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getDeath() {
		return death;
	}

	public void setDeath(String death) {
		this.death = death;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

}
