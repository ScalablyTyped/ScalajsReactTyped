package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInAppMessagesRequest extends StObject {
  
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string
  
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: string
}
object GetInAppMessagesRequest {
  
  inline def apply(ApplicationId: string, EndpointId: string): GetInAppMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInAppMessagesRequest]
  }
  
  extension [Self <: GetInAppMessagesRequest](x: Self) {
    
    inline def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setEndpointId(value: string): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
  }
}
