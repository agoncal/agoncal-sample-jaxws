package org.agoncal.sample.jaxws.amazon;

import com.amazon.webservices.awsecommerceservice._2011_08_01.*;

public class Main
{

   private static final String awsAssociateTag = "xyz";
   private static final String awsAccessKeyId = "xyz";

   public static void main(String[] args)
   {

      // Set the service:
      AWSECommerceService service = new AWSECommerceService();

      // Set the service port:
      AWSECommerceServicePortType port = service.getAWSECommerceServicePort();
      System.out.println("Port : " + port.toString());

      // Get the operation object:
      ItemSearchRequest itemRequest = new ItemSearchRequest();

      // Fill in the request object:
      itemRequest.setSearchIndex("Books");
      itemRequest.setKeywords("Java EE 7");
      ItemSearch itemElement = new ItemSearch();
      itemElement.setAssociateTag(awsAssociateTag);
      itemElement.setAWSAccessKeyId(awsAccessKeyId);
      itemElement.getRequest().add(itemRequest);

      // Call the Web service operation and store the response
      // in the response object:
      ItemSearchResponse response = port.itemSearch(itemElement);
      for (Items item : response.getItems())
      {
         item.getTotalPages();
      }
   }
}
