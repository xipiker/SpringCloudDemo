package pers.xipiker.springcloudzuulclient;

import org.springframework.http.client.ClientHttpResponse;

public interface ZuulFallbackProvider {
    String getRoute();

    ClientHttpResponse fallbackResponse(String var1, Throwable var2);
}

