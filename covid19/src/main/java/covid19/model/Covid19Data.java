package covid19.model;

import java.io.Serializable;
import java.util.Date;

public class Covid19Data implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String stateName;
	private String stateCode;
	private Integer confirmed;
	private Integer recovered;
	private Integer death;
	private Integer active;
	private Date lastUpdate;

	public Covid19Data() {
		// TODO Auto-generated constructor stub
	}
	
	public Covid19Data(String stateName, String stateCode, Integer confirmed, Integer recovered, Integer death,
			Integer active, Date lastUpdate) {
		super();
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.death = death;
		this.active = active;
		this.lastUpdate = lastUpdate;
	}

	public Covid19Data(String stateName, String stateCode, Integer confirmed, Integer recovered, Integer death,
			Integer active) {
		super();
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.death = death;
		this.active = active;
	}

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

	public Integer getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Integer confirmed) {
		this.confirmed = confirmed;
	}

	public Integer getRecovered() {
		return recovered;
	}

	public void setRecovered(Integer recovered) {
		this.recovered = recovered;
	}

	public Integer getDeath() {
		return death;
	}

	public void setDeath(Integer death) {
		this.death = death;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Covid19Data [stateName=" + stateName + ", stateCode=" + stateCode + ", confirmed=" + confirmed
				+ ", recovered=" + recovered + ", death=" + death + "]";
	}
	
	

	
}
