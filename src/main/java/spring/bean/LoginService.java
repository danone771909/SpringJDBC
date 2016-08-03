package spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by daniel on 19.07.16.
 */
public class LoginService {
    private DatabaseService databaseService;
    private LogService logService;

    @Autowired
    public LoginService(LogService logService) {
        this.logService = logService;
    }

    public DatabaseService getDatabaseService() {
        return databaseService;
    }

    @Autowired
    public void setDatabaseService(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public LogService getLogService() {
        return logService;
    }

}
