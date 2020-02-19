package ru.usupov.project.Figure_project;

import java.util.ArrayList;
import java.util.List;

import ru.usupov.project.exceptions.BoxIsNotOpenedException;
import ru.usupov.project.exceptions.ItemAlreadyPlacedException;
import ru.usupov.project.exceptions.ItemStoreException;
import ru.usupov.project.exceptions.MethodDoesNotExistException;

public class Run {

	public static void main(String[] args) throws ItemStoreException, BoxIsNotOpenedException, MethodDoesNotExistException, ItemAlreadyPlacedException {
		Item box = new Box("Коробка");
		Item bag = new Bag("Мешок");
		Item stack = new Stack("Стопка");
		System.out.println(box.getName());
		System.out.println(bag.getName());
		System.out.println(stack.getName());
		System.out.println(box.getProperties().isEmpty());
		bag.getProperties().add("Плоский");
		System.out.println(box.getProperties().isEmpty()) ;
		System.out.println(bag.getProperties().isEmpty());
		Item brick = new Brick(2.3, "Кирпич");
		System.out.println(bag.getWeight() + brick.getWeight());
		bag.addThing(brick);
		System.out.println(bag.getItems().get("Кирпич").getName());
		Item ball = new Ball(3.4, "Мяч");
		bag.addThing(ball);
		System.out.println(bag.takeoutRandomThing().getName());
		System.out.println(stack.canIPlaceMore());
		brick.getProperties().add("Плоский");
		brick.getProperties().add("Тяжелый");
		box.openBox();
		box.addThing(ball);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
