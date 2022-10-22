package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointGroupResponse extends StObject {
  
  /**
    * The information about the endpoint group that was updated.
    */
  var EndpointGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.EndpointGroup] = js.undefined
}
object UpdateEndpointGroupResponse {
  
  inline def apply(): UpdateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointGroupResponse]
  }
  
  extension [Self <: UpdateEndpointGroupResponse](x: Self) {
    
    inline def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    inline def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
