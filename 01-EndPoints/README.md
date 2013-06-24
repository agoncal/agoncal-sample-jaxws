# Sample - JAX-WS - End Points

## Purpose of this sample

The purpose of this sample is to show that you can have an EJB and a Servlet endpoint on a SOAP Web Service

## Compile and package

Being Maven centric, you can compile and package it with `mvn clean compile`, `mvn clean package` or `mvn clean install`. The `package` and `install` phase will automatically trigger the unit tests. Once you have your war file, you can deploy it.

## Deploy the sample

This sample has been tested with GlassFish 4.0.0 in several modes :

* GlassFish runtime : [download GlassFish](http://glassfish.java.net/public/downloadsindex.html), install it, start GlassFish (typing `asadmin start-`domain) and once the application is packaged deploy it (using the admin console or the command line `asadmin deploy target/sampleArquilianWytiwyr.war`)
* GlassFish embedded : use the [GlassFish Maven Plugin](http://maven-glassfish-plugin.java.net/) by running `mvn clean package embedded-glassfish:run`

## Execute the sample

Once deployed you can access the WSDL at the following URLs :

* [http://localhost:8080/sampleJAXWSEndpoints/HelloServletEndpointService?wsdl](http://localhost:8080/sampleJAXWSEndpoints/HelloServletEndpointService?wsdl)
* [http://localhost:8080/HelloEJBEndpointService/HelloEJBEndpoint?wsdl](http://localhost:8080/HelloEJBEndpointService/HelloEJBEndpoint?wsdl)

## Test the sample

Use [SOAPUI](http://www.soapui.org/) to test both Web Services or GlassFish Tester facility : 

* [http://localhost:8080/sampleJAXWSEndpoints/HelloServletEndpointService?tester](http://localhost:8080/sampleJAXWSEndpoints/HelloServletEndpointService?tester)
* [http://localhost:8080/HelloEJBEndpointService/HelloEJBEndpoint?tester](http://localhost:8080/HelloEJBEndpointService/HelloEJBEndpoint?tester)

<div class="footer">
    <span class="footerTitle"><span class="uc">a</span>ntonio <span class="uc">g</span>oncalves</span>
</div>
