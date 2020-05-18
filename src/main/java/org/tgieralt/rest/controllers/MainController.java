package org.tgieralt.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tgier
 */
@Controller
public class MainController {
    
    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}
