package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewayRoutesOutput extends StObject {
  
  /**
    * The list of existing gateway routes for the specified service mesh and virtual gateway.
    */
  var gatewayRoutes: GatewayRouteList
  
  /**
    * The nextToken value to include in a future ListGatewayRoutes request. When the results of a ListGatewayRoutes request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListGatewayRoutesOutput {
  
  inline def apply(gatewayRoutes: GatewayRouteList): ListGatewayRoutesOutput = {
    val __obj = js.Dynamic.literal(gatewayRoutes = gatewayRoutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewayRoutesOutput]
  }
  
  extension [Self <: ListGatewayRoutesOutput](x: Self) {
    
    inline def setGatewayRoutes(value: GatewayRouteList): Self = StObject.set(x, "gatewayRoutes", value.asInstanceOf[js.Any])
    
    inline def setGatewayRoutesVarargs(value: GatewayRouteRef*): Self = StObject.set(x, "gatewayRoutes", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
