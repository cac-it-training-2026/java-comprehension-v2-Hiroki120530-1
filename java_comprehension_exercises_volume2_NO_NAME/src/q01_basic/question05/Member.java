package q01_basic.question05;

public class Member extends AbstMember {
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getRank() {
		return rank;
	}

	public void buyItem() {
		System.out.println(name + "purchased the item at 50% off");
	}

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}
