import java.util.*;

public class ImmutableClass {
	
private final String name;
private final int age;
private final List<String> list;
public ImmutableClass(String name, int age, List<String> list) {
		this.name = name;
		this.age = age;
		this.list = list;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public List<String> getList() {
		return new ArrayList(list);
	}
}