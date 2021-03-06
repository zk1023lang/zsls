package com.zsls.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *@ClassName User
 *@Description TODO
 *@Author
 *@Date 2019/1/23 18:08
 *@Version 1.0
 */
@Table(name = "t_user")
public class User implements Serializable {


	private static final long serialVersionUID = -1765812327135385866L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="student_no")
	private String studentNo;
	@Column(name="college_code")
	private String collegeCode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getCollegeCode() {
		return collegeCode;
	}

	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}

	public User() {
	}

	public User(String studentNo, String collegeCode) {
		this.studentNo = studentNo;
		this.collegeCode = collegeCode;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", studentNo='" + studentNo + '\'' +
				", collegeCode='" + collegeCode + '\'' +
				'}';
	}

}
