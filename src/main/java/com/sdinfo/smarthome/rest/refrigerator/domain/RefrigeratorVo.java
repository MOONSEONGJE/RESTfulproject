package com.sdinfo.smarthome.rest.refrigerator.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RefrigeratorVo {
	private char home_code;
	private String mdate;
	private String product_type;
	private int model_group;
	private int coolhightemp_ad;
	private int coollowtemp_ad;
	private int heatlowtemp_ad;
	private int heathightemp_ad;
	private int roomtemp_ad;
	private int defrosttemp_ad;
	private int outtemp_ad;
	private int fanoutrpm;
	private int fanfeedbackrpm;
	private int liter;
	private String humidity;
	private String roomtemp;
	private String defrosttemp;
	private String outtemp;
	private String changestep;
	private String mainmodeindex;
	private String submodeindex;
	private String leakcount;
	private String refreshtimer;
	private char errorcode;
	private char motionsensor;
	private char dooropen;
	private int power;
	private char comp;
	private char drainheater;
	private char defrostheater;
	private String lamp;
	private int rdate;
	public char getHome_code() {
		return home_code;
	}
	public void setHome_code(char home_code) {
		this.home_code = home_code;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mdate) {
		this.mdate = mdate;
	}
	public String getProduct_type() {
		return product_type;
	}
	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}
	public int getModel_group() {
		return model_group;
	}
	public void setModel_group(int model_group) {
		this.model_group = model_group;
	}
	public int getCoolhightemp_ad() {
		return coolhightemp_ad;
	}
	public void setCoolhightemp_ad(int coolhightemp_ad) {
		this.coolhightemp_ad = coolhightemp_ad;
	}
	public int getCoollowtemp_ad() {
		return coollowtemp_ad;
	}
	public void setCoollowtemp_ad(int coollowtemp_ad) {
		this.coollowtemp_ad = coollowtemp_ad;
	}
	public int getHeatlowtemp_ad() {
		return heatlowtemp_ad;
	}
	public void setHeatlowtemp_ad(int heatlowtemp_ad) {
		this.heatlowtemp_ad = heatlowtemp_ad;
	}
	public int getHeathightemp_ad() {
		return heathightemp_ad;
	}
	public void setHeathightemp_ad(int heathightemp_ad) {
		this.heathightemp_ad = heathightemp_ad;
	}
	public int getRoomtemp_ad() {
		return roomtemp_ad;
	}
	public void setRoomtemp_ad(int roomtemp_ad) {
		this.roomtemp_ad = roomtemp_ad;
	}
	public int getDefrosttemp_ad() {
		return defrosttemp_ad;
	}
	public void setDefrosttemp_ad(int defrosttemp_ad) {
		this.defrosttemp_ad = defrosttemp_ad;
	}
	public int getOuttemp_ad() {
		return outtemp_ad;
	}
	public void setOuttemp_ad(int outtemp_ad) {
		this.outtemp_ad = outtemp_ad;
	}
	public int getFanoutrpm() {
		return fanoutrpm;
	}
	public void setFanoutrpm(int fanoutrpm) {
		this.fanoutrpm = fanoutrpm;
	}
	public int getFanfeedbackrpm() {
		return fanfeedbackrpm;
	}
	public void setFanfeedbackrpm(int fanfeedbackrpm) {
		this.fanfeedbackrpm = fanfeedbackrpm;
	}
	public int getLiter() {
		return liter;
	}
	public void setLiter(int liter) {
		this.liter = liter;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getRoomtemp() {
		return roomtemp;
	}
	public void setRoomtemp(String roomtemp) {
		this.roomtemp = roomtemp;
	}
	public String getDefrosttemp() {
		return defrosttemp;
	}
	public void setDefrosttemp(String defrosttemp) {
		this.defrosttemp = defrosttemp;
	}
	public String getOuttemp() {
		return outtemp;
	}
	public void setOuttemp(String outtemp) {
		this.outtemp = outtemp;
	}
	public String getChangestep() {
		return changestep;
	}
	public void setChangestep(String changestep) {
		this.changestep = changestep;
	}
	public String getMainmodeindex() {
		return mainmodeindex;
	}
	public void setMainmodeindex(String mainmodeindex) {
		this.mainmodeindex = mainmodeindex;
	}
	public String getSubmodeindex() {
		return submodeindex;
	}
	public void setSubmodeindex(String submodeindex) {
		this.submodeindex = submodeindex;
	}
	public String getLeakcount() {
		return leakcount;
	}
	public void setLeakcount(String leakcount) {
		this.leakcount = leakcount;
	}
	public String getRefreshtimer() {
		return refreshtimer;
	}
	public void setRefreshtimer(String refreshtimer) {
		this.refreshtimer = refreshtimer;
	}
	public char getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(char errorcode) {
		this.errorcode = errorcode;
	}
	public char getMotionsensor() {
		return motionsensor;
	}
	public void setMotionsensor(char motionsensor) {
		this.motionsensor = motionsensor;
	}
	public char getDooropen() {
		return dooropen;
	}
	public void setDooropen(char dooropen) {
		this.dooropen = dooropen;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public char getComp() {
		return comp;
	}
	public void setComp(char comp) {
		this.comp = comp;
	}
	public char getDrainheater() {
		return drainheater;
	}
	public void setDrainheater(char drainheater) {
		this.drainheater = drainheater;
	}
	public char getDefrostheater() {
		return defrostheater;
	}
	public void setDefrostheater(char defrostheater) {
		this.defrostheater = defrostheater;
	}
	public String getLamp() {
		return lamp;
	}
	public void setLamp(String lamp) {
		this.lamp = lamp;
	}
	public int getRdate() {
		return rdate;
	}
	public void setRdate(int rdate) {
		this.rdate = rdate;
	}
	

}