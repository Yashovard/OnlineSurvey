package com.sst.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "question")
public class Question {
	private int survey_no;
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private int q_id;
	@NotEmpty(message = "enter questions")
	@Column(name = "question")
	private String questions;
	@NotEmpty(message = "enter oa")
	@Column(name = "oa")
	private String oa;
	@NotEmpty(message = "enter ob")
	@Column(name = "ob")
	private String ob;
	@NotEmpty(message = "enter oc")
	@Column(name = "oc")
	private String oc;
	@NotEmpty(message = "enter od")
	@Column(name = "od")
	private String od;
	// @NotEmpty(message = "enter emailId")
	@Column(name = "status")
	private int status;

	public int getSurvey_no() {
		return survey_no;
	}

	public void setSurvey_no(int survey_no) {
		this.survey_no = survey_no;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public String getOa() {
		return oa;
	}

	public void setOa(String oa) {
		this.oa = oa;
	}

	public String getOb() {
		return ob;
	}

	public void setOb(String ob) {
		this.ob = ob;
	}

	public String getOc() {
		return oc;
	}

	public void setOc(String oc) {
		this.oc = oc;
	}

	public String getOd() {
		return od;
	}

	public void setOd(String od) {
		this.od = od;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Question [survey_no=" + survey_no + ", q_id=" + q_id + ", questions=" + questions + ", oa=" + oa
				+ ", ob=" + ob + ", oc=" + oc + ", od=" + od + ", status=" + status + "]";
	}

}
