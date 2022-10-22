package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeGatewayRouteOutput extends StObject {
  
  /**
    * The full description of your gateway route.
    */
  var gatewayRoute: GatewayRouteData
}
object DescribeGatewayRouteOutput {
  
  inline def apply(gatewayRoute: GatewayRouteData): DescribeGatewayRouteOutput = {
    val __obj = js.Dynamic.literal(gatewayRoute = gatewayRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGatewayRouteOutput]
  }
  
  extension [Self <: DescribeGatewayRouteOutput](x: Self) {
    
    inline def setGatewayRoute(value: GatewayRouteData): Self = StObject.set(x, "gatewayRoute", value.asInstanceOf[js.Any])
  }
}
