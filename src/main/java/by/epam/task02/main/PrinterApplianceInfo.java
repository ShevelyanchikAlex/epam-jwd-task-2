package by.epam.task02.main;

import by.epam.task02.constant.ExceptionMessageConst;
import by.epam.task02.entity.Appliance;

import java.util.List;

/**
 * PrinterApplianceInfo class.
 * Class for printing info about found appliances.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class PrinterApplianceInfo {

    /**
     * Prints the information about all found appliances.
     * Prints APPLIANCES_LIST_NULL_EXCEPTION_MSG if list is null.
     * Prints APPLIANCES_LIST_EMPTY_EXCEPTION_MSG if list is empty.
     *
     * @param appliances - list of appliances
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println(ExceptionMessageConst.APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(ExceptionMessageConst.APPLIANCES_LIST_EMPTY_EXCEPTION_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}