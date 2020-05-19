package org.tgieralt.rest.controllers;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author tgier
 */
@Controller
public class MainController {
    
    @RequestMapping(value = "/")
    public void index(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().print("Welcome traveler, entry point for api is: api/");
    }
}
