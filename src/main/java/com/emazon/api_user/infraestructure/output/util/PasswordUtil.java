package com.emazon.api_user.infraestructure.output.util;

import com.emazon.api_user.infraestructure.util.ConstantsInfraestructure;
import org.mindrot.jbcrypt.BCrypt;

public class PasswordUtil {

    private static final String UTIL_CLASS = ConstantsInfraestructure.UTIL_CLASS;

    private PasswordUtil() {
        throw new UnsupportedOperationException(UTIL_CLASS);
    }

    public static String encryptPassword(String plainPassword) {
        return BCrypt.hashpw(plainPassword, BCrypt.gensalt());
    }

    public static boolean checkPassword(String plainPassword, String hashedPassword) {
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }
}
