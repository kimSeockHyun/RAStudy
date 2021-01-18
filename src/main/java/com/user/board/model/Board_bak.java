package com.user.board.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@SequenceGenerator(
		  name = "MEMBER_SEQ_GENERATOR", 
		  sequenceName = "MEMBER_SEQ", 
		  initialValue = 1,
		  allocationSize = 1)
@Table(name = "TB_BOARD")
public class Board_bak {
	
	@Id 
	@GeneratedValue( strategy = GenerationType.SEQUENCE
				   , generator = "MEMBER_SEQ_GENERATOR" )
	private Long Id;
	private String userId;
	private String userPw;
	private String userNm;
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserNm() {
		return userNm;
	}
	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	
}
