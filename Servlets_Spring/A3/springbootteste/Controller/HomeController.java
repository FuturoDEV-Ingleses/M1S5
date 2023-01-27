package futuroDEV.springbootteste.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;


@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/receberMensagem")
    public String mensagem( 
        @RequestParam(name = "mensagem", required = false,defaultValue = "futuroDEV") 
        String mensagem, Model model){


        model.addAttribute("frase", mensagem);



        return "mensagem";
    }

}
