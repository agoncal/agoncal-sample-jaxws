package org.agoncal.sample.jaxws.endpoint;

import javax.jws.WebService;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
@WebService
public class HelloServletEndpoint {


    // ======================================
    // =          Business methods          =
    // ======================================

    public String saySomethingServlet(String something) {
        return "The HelloServletEndpoint is saying : " + something;
    }
}
