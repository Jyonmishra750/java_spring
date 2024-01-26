package org.jt.spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map; 

@Controller
public class HelloController {
    @GetMapping({"/home", "/"})
    public String SpringWeb(Model model) {

        LocalDate myDateObj = LocalDate.now();
        LocalTime myTimeObj = LocalTime.now();
        DateTimeFormatter myDateFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter myTimeFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        String date = myDateObj.format(myDateFormatObj);
        String time = myTimeObj.format(myTimeFormatObj);

        String heading = "THIS IS FIRST SPRING-BOOT APPLICATION";

        var person1 = new Person( "Jyoti Narayan Mishra", "MCA", "Cuttack", "jyotinarayan@gmail.com","+91 7606097028");
        var person2 = new Person( "Pradosh Pattanaik", "BSc. CS", "Cuttack", "pradoshkumar@gmail.com","+91 8249745690");
        var person3 = new Person( "Saswat Swarup", "BSc. CS", "Bhubaneswar", "saswatswarup@gmail.com","+91 7978624851");

        var course1 = new Course(1, "Web Programming", "6 Months", "5000.00");
        var course2 = new Course(2, "Python", "6 Months", "10000.00");
        var course3 = new Course(3, "Full-Stack Java", "6 Months", "15000.00");

        var courses = List.of(course1, course2, course3);

        model.addAllAttributes(Map.of("courses", courses, "person1",person1, "person2", person2, "person3", person3, "heading",heading, "date",date, "time",time));
        

        return "Home";
    }
    
}
