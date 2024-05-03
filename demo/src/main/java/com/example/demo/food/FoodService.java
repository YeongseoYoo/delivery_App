package demo.src.main.java.com.example.demo.food;

public class FoodService {

    FoodRepository foodRepository;

    FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }
    public Food findFood(){
        return FoodRepository.findFood();
    }
}
