package M1S5.injecaoDependencias.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    
    @Bean
    public Estoque estoque(){
        return new Estoque();
    }

    @Bean
    public Produto produto(){
        return new Produto(estoque());
    }


}
