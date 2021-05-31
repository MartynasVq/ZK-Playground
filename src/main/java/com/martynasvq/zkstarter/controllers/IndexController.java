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

    @GetMapping({"/new"})
    String test() {
        return "new";
    }

    @GetMapping({"/grid"})
    String grid() {
        return "grid";
    }

    @GetMapping({"/simpletree"})
    String simpletree() {
        return "simpletree";
    }

    @GetMapping({"/upload"})
    String upload() {
        return "upload";
    }

    @GetMapping({"/foreach"})
    String foreach() {
        return "foreach";
    }

}
