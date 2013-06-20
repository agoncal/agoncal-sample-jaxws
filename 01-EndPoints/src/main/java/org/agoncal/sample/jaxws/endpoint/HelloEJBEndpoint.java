package org.agoncal.sample.jaxws.endpoint;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@WebService
@Stateless
public class HelloEJBEndpoint {


    // ======================================
    // =          Business methods          =
    // ======================================

    public String saySomethingEJB(String something) {
        return "The HelloEJBEndpoint is saying : " + something;
    }
}
