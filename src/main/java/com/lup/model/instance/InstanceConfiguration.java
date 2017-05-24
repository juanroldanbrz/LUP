package com.lup.model.instance;

import com.lup.model.environment.Environment;

import java.util.List;

// Solo para Github, Java y Tomcat por ahora
public class InstanceConfiguration {
    private long id;
    private String githubRepository;
    private String githubBranch;
    private long port;

    /**
     * We send desired environment and get curent environment
     */
    private List<Environment> requiredEnvironments;
    private List<Environment> runningEnvironments;
    private String runningScript;
}
