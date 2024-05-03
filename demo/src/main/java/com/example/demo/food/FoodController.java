package demo.src.main.java.com.example.demo.food;

@RestController
public class FoodController {
    //메뉴 이름, 가격 , 이미지
    //메뉴 상세 조회
    //URL
    FoodService foodService;

    FoodController(FoodService foodService){
        this.foodService =foodService;
    }
    @GetMapping("/foods/{ids}")
    public Food findFood(@PathVariable int id){
        return foodService.findFood(id);
    }

}
