package com.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(
		  name = "TB_SEQ", 
		  sequenceName = "SEQ_NM", 
		  initialValue = 1,
		  allocationSize = 1)
@Table(name = "tb_user")
public class Users {
	
	@Id 
	@GeneratedValue( strategy = GenerationType.SEQUENCE
				   , generator = "TB_USER_SEQ" )
	
	private Long userNo;
	private String userId;
	private String userNm;
	private String password;
	private String brthdy;
	private String mbtlnum;
	private String zip;
	private String rdnmadr;
	private String adres;
	private String wrter;
	private String writngDt;
	private String updusr;
	private String updtDt;
	
	
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBrthdy() {
		return brthdy;
	}
	public void setBrthdy(String brthdy) {
		this.brthdy = brthdy;
	}
	public String getMbtlnum() {
		return mbtlnum;
	}
	public void setMbtlnum(String mbtlnum) {
		this.mbtlnum = mbtlnum;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getRdnmadr() {
		return rdnmadr;
	}
	public void setRdnmadr(String rdnmadr) {
		this.rdnmadr = rdnmadr;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getWrter() {
		return wrter;
	}
	public void setWrter(String wrter) {
		this.wrter = wrter;
	}
	public String getWritngDt() {
		return writngDt;
	}
	public void setWritngDt(String writngDt) {
		this.writngDt = writngDt;
	}
	public String getUpdusr() {
		return updusr;
	}
	public void setUpdusr(String updusr) {
		this.updusr = updusr;
	}
	public String getUpdtDt() {
		return updtDt;
	}
	public void setUpdtDt(String updtDt) {
		this.updtDt = updtDt;
	}

	
}
