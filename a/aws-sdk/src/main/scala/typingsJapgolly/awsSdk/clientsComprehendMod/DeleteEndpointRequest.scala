package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint being deleted.
    */
  var EndpointArn: ComprehendEndpointArn
}
object DeleteEndpointRequest {
  
  inline def apply(EndpointArn: ComprehendEndpointArn): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
  
  extension [Self <: DeleteEndpointRequest](x: Self) {
    
    inline def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
