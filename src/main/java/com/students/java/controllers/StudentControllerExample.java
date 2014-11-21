package com.students.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by seanlivingston on 11/21/14.
 */
@Controller
public class StudentControllerExample {
    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index/index");

        String msg = "Running StudentControllerExample.index() method";

        mav.addObject("msg", msg);
        return mav;
    }
}
