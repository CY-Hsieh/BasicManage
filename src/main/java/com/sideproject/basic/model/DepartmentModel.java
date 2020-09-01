package com.sideproject.basic.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class DepartmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "serial", name="dep_Id")
	private Integer depId;
	
	@Column(name="dep_Code")
	private String depCode;
	
	@Column(name="dep_Name")
	private String depName;
	
	@Column(name="dep_Manager")
	private String depManager;
	
	@Column(name="create_By")
	private String createBy;
	
	@Column(name="create_At")
	private Timestamp createAt;
	
	@Column(name="update_By")
	private String updateBy;
	
	@Column(name="update_At")
	private Timestamp updateAt;
	
	

}
