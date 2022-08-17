package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
Duck5 связана с Egg6 через поле и аннотацию, которая подтянет бин Egg6 через метод getEgg()
в классе AppConfig. Метод обозначен аннотацией @Bean, что автоматически подтягивает аргументы в метод.
В качестве аргумента выступает бин Egg6. По аналогии Ocean1 - Island2.
*/

@Component
public class Duck5 {
    @Autowired
    private Egg6 egg;

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}
