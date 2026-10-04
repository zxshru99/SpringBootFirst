package com.telusko.controller;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
 public void code() {
	 System.out.println("Coding with the help of laptop");

 }
}
