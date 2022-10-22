package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLocalGatewayRouteTableResult extends StObject {
  
  var LocalGatewayRouteTable: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.LocalGatewayRouteTable] = js.undefined
}
object CreateLocalGatewayRouteTableResult {
  
  inline def apply(): CreateLocalGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalGatewayRouteTableResult]
  }
  
  extension [Self <: CreateLocalGatewayRouteTableResult](x: Self) {
    
    inline def setLocalGatewayRouteTable(value: LocalGatewayRouteTable): Self = StObject.set(x, "LocalGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableUndefined: Self = StObject.set(x, "LocalGatewayRouteTable", js.undefined)
  }
}
