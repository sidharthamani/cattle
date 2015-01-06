package io.cattle.platform.iaas.api.auth.github;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;

import io.github.ibuildthecloud.gdapi.request.ApiRequest;
import io.github.ibuildthecloud.gdapi.request.resource.impl.AbstractNoOpResourceManager;

public class TokenResourceManager extends AbstractNoOpResourceManager {
    private static final String TOKEN = "token";

    private GithubTokenHandler githubTokenHandler;

    @Override
    public Class<?>[] getTypeClasses() {
        return new Class<?>[] { Token.class };
    }

    @Override
    protected Object createInternal(String type, ApiRequest request) {
        if (!StringUtils.equals(TOKEN, request.getType())) {
            return null;
        }
        return githubTokenHandler.getGithubAccessToken(request);
    }

    @Inject
    public void setGithubTokenHandler(GithubTokenHandler githubTokenHandler) {
        this.githubTokenHandler = githubTokenHandler;
    }
}
