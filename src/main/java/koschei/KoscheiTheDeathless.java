package koschei;

import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// KoscheiTheDeathless связан с Ocean1 через сеттер setOcean и аннотацию @Autowired над методом.
// Аналогично свяжем Rabbit4 с Duck5.

@Component
public class KoscheiTheDeathless {
    private Ocean1 ocean;

    @Autowired
    public void setOcean(Ocean1 ocean) {
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан , " + ocean.toString();
    }
}
