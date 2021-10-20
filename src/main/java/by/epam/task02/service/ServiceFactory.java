package by.epam.task02.service;

import by.epam.task02.service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class with properties <b>instance</b> and <b>ApplianceService</b>.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public final class ServiceFactory {
    /**
     * Field instance - instance of ServiceFactory
     */
    private static final ServiceFactory instance = new ServiceFactory();

    /**
     * Field applianceService - ApplianceServiceImpl
     */
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    /**
     * Private constructor to close the ability of instantiating ServiceFactory.
     */
    private ServiceFactory() {
    }

    /**
     * Gets ApplianceService
     *
     * @return applianceService
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets instance of ServiceFactory
     *
     * @return instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
