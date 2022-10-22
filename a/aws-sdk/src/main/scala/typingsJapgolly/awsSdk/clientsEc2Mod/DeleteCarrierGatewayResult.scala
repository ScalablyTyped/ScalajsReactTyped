package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCarrierGatewayResult extends StObject {
  
  /**
    * Information about the carrier gateway.
    */
  var CarrierGateway: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.CarrierGateway] = js.undefined
}
object DeleteCarrierGatewayResult {
  
  inline def apply(): DeleteCarrierGatewayResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCarrierGatewayResult]
  }
  
  extension [Self <: DeleteCarrierGatewayResult](x: Self) {
    
    inline def setCarrierGateway(value: CarrierGateway): Self = StObject.set(x, "CarrierGateway", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayUndefined: Self = StObject.set(x, "CarrierGateway", js.undefined)
  }
}
