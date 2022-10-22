package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceTransitGatewayRouteResult extends StObject {
  
  /**
    * Information about the modified route.
    */
  var Route: js.UndefOr[TransitGatewayRoute] = js.undefined
}
object ReplaceTransitGatewayRouteResult {
  
  inline def apply(): ReplaceTransitGatewayRouteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceTransitGatewayRouteResult]
  }
  
  extension [Self <: ReplaceTransitGatewayRouteResult](x: Self) {
    
    inline def setRoute(value: TransitGatewayRoute): Self = StObject.set(x, "Route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "Route", js.undefined)
  }
}
