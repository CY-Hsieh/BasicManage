package com.sideproject.basic.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Entity
public class MemberModel implements Serializable {

	private static final long serialVersionUID = 4604377571664374625L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "serial", name = "id")
	private Integer id;
	
	@Column(name="user_Identity")
	private String identity;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_Name")
	private String name;
	
	@Column(name="gender")
	private Integer gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name="address")
	private String address;
	
	@Column(name="birth_Dt")
	private Date birthDt;
	
	@Column(name="hire_Dt")
	private Date hireDt;
	
	@Column(name="resign_Dt")
	private String resignDt;
	
	@Column(name="onBoard")
	private String onBoard;
	
	@Column(name="dept")
	private String dept;
	
	@Column(name="job_Title")
	private String jobTitle;
	
	@Column(name="eme_Contact")
	private String emeContact;
	
	@Column(name="eme_Phone")
	private String emePhone;
	
	@Column(name="agent_Type")
	private String agentType;
	
	@Column(name="create_By")
	private String createBy;
	
	@Column(name="create_At")
	private Timestamp createAt;
	
	@Column(name="update_By")
	private String updateBy;
	
	@Column(name="update_At")
	private Timestamp updateAt;

}
