package com.gitjava.sample;

public class CloningDemo{

	public static void main(String[] args) throws CloneNotSupportedException{
		 Address ad = new Address("pune");
		 Employee e1 = new Employee(1,"neelam", ad);
		 Employee e2 = (Employee)e1.clone();
		 System.out.println("before updating");
		System.out.println("Employee details e1--" + e1);
		System.out.println("Employee details e2--" + e2);
		System.out.println("after updating");
		e2.setName("Tripti");
		e2.getAd().setAd("mumbai");
		//System.out.println("Shallow clonning");
		System.out.println("deep clonning");
		System.out.println("Employee details e1--" + e1);
		System.out.println("Employee details e2--" + e2);
		
		
	}

}

class Employee implements Cloneable{
	int id;
	String name;
	Address ad;
	
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
	
	public Employee(int id, String name, Address ad) {
		this.id=id;
		this.name=name;
		this.ad= ad;
		
			}
	public Object clone() throws CloneNotSupportedException{
		Employee clonned= (Employee)super.clone();
		clonned.setAd((Address)clonned.getAd().clone());
		return clonned;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
	
}

class Address implements Cloneable {
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	String ad;
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public Address(String ad){
		this.ad= ad;
	
	}
	@Override
	public String toString() {
		return ad;
	}
	
	
}
