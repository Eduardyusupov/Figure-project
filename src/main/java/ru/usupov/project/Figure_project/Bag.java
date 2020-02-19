package ru.usupov.project.Figure_project;

import ru.usupov.project.exceptions.ItemAlreadyPlacedException;
import ru.usupov.project.exceptions.ItemStoreException;

public class Bag extends Item {
	
	public static final Double LIMIT_WEIGHT = 8.3;
	
	public Bag(String name) {
		this.setName(name);
	}
	
	@Override
	public void addThing(Item item) throws ItemStoreException, ItemAlreadyPlacedException  {
		isAlreadyPlaced(item);
		if(Bag.LIMIT_WEIGHT > item.getWeight() + getWeight()) {
			getItems().put(item.getName(), item);
			setWeight(getWeight() + item.getWeight());
			getKeyList().add(item.getName());
		} else {
			throw new ItemStoreException("Limit weight is overflow");
		}
	}
	
	@Override
	public Item takeoutRandomThing() {
		return getItems().get(getKeyList().get(getRandom().nextInt(getKeyList().size())));
	}
	
	private void isAlreadyPlaced(Item item) throws ItemAlreadyPlacedException {
		if(item.isAlreadyPlaced() == false ) {
			item.setAlreadyPlaced(true);
		} else {
			throw new ItemAlreadyPlacedException("You already put this thing");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
