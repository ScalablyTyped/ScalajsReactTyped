package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLocalDisksInput extends StObject {
  
  var GatewayARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN
}
object ListLocalDisksInput {
  
  inline def apply(GatewayARN: GatewayARN): ListLocalDisksInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocalDisksInput]
  }
  
  extension [Self <: ListLocalDisksInput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
  }
}
