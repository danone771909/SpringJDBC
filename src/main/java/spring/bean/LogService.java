package spring.bean;

import org.springframework.stereotype.Component;

/**
 * Created by daniel on 19.07.16.
 */
@Component
public class LogService implements Log {
    public boolean log(String s) {
        return true;
    }

    public void logWithoutReturn(String log) {

    }
}
