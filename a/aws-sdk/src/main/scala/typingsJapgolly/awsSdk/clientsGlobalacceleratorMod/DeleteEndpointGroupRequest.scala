package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEndpointGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString
}
object DeleteEndpointGroupRequest {
  
  inline def apply(EndpointGroupArn: GenericString): DeleteEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointGroupRequest]
  }
  
  extension [Self <: DeleteEndpointGroupRequest](x: Self) {
    
    inline def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
