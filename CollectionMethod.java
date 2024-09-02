import java.util.*;
import java.util.Collection;

public class CollectionMethod {

	public static void main(String[] args) {
		ArrayList.arraylist=new ArrayList();
		arraylist.add(40);
		arrayList.add(50);
		arrayList.add(60);
		
		Collection collection=new ArrayList();
		System.out.println(collection);
		collection.add(10);
		collection.add(30);
		collection.add(20);
		System.out.println(collection);
		collection.addAll(arrayList);
		System.out.println(collection);

	}

}
