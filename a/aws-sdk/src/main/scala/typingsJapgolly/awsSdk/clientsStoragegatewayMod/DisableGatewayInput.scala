package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableGatewayInput extends StObject {
  
  var GatewayARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object DisableGatewayInput {
  
  inline def apply(GatewayARN: GatewayARN): DisableGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableGatewayInput]
  }
  
  extension [Self <: DisableGatewayInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
