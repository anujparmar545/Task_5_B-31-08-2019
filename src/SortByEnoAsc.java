import java.util.Comparator;

public class SortByEnoAsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getEno()-o2.getEno();
	}

}
