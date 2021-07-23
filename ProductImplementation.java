package com.revature.case_study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
//set 9
import java.util.stream.Stream;

class Product {
	int id;
	String name;
	int price;
	
	public Product(int id, String name, int price) {
		//super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
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
public class ProductImplementation {
	
	double sumOfPrice(ArrayList<Product> productList) {
			int sum=0;
			Iterator it =productList.iterator();
			while(it.hasNext())
			{
				Product pt=(Product)it.next();
				if(pt.price>0)
				{
					sum+=pt.price;
					
				}
			} 	
	return sum;
	}
	float  maxPrice(ArrayList<Product> productList) {
		int max=0;
		Iterator it =productList.iterator();
		while(it.hasNext())
		{
			Product pt=(Product)it.next();
			if(max<pt.price)
			{
				max=pt.price;
			}
		}
		
		return max;
		
	}
	float  minPrice(ArrayList<Product> productList) {
		int min=10000;
		Iterator it =productList.iterator();
		while(it.hasNext())
		{
			Product pt=(Product)it.next();
			if(min>pt.price)
			{
				min=pt.price;
			}
		}
		return min;
		}
	List<String> getProductNameList(ArrayList<Product> productList) {
		List<String> namesList = new ArrayList<String>();
		Iterator it=productList.iterator();
		while(it.hasNext())
		{
			Product pt=(Product)it.next();
			namesList.add(pt.getName());
		}
		return namesList;
	}
	public static void main(String[] args) {
		ArrayList plist=new ArrayList<ProductImplementation>();
		plist.add(new Product(20,"Bag",897));
		plist.add(new Product(21,"Book",87));
		plist.add(new Product(22,"Table",89));
		plist.add(new Product(23,"pen",597));
		ProductImplementation pa=new ProductImplementation();
		System.out.println(pa.getProductNameList(plist));
		System.out.println(pa.sumOfPrice(plist));
		System.out.println(pa.maxPrice(plist));
		System.out.println(pa.minPrice(plist));
		
	}
}
