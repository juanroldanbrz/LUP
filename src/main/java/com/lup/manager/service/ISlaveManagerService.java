package com.lup.manager.service;

import com.lup.manager.exception.InstallationException;
import com.lup.model.environment.Environment;
import com.lup.model.installation.EnvironmentInstaller;
import com.lup.model.slave.monitor.SlaveMonitor;
import com.sun.istack.internal.Nullable;

import java.util.List;

public interface ISlaveManagerService {

    boolean pingSlave(long slaveId);

    @Nullable
    List<Environment> getInstalledEnvironmentsInfo(long slaveId);

    @Nullable
    Environment getInstalledEnvironmentInfo(long slaveId, Environment.ENVIRONMENT_TYPE requestEnvironmentInfo);

    Environment installEnvironment(long slaveId, EnvironmentInstaller installer) throws InstallationException;

    /**
     * Still don't know if this is good
     */
    Environment reinstallEnvironment(long slaveId, Environment environment) throws InstallationException;

    SlaveMonitor getSlaveMonitor(long slaveId);
}
