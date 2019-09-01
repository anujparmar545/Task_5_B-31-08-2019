import java.util.Comparator;

public class SortByDesigDsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o2.getDesignation().compareTo(o1.getDesignation());
	}

}
