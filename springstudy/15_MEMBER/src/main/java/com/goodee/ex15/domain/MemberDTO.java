package com.goodee.ex15.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {
	private Long memberNo;
	private String id;
	private String pw;
	private String name;
	private String email;
	private Integer agreeState;
	private Date signIn;
	private Date pwModified;
	private Date infoModified;
	private String sessionId;
	private Date sessionLimit;

	
}
