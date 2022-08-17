package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Needle7 связано с Deth8 через через поле и аннотацию @Autowired

@Component
public class Needle7 {
    
    @Autowired
    private Deth8 death;

    @Override
    public String toString() {
        return ", смерть Кощея на игле " + death.toString();
    }
}
