package com.revature.case_study;
class Employee{
	String name;
	String ssn;
	String dept;
	int salary;
	Employee() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String name, String ssn, String dept, int salary) {
		super();
		this.name = name;
		this.ssn = ssn;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", ssn=" + ssn + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class EmployeeApp {

	
	Employee getEmployeeInfo(String str) {
		

 /*  given string    -   "abc@4356-uuuii#98000"   ;
    name =abc,  ssn=4326,  dept=uuuii, sal=98
    Cretae Employee Object with above details and return MEployee Object*/

		StringBuffer s1=new StringBuffer(str);
		String name=s1.substring(0, 3);
		//System.out.println(name);
		String ssn= s1.substring(4,8);
		//System.out.println(ssn);
		String dept=s1.substring(9,14);
		//System.out.println(dept);
		String sal=s1.substring(15,17);
		String x=sal;
		int salary=Integer.parseInt(x);
		Employee e=new Employee(name,ssn,dept,salary);
		return e;
				
	}
//	
	String getEmployeeLevel(Employee e) {

///* 
//    in a given employee if ssn is - 1 to 10 employee level is L1
//if ssn is - 61 to 120 employee level is L2
//if ssn is - 121 to 180 employee level is L3
//else L4
//rteurn the given level"
//
//*/
//
	String level=null;
	
	int te=Integer.parseInt(e.ssn);
	if(te>=1 && te<=10)
	{
		level="L1";
		
	}
	else if(te>=61 && te<=120)
	{
		level="L2";
		
	}
	else if(te>-121 && te<=180)
	{
		level="L3";
	}
	else 
	{
		level="L4";
	}
	return level;
			
	}
	
	public static void main(String[] args) {
		EmployeeApp e=new EmployeeApp();
		System.out.println(e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println(e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
		
	}
}
 