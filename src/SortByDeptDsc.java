import java.util.Comparator;

public class SortByDeptDsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o2.getDept().compareTo(o1.getDept());
	}

}
