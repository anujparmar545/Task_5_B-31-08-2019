import java.util.Comparator;

public class SortByEnoDsc implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o2.getEno()-o1.getEno();
	}

}
