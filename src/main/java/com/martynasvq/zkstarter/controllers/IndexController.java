package com.martynasvq.zkstarter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping({"/second"})
    String secondPage() {
        return "second";
    }

    @GetMapping({"/register"})
    String portalLayout() {
        return "registration";
    }


}
