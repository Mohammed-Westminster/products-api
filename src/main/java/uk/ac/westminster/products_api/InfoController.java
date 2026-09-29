package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
@RestController
public class InfoController {
    @GetMapping("/Info")
    public String Info(){
        return "This application is currently saved on GITHUB";
    }

}
