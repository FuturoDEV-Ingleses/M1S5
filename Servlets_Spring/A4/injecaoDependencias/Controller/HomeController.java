package M1S5.injecaoDependencias.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import M1S5.injecaoDependencias.Model.ApplicationConfig;
//import M1S5.injecaoDependencias.Model.Estoque;
import M1S5.injecaoDependencias.Model.Produto;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String produto(Model model){
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        //Estoque est = context.getBean(Estoque.class);
        //Produto prod = new Produto(est, "A22");
        //prod.idProduto = "A23E5";
        Produto prod = context.getBean(Produto.class);
        prod.idProduto = "AAA";

        model.addAttribute("local", prod.verificaLocalEstoque());

        return "produto";
    }

}
