package com.lup.model.installation;

import com.lup.model.environment.Environment;

import static com.lup.model.installation.EnvironmentInstaller.PREFERED_INSTALLATION_WAY.DOWNLOAD_URL_AND_AUTOCONFIGURE;

public class EnvironmentInstaller extends Environment {
    public enum PREFERED_INSTALLATION_WAY {
        EXECUTE_SCRIPT,
        DOWNLOAD_URL_AND_EXECUTE_SCRIPT,
        DOWNLOAD_URL_AND_AUTOCONFIGURE
    }
    private String packageUrl;
    private PREFERED_INSTALLATION_WAY preferedInstallationWay = DOWNLOAD_URL_AND_AUTOCONFIGURE;
    private InstallationScript installationScript;

}
