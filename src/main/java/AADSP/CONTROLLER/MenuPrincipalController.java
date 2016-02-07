
package AADSP.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/menuPrincipal")
public class MenuPrincipalController {
    
    @RequestMapping("/controller")
    public ModelAndView menuPrincipal() {
            String message = "Welcome to Spring MVC 4.0!";
            System.out.println("ENTREI NO CONTROLE");
            return new ModelAndView("/menuPricipal/MenuView", "message", message);
    }
}
