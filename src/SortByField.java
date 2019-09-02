import java.util.Collections;
import java.util.Comparator;

public class SortByField implements Comparator<Employee> {

	static String basis;
	static String order;
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		
		if(basis.equals("eno")&&order.equals("asc"))
			return (int)(o2.getEno()-o1.getEno());
		if(basis.equals("eno")&&order.equals("asc"))
			return (int)(o1.getEno()-o2.getEno());
		
		if(basis.equals("ename")&&order.equals("dsc"))
			return o2.getEname().compareTo(o1.getEname());
		if(basis.equals("ename")&&order.equals("asc"))
			return o1.getEname().compareTo(o2.getEname());
		
		if(basis.equals("salary")&&order.equals("dsc"))
			return (int)(o2.getSalary()-o1.getSalary());
		if(basis.equals("salary")&&order.equals("asc"))
			return (int)(o1.getSalary()-o2.getSalary());
		
		if(basis.equals("designation")&&order.equals("dsc"))
			return o2.getDesignation().compareTo(o1.getDesignation());
			if(basis.equals("designation")&&order.equals("asc"))
				return o1.getDesignation().compareTo(o2.getDesignation());
				
			if(basis.equals("dept")&&order.equals("dsc"))
				return o2.getDept().compareTo(o1.getDept());
			if(basis.equals("dept")&&order.equals("asc"))
				return o1.getDept().compareTo(o2.getDept());
			
		
		
		
		
		
		
		
		
		
		
		
		return o1.getDept().compareTo(o2.getDept());
	}

}
