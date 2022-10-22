package typingsJapgolly.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetEndpointAttributesInput extends StObject {
  
  /**
    * A map of the endpoint attributes. Attributes in this map include the following:    CustomUserData – arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.    Enabled – flag that enables/disables delivery to the endpoint. Amazon SNS will set this to false when a notification service indicates to Amazon SNS that the endpoint is invalid. Users can set it back to true, typically after updating Token.    Token – device token, also referred to as a registration id, for an app and mobile device. This is returned from the notification service when an app and mobile device are registered with the notification service.  
    */
  var Attributes: MapStringToString
  
  /**
    * EndpointArn used for SetEndpointAttributes action.
    */
  var EndpointArn: String
}
object SetEndpointAttributesInput {
  
  inline def apply(Attributes: MapStringToString, EndpointArn: String): SetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetEndpointAttributesInput]
  }
  
  extension [Self <: SetEndpointAttributesInput](x: Self) {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
