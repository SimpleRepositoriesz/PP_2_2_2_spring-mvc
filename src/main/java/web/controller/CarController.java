package web.controller;

import web.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarController {

    private final CarService carService;

    // Внедрение зависимости CarService через конструктор
    public CarController(CarService carService) {
        this.carService = carService;
    }

    // Обработка запросов на /cars
    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        // Передаем список машин в модель
        model.addAttribute("cars", carService.getCars(count));
        // Возвращаем имя шаблона (cars.html)
        return "cars";
    }
}