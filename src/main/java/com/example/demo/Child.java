package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="child")
public class Child {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name="adress")
	private String adress;
	
	@ManyToOne(cascade= CascadeType.ALL,targetEntity=Parent.class)
    @JoinColumn(name = "pid")
    private Integer pid;
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getParent() {
		return pid;
	}

	public void setParent(Integer parent) {
		this.pid
		= parent;
	}

	@Override
	public String toString() {
		return "Child [id=" + id + ", adress=" + adress + ", parent=" + pid + "]";
	}
	
	

}
