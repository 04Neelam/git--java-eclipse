package com.gitjava.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemos {

	public static void main(String[] args) {
		Student st1 = new Student(1,"koki", 19, "durg");
		Student st2 = new Student(2,"nidhi", 20, "bhilai");
		Student st3 = new Student(3,"mili", 21, "raipur");
		Student st4 = new Student(4,"neelam", 22, "pune");
		Student st5 = new Student(5,"sakshi", 24, "mumbai");
		Student st6 = st5;
		
		List<Student> l = new ArrayList<Student>();
		
		l.add(st1);
		l.add(st2);
		l.add(st3);
		l.add(st4);
		l.add(st5);
		l.add(st6);
		
		Set<Student> hset = new HashSet<Student>();
		
		hset.add(st1);
		hset.add(st2);
		hset.add(st3);
		hset.add(st4);
		hset.add(st5);
		hset.add(st6);
		
		Set<Student> lset = new LinkedHashSet<Student>();
		
		lset.add(st1);
		lset.add(st2);
		lset.add(st3);
		lset.add(st4);
		lset.add(st5);
		lset.add(st6);
		
		System.out.println("list of students is ---"+ l);
		System.out.println("set of students is---"+ hset);
		System.out.println("set of studentslist is---"+ lset);
		
	}

}

class Student implements Comparable<Student>{
	
	int id;
	String name;
	String address;
	int age;

	public Student(int id, String name, int age, String address) {
		this.id = id;
		this.name=name;
		this.age=age;
		this.address= address;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}
