package ru.usupov.project.Figure_project;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import ru.usupov.project.exceptions.BoxIsNotOpenedException;
import ru.usupov.project.exceptions.ItemAlreadyPlacedException;
import ru.usupov.project.exceptions.ItemStoreException;
import ru.usupov.project.exceptions.MethodDoesNotExistException;

public class Item {
	
	private Double weight = 0.0;
	private boolean isFlat;
	private boolean isOpened;
	private boolean isAlreadyPlaced;
	private String name;
	private Set<String> properties = new HashSet<String>();
	private Map<String, Item> items = new HashMap<String, Item>();
	private List<String> keyList = new ArrayList<String>();
	private Deque<Item> stack = new ArrayDeque<Item>();
	private Random random = new Random();
	
	
	public boolean isAlreadyPlaced() {
		return isAlreadyPlaced;
	}

	public void setAlreadyPlaced(boolean isAlreadyPlaced) {
		this.isAlreadyPlaced = isAlreadyPlaced;
	}	
	public boolean isOpened() {
		return isOpened;
	}
	public void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}
	public Boolean getIsFlat() {
		return isFlat;
	}
	public void setIsFlat(Boolean isFlat) {
		this.isFlat = isFlat;
	}
	public List<String> getKeyList() {
		return keyList;
	}
	public void setKeyList(List<String> keyList) {
		this.keyList = keyList;
	}
	public Map<String, Item> getItems() {
		return items;
	}
	public Set<String> getProperties() {
		return properties;
	}
	public void setProperties(Set<String> properties) {
		this.properties = properties;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	
	public Deque<Item> getStack() {
		return stack;
	}
	
	
	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}
	
    public void addThing(Item item) throws ItemStoreException, BoxIsNotOpenedException, MethodDoesNotExistException, ItemAlreadyPlacedException  {
    	throw new MethodDoesNotExistException("Method doesn't exist");
	}
	
	public Item takeoutRandomThing() throws MethodDoesNotExistException, BoxIsNotOpenedException {
		throw new MethodDoesNotExistException("Method doesn't exist");
	}

	public Boolean canIPlaceMore() throws MethodDoesNotExistException {
		throw new MethodDoesNotExistException("Method doesn't exist");
	}
	
	
	public void chekingIsFlat(Item item) throws MethodDoesNotExistException {
		throw new MethodDoesNotExistException("Method doesn't exist");
	}
	
	public void openBox() throws MethodDoesNotExistException {
		throw new MethodDoesNotExistException("Method doesn't exist");
	}

	
	
	
	
	
	
	

	
	
	
	
	

}
