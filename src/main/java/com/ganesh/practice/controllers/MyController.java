package com.ganesh.practice.controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.practice.pojos.Item;
@RestController
public class MyController {
	
	Map<Integer, Item> ItemMap= new HashMap<>();
	
	
	@RequestMapping(value="/abc")
	
	public String  welcomePage()
	{
		
		makeObject();
		
		
		
	return "Welcome Ganesh";	
	}

	private void makeObject() {
		// TODO Auto-generated method stub
		
		Item I1= new Item(1,"Cap",10.0f,"to protect from sun");
		ItemMap.put(1, I1);
		
		Item I2= new Item(2,"phone",100.0f,"Conversation");
		ItemMap.put(2, I2);
		
		System.out.println("Objects Inserted");
	}
	
	@RequestMapping(value="/item/{id}/info")
	public Item getIteminfo(@PathVariable("id")int id)
	{
		return ItemMap.get(id);
		
		
	}
	
	@RequestMapping(value="/AllItems")
	public Collection getAllItems()
	{
		
		return  ItemMap.values();
		
		
	}
	@RequestMapping(value="/add")
	public String addItem(@RequestBody Item I3)
	{
		
		ItemMap.put(I3.getItem_Code(), I3);
		
		return "Successfully added to the server";
	}
	@RequestMapping(value="/groupofItems")
	public String addItems(@RequestBody List<Item> items)
	
	
	{
for(Item i:items)
{
	
	ItemMap.put(i.getItem_Code(), i);
	
}
		
		
		return "Items Addded";
	}
	
	@RequestMapping(value="/delete/{id}")
	public String delete(@PathVariable("id") Integer id)
	{
		//Item item = ItemMap.get(id);
		ItemMap.remove(id);
		System.out.println("Item number "+id+" is  Removed");
		
		return "Item number "+ id+" is  Removed";
	}
	
	@RequestMapping(value="/update")
	public String update(@RequestBody Item I)
	{
		
		
		ItemMap.put(I.getItem_Code(), I);
		return "Updated";
	}
	
	
	
	
	
	
	
	

}
