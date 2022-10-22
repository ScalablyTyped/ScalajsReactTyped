package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.TransitGatewayRouteTable] = js.undefined
}
object CreateTransitGatewayRouteTableResult {
  
  inline def apply(): CreateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayRouteTableResult]
  }
  
  extension [Self <: CreateTransitGatewayRouteTableResult](x: Self) {
    
    inline def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
  }
}
