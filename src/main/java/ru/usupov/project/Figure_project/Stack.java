package ru.usupov.project.Figure_project;

import java.util.Iterator;

import ru.usupov.project.exceptions.ItemAlreadyPlacedException;
import ru.usupov.project.exceptions.ItemStoreException;

public class Stack extends Item {
	
	public static final int MAX_AMOUNT_THINGS = 2;
	
	
	public Stack(String name) {
		this.setName(name);
	}
	
	@Override
	public void addThing(Item item) throws ItemStoreException, ItemAlreadyPlacedException {
		chekingIsFlat(item);
		isAlreadyPlaced(item);
		if(getStack().size() < Stack.MAX_AMOUNT_THINGS && item.getIsFlat() == true) {
			getStack().add(item);
		} else {
			throw new ItemStoreException("Limit amount of things is overflow or thing isn't flat you can't place it");
		}
	}
	
	@Override
	public Boolean canIPlaceMore() {
		if(getStack().size() < Stack.MAX_AMOUNT_THINGS) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void chekingIsFlat(Item item) {
		for(Iterator<String> iterator = item.getProperties().iterator(); iterator.hasNext();) {
			String element = iterator.next();
			if(element.equals("Плоский")) {
				item.setIsFlat(true);
			} 
		}
		
	}
	
	private void isAlreadyPlaced(Item item) throws ItemAlreadyPlacedException {
		if(item.isAlreadyPlaced() == false ) {
			item.setAlreadyPlaced(true);
		} else {
			throw new ItemAlreadyPlacedException("You already put this thing");
		}
	}



	
	

}
