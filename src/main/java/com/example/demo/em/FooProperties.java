package com.example.demo.em;

import java.util.Map;

public class FooProperties {
	private String name;
	private String age;
	private Map<String, Object> map;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	@Override
	public String toString() {
		return "FooProperties [name=" + name + ", age=" + age + ", map=" + map + "]";
	}
	
}
