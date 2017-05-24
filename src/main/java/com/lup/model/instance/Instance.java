package com.lup.model.instance;

public class Instance {
    public enum STATUS {
        INITIALIZING,
        RUNNING,
        STOPPING,
        STOPPED
    }

    private long id;
    private InstanceConfiguration configuration;
    private STATUS instanceStatus;
    private String publicURL;
}
