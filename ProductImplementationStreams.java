package com.revature.case_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//set 9
import java.util.stream.Stream;

class ProductStream {
	int id;
	String name;
	int price;
	
	public ProductStream(int id, String name, int price) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductStream [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class ProductImplementationStreams {
	
	double sumOfPrice(ArrayList<ProductStream> productList) {
		List<Integer> x=productList.stream().map(product->product.getPrice()).collect(Collectors.toList());
		Integer x2=x.stream().reduce((a,b)->(a+b)).get();
		return x2;
	}
	float  maxPrice(ArrayList<ProductStream> productList) {
		Optional<Integer> x=productList.stream().map(p->p.getPrice()).max(Integer::compare);
		Integer x1=x.get();
		return x1;
	}
	float  minPrice(ArrayList<ProductStream> productList) {
		Optional<Integer> x=productList.stream().map(p->p.getPrice()).min(Integer::compare);
		Integer x1=x.get();
		return x1;
	}
	List<String> getProductNameList(ArrayList<ProductStream> productList) {
		List<String> namesList=productList.stream().map(n->n.getName()).collect(Collectors.toList());
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<ProductImplementationStreams>();
		plist.add(new ProductStream(20,"Bag",897));
		plist.add(new ProductStream(21,"Book",87));
		plist.add(new ProductStream(22,"Table",89));
		plist.add(new ProductStream(23,"pen",597));
		ProductImplementationStreams pa=new ProductImplementationStreams();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
	}
}
