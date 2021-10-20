package by.epam.task02.dao.appliance_factory.impl;

import by.epam.task02.constant.ExceptionMessageConstant;
import by.epam.task02.dao.appliance_factory.ApplianceFactory;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Speakers;
import by.epam.task02.entity.criteria.SearchCriteria;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * SpeakersFactory class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class SpeakersFactory extends ApplianceFactory {
    int price;
    double powerConsumption;
    int numberOfSpeakers;
    double cordLength;

    /**
     * {@inheritDoc}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchCriteria.Speakers speakersSearchCriteria = SearchCriteria.Speakers.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (speakersSearchCriteria) {
                    case PRICE -> price = Integer.parseInt(value);
                    case POWER_CONSUMPTION -> powerConsumption = Double.parseDouble(value);
                    case NUMBER_OF_SPEAKERS -> numberOfSpeakers = Integer.parseInt(value);
                    case CORD_LENGTH -> cordLength = Double.parseDouble(value);
                    default -> throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }

        return new Speakers(price, powerConsumption, numberOfSpeakers, cordLength);
    }

}
