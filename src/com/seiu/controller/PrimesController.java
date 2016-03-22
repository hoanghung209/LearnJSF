package com.seiu.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class PrimesController implements Serializable {
	
	@PostConstruct
	public void init(){
		
	}
	
	
	public String getKeyword(){
		return "primes-keyword";
	}
}
