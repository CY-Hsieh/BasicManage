DROP TABLE IF EXISTS Member;
CREATE TABLE Member (
  id int(11) NOT NULL AUTO_INCREMENT,
  user_Identity varchar(30) NOT NULL,
  password varchar(30) NOT NULL,
  user_Name varchar(30),
  gender int,
  email varchar(50),
  address varchar(100),
  birth_Dt date,
  hire_Dt date,
  resign_Dt varchar(30),
  onBoard varchar(10),
  dept varchar(10),
  job_Title varchar(10),
  eme_Contact varchar(10),
  eme_Phone varchar(10),
  agent_Type varchar(10),
  create_By varchar(30),
  create_At TIMESTAMP,
  update_By varchar(30),
  update_At TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS Department;
CREATE TABLE Member (
  dep_Id int(11) NOT NULL AUTO_INCREMENT,
  dep_Code varchar(30) NOT NULL,
  dep_Name varchar(30) NOT NULL,
  dep_Manager varchar(30),
  create_By varchar(30),
  create_At TIMESTAMP,
  update_By varchar(30),
  update_At TIMESTAMP,
)