package edu.java.bot.validators;

import edu.java.bot.models.SupportedServices;
import java.net.URI;

public class GitHubValidator implements Validator {

    @Override
    public boolean validate(URI uri) {
        String host = uri.getHost();
        if (host != null) {
            return host.equals(SupportedServices.GITHUB.getDomain());
        }
        return false;
    }
}
