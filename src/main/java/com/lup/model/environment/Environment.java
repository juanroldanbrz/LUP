package com.lup.model.environment;

public class Environment {
    //@TODO Organize this better (one class containing JDK, Tomcat, Maven, and ANT other NPM, other MYSQL, GIT...)
    public enum ENVIRONMENT_TYPE {
        JDK,
        TOMCAT,
        NODEJS,
        PYTHON,
        MAVEN,
        MYSQL,
        GIT,
        ANT
    }

    private String EnvironmentVersion;
    private String EnvironmentPath;
    private ENVIRONMENT_TYPE environmentType;
}
