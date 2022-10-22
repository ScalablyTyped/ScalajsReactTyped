package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitGatewayRoutesResult extends StObject {
  
  /**
    * Indicates whether there are additional routes available.
    */
  var AdditionalRoutesAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Information about the routes.
    */
  var Routes: js.UndefOr[TransitGatewayRouteList] = js.undefined
}
object SearchTransitGatewayRoutesResult {
  
  inline def apply(): SearchTransitGatewayRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTransitGatewayRoutesResult]
  }
  
  extension [Self <: SearchTransitGatewayRoutesResult](x: Self) {
    
    inline def setAdditionalRoutesAvailable(value: Boolean): Self = StObject.set(x, "AdditionalRoutesAvailable", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRoutesAvailableUndefined: Self = StObject.set(x, "AdditionalRoutesAvailable", js.undefined)
    
    inline def setRoutes(value: TransitGatewayRouteList): Self = StObject.set(x, "Routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "Routes", js.undefined)
    
    inline def setRoutesVarargs(value: TransitGatewayRoute*): Self = StObject.set(x, "Routes", js.Array(value*))
  }
}
