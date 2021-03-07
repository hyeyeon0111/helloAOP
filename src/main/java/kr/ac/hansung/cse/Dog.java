package kr.ac.hansung.cse;

import lombok.Setter;

@Setter
public class Dog implements AnimalType {

	private String myName;
	
	@Override
	public void sound() {
		
		System.out.println("Dog name=" + myName + ":" + "Bow Wow");

	}

}
