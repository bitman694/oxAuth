package org.xdi.oxauth.service.external.context;

import org.xdi.model.custom.script.conf.CustomScriptConfiguration;
import org.xdi.oxauth.model.common.User;
import org.xdi.oxauth.model.configuration.AppConfiguration;
import org.xdi.oxauth.service.AttributeService;
import org.xdi.oxauth.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Yuriy Zabrovarnyy
 */
public class ExternalResourceOwnerPasswordCredentialsContext extends ExternalScriptContext {

    private final AppConfiguration appConfiguration;
    private final AttributeService attributeService;
    private final UserService userService;

    private User user;
    private CustomScriptConfiguration script;

    public ExternalResourceOwnerPasswordCredentialsContext(HttpServletRequest httpRequest, HttpServletResponse httpResponse,
                                                           AppConfiguration appConfiguration, AttributeService attributeService, UserService userService) {
        super(httpRequest, httpResponse);
        this.appConfiguration = appConfiguration;
        this.attributeService = attributeService;
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AppConfiguration getAppConfiguration() {
        return appConfiguration;
    }

    public AttributeService getAttributeService() {
        return attributeService;
    }

    public UserService getUserService() {
        return userService;
    }

    public User getUser() {
        return user;
    }

    public CustomScriptConfiguration getScript() {
        return script;
    }

    public void setScript(CustomScriptConfiguration script) {
        this.script = script;
    }

    @Override
    public String toString() {
        return "ExternalResourceOwnerPasswordCredentialsContext{" +
                "user=" + user +
                "script=" + script +
                "} " + super.toString();
    }
}
