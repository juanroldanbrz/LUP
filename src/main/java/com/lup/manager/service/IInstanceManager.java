package com.lup.manager.service;

import com.lup.model.instance.Instance;
import com.lup.model.instance.InstanceConfiguration;

public interface IInstanceManager {
    Instance.STATUS getInstanceStatus(long instanceId);

    boolean startInstance(long instanceId);

    boolean stopInstance(long instanceId);

    boolean rebootInstance(long instanceId);

    boolean changeInstanceConfiguration(long instanceId, InstanceConfiguration configuration);

    boolean deployWithStoredConfiguration(long instanceId);

    boolean deployWithNewConfiguration(long instanceId, InstanceConfiguration configuration);

    Instance launchNewInstance(long lupSlaveId, InstanceConfiguration configuration);

    boolean deleteInstance(long instanceId);
}
