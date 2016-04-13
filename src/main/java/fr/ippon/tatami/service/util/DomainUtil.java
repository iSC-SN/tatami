package fr.ippon.tatami.service.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for managing the user domain.
 *
 * @author Julien Dubois
 */
public class DomainUtil {

    private final Logger log = LoggerFactory.getLogger(DomainUtil.class);

    private DomainUtil() {
    }

    public static String getDomainFromEmail(String email) {
        if (email == null) {
            return null;
        }
        return email.substring(email.indexOf("@") + 1, email.length());
    }

    public static String getEmailFromUsernameAndDomain(String username, String domain) {
        return username + "@" + domain;
    }

    public static String getUsernameFromEmail(String email) {
        if (email == null) {
            return null;
        }
        return email.substring(0, email.indexOf("@"));
    }
}