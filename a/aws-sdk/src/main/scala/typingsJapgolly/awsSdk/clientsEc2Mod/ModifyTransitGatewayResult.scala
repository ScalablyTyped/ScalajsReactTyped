package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayResult extends StObject {
  
  var TransitGateway: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.TransitGateway] = js.undefined
}
object ModifyTransitGatewayResult {
  
  inline def apply(): ModifyTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayResult]
  }
  
  extension [Self <: ModifyTransitGatewayResult](x: Self) {
    
    inline def setTransitGateway(value: TransitGateway): Self = StObject.set(x, "TransitGateway", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayUndefined: Self = StObject.set(x, "TransitGateway", js.undefined)
  }
}
