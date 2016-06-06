import java.util.ArrayList;

class Company {

	private String name;
	private int count;

	public String getName() {
		return name;
	}

	public Company(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}

public class Main {

	public static void main(String[] args) {
		ArrayList<Company> list = new ArrayList<Company>();
		list.add(new Company("HP", 2000));
		list.add(new Company("Ubisoft", 10000));
		list.add(new Company("BPB", 3000));

		Company temp = new Company("", 0);
		int tempIndex = 0;

		for (int i = 0; i < list.size(); i++) {
			if (temp.getCount() < list.get(i).getCount()) {
				temp = list.get(i);
				tempIndex = i;
			}
		}
		list.remove(tempIndex);

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i).getName());
		}
		System.out.println();
		list.add(new Company("GFK", 700));
		list.add(new Company("cQuest", 200));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}

}
