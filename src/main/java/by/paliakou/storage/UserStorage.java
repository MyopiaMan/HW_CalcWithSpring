package by.paliakou.storage;

import by.paliakou.service.User;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserStorage {

    private Map<String, User> userMap = new HashMap<String, User>();

//    public UserStorage(){}

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }
}
