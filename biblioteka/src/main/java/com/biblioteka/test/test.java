package com.biblioteka.test;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "biblioteka", eager = true)
public class test {
	
	public test() {
		System.out.println("Biblioteka") ;
		}
		
		public String getMessage() {
			return "Biblioteka";
	}

}
