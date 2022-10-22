package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomRoutingPortMappingsByDestinationResponse extends StObject {
  
  /**
    * The port mappings for the endpoint IP address that you specified in the request.
    */
  var DestinationPortMappings: js.UndefOr[typingsJapgolly.awsSdk.clientsGlobalacceleratorMod.DestinationPortMappings] = js.undefined
  
  /**
    * The token for the next set of results. You receive this token from a previous call.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object ListCustomRoutingPortMappingsByDestinationResponse {
  
  inline def apply(): ListCustomRoutingPortMappingsByDestinationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomRoutingPortMappingsByDestinationResponse]
  }
  
  extension [Self <: ListCustomRoutingPortMappingsByDestinationResponse](x: Self) {
    
    inline def setDestinationPortMappings(value: DestinationPortMappings): Self = StObject.set(x, "DestinationPortMappings", value.asInstanceOf[js.Any])
    
    inline def setDestinationPortMappingsUndefined: Self = StObject.set(x, "DestinationPortMappings", js.undefined)
    
    inline def setDestinationPortMappingsVarargs(value: DestinationPortMapping*): Self = StObject.set(x, "DestinationPortMappings", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
