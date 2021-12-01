package com.Policyholder360API.conf;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        packages("com.Policyholder360API");
    }
}