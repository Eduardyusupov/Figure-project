package ru.usupov.project.Figure_project;

import ru.usupov.project.exceptions.BoxIsNotOpenedException;
import ru.usupov.project.exceptions.ItemAlreadyPlacedException;
import ru.usupov.project.exceptions.ItemStoreException;

public class Box extends Item  {
	
	public static final Double LIMIT_WEIGHT = 10.0;

	public Box(String name) {
		this.setName(name);
	}
	
	
	@Override
	public void addThing(Item item) throws ItemStoreException, BoxIsNotOpenedException, ItemAlreadyPlacedException  {
		chekingIsBoxOpened();
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
	public Item takeoutRandomThing() throws BoxIsNotOpenedException {
		chekingIsBoxOpened();
		return getItems().get(getKeyList().get(getRandom().nextInt(getKeyList().size())));
	}
	
	public void openBox() {
		setOpened(true);
	}
	
	private void chekingIsBoxOpened() throws BoxIsNotOpenedException {
		if(isOpened() == true) {
			return;
		} else {
			throw new BoxIsNotOpenedException("You should open the box");
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
