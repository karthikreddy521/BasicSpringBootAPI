package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.GregorianCalendar;


@RestController
@RequestMapping("/hello")
public class UserController {

    @GetMapping("/{name}")
    public String sayHello(@PathVariable final String name){
        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
        int min = time.get(Calendar.MINUTE);
        int day = time.get(Calendar.DAY_OF_MONTH);
        int month = time.get(Calendar.MONTH) + 1;
        int year = time.get(Calendar.YEAR);

//        System.out.println("The current time is \t" + hour + ":" + min);
//        System.out.println("Today's date is \t" + month + "/" + day + "/"
//                + year);

        if (hour < 12)
            return "Good Morning!" + name;
        else if (hour < 17 && !(hour == 12))
            return "Good afternoon!" + name;
        else if (hour == 12)
            return "Good noon!" + name;
        else
            return "Good evening!" + name;


    }


}
