package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
Ocean1 связан с Island2 через поле и аннотацию, которая подтянет бин Island2 через метод getIsland()
в классе AppConfig. Метод обозначен аннотацией @Bean, что автоматически подтягивает аргументы в метод.
В качестве аргумента выступает бин Wood3. Аналогично свяжем Duck5 и Egg6.
*/
@Component
public class Ocean1 {

    @Autowired
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
