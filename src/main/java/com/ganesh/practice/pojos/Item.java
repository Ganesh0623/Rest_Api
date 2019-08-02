package com.ganesh.practice.pojos;

public class Item {
	
	private int Item_Code;
	private String Item_Name;
	private float Item_Cost;
	private String Item_use;
	public int getItem_Code() {
		return Item_Code;
	}
	public void setItem_Code(int item_Code) {
		Item_Code = item_Code;
	}
	public String getItem_Name() {
		return Item_Name;
	}
	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}
	public float getItem_Cost() {
		return Item_Cost;
	}
	public void setItem_Cost(float item_Cost) {
		Item_Cost = item_Cost;
	}
	public String getItem_use() {
		return Item_use;
	}
	public void setItem_use(String item_use) {
		Item_use = item_use;
	}
	@Override
	public String toString() {
		return "Item [Item_Code=" + Item_Code + ", Item_Name=" + Item_Name + ", Item_Cost=" + Item_Cost + ", Item_use="
				+ Item_use + "]";
	}
	public Item(int item_Code, String item_Name, float item_Cost, String item_use) {
		super();
		Item_Code = item_Code;
		Item_Name = item_Name;
		Item_Cost = item_Cost;
		Item_use = item_use;
	}
	
	
	
	

}
