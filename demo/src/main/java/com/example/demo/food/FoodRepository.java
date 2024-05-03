package demo.src.main.java.com.example.demo.food;
import java.util.*;
public class FoodRepository {

    Map<Integer, Food> foodTable = new HashMap<>();
    public static Food findFood(int id) {
        return foodTable.get(id);
    }
}
