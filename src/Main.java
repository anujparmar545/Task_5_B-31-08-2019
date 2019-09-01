
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	static Scanner sc=new Scanner(System.in);
	static ArrayList<Employee> list=new ArrayList<>();
	
	static Employee e4=new Employee(444,"DDD",4000,"hr","Consultant");
	static Employee e1=new Employee(111,"AAA",1000,"TL","Software");
	static Employee e5=new Employee(555,"EEE",5000,"accountant","Marketing");
	static Employee e3=new Employee(333,"CCC",3000,"manager","Operations");
	static Employee e2=new Employee(222,"BBB",2000,"TL","Sales");
	
	
	
	public static void main(String[] args) 
	{
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println("Select choice");
		
		
		while(true)
		{	
			System.out.println("Select 1 to add Employee");
			System.out.println("Select 2 to view Employees");
			System.out.println("Select 3 to remove Employee");
			System.out.println("Select 4 to clear Data");
			System.out.println("Select 5 to change Salary");
			System.out.println("Select 6 to search Employee");
			System.out.println("Select 7 to search dept Wise Employee");
			System.out.println("Select 8 to Sort Employees");
			System.out.println("Select 9 to exit");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1:addEmployee();
			break;
		case 2:viewEmployees();
			break;
		case 3:removeEmployee();
			break;
		case 4:clearData();
			break;
		case 5:changeSalary();
			break;
		case 6:searchEmployee();
			break;
		case 7:deptWiseEmployee();
			break;
		case 8:sort();
		break;
		case 9: System.exit(0);
		break;
		default:
			break;
		}
		}
		
	}

	

	private static void sort() {
		// TODO Auto-generated method stub
		System.out.println("Enter Sorting Basis : eno or ename or salary or designation or dept");
		String basis=sc.next();
		System.out.println("Enter Sorting Order,asc or dsc");
		String order=sc.next();
		 
		if(basis.equals("eno")&&order.equals("asc"))
			Collections.sort(list, new SortByEnoAsc());
		if(basis.equals("eno")&&order.equals("asc"))
			Collections.sort(list, new SortByEnoDsc());
		
		if(basis.equals("ename")&&order.equals("dsc"))
			Collections.sort(list, new SortByEnameDsc());
		if(basis.equals("ename")&&order.equals("asc"))
			Collections.sort(list, new SortByEnameAsc());
		
		if(basis.equals("salary")&&order.equals("dsc"))
			Collections.sort(list, new SortBySalDsc());
		if(basis.equals("salary")&&order.equals("asc"))
			Collections.sort(list, new SortBySalAsc());
		
		if(basis.equals("designation")&&order.equals("dsc"))
			Collections.sort(list, new SortByDesigDsc());
			if(basis.equals("designation")&&order.equals("asc"))
				Collections.sort(list, new SortByDesigAsc());
				
			if(basis.equals("dept")&&order.equals("dsc"))
				Collections.sort(list, new SortByDeptDsc());
			if(basis.equals("dept")&&order.equals("asc"))
				Collections.sort(list, new SortByDeptAsc());
			
			
		viewEmployees();
	}



	private static void deptWiseEmployee() {
		
		System.out.print("Enter dept name whom you want to search");
		String depart=sc.nextLine();
		sc.nextLine();
		for(Employee e:list)
		{
			if(depart.equals(e.getDept()))
				System.out.println("[ Employee Id :"+e.getEno()+", Employee Name :"+e.getEname()+", Employee Salary :"
						+ e.getSalary()+", Employee Designation :"+e.getDesignation()+", Employee Dept :"+e.getDept());
			
		}
		System.out.println();
	}



	private static void searchEmployee() {
		
		System.out.print("Enter employee id whom you want to search");
		int eid=sc.nextInt();
		int flag=0;
		
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			if(eid==e.getEno()) {
				flag=1;
				System.out.println("[ Employee Id :"+e.getEno()+" Employee Name :"+e.getEname()+" Employee Salary :"
						+ e.getSalary()+" Employee Designation :"+e.getDesignation()+" Employee Dept :"+e.getDept());
		
			}
		}
		if(flag==0)
			System.out.println("No Employee Found with eno= "+eid);

		
		System.out.println();
		
	}



	private static void changeSalary() {
		
		System.out.print("Enter employee id for which you want to change salary");
		int eid=sc.nextInt();
		System.out.print("Enter new salary");
		double sal=sc.nextDouble();
		
		for(Employee xx:list)
		{
			if(eid==xx.getEno())
				xx.setSalary(sal);
		}
		
		System.out.println("Salary Update from employee no: "+eid);
		System.out.println();
	}



	private static void clearData() {
		
		list.clear();
		viewEmployees();
		System.out.println();
		
	}



	private static void removeEmployee() {
		
		viewEmployees();
		System.out.print("Enter employee id which you want to delete");
		int eid=sc.nextInt();
		Employee x=new Employee();
		for(Employee xx:list)
		{
			if(eid==xx.getEno())
				x=xx;
		}
		list.remove(x);
		viewEmployees();
		System.out.println();
		
	}



	private static void addEmployee() {
		
		Employee emp=new Employee();
		
		System.out.println("Enter Employee Id");
		int eno=sc.nextInt();
		emp.setEno(eno);
		
		System.out.println("Enter Employee Name");
		String ename=sc.next();
		emp.setEname(ename);
		
		System.out.println("Enter Employee Salary");
		double salary=sc.nextDouble();
		emp.setSalary(salary);
		
		sc.nextLine();
		System.out.println("Enter Employee Designation");
		String designation=sc.nextLine();
		emp.setDesignation(designation);
		
		
		
		System.out.println("Enter Employee Department");
		String dept=sc.nextLine();
		emp.setDept(dept);
		
		
		list.add(emp);
		System.out.println("Employee Added Successfully");
		System.out.println();
	
	}
	
	private static void viewEmployees() {
		
		
		for(Employee e:list)
		{
			System.out.println("[ Employee Id :"+e.getEno()+", Employee Name :"+e.getEname()+", Employee Salary :"
					+ e.getSalary()+", Employee Designation :"+e.getDesignation()+",1"
							+ " Employee Dept :"+e.getDept()+"]");
		}
		System.out.println();
		
	}

}
