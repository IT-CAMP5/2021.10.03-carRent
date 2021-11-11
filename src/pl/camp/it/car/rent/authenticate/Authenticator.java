package pl.camp.it.car.rent.authenticate;

import org.apache.commons.codec.digest.DigestUtils;
import pl.camp.it.car.rent.database.DataBase;
import pl.camp.it.car.rent.model.User;

public class Authenticator {
    public static final String MD5_SEED = "96z6Gva6LwjzxHPBvobEDvtwsH7EQFW0skX7";
    private static final Authenticator instance = new Authenticator();

    private Authenticator() {
    }

    public boolean authenticate(String login, String password) {
        DataBase dataBase = DataBase.getInstance();
        User user = dataBase.getUserByLogin(login);
        return user != null && user.getPassword().equals(DigestUtils.md5Hex(MD5_SEED + password));
    }

    public static Authenticator getInstance() {
        return instance;
    }
}
