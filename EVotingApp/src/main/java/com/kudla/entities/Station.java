package com.kudla.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="station")
public class Station {

	@Id
	private String stationid;

	public Station() {

	}

	public Station(String stationid) {
		super();
		this.stationid = stationid;
	}

	public String getStationid() {
		return stationid;
	}

	public void setStationid(String stationid) {
		this.stationid = stationid;
	}

}
