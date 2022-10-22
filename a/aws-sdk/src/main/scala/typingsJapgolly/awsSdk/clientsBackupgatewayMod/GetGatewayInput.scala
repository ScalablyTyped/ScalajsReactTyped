package typingsJapgolly.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGatewayInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  var GatewayArn: typingsJapgolly.awsSdk.clientsBackupgatewayMod.GatewayArn
}
object GetGatewayInput {
  
  inline def apply(GatewayArn: GatewayArn): GetGatewayInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGatewayInput]
  }
  
  extension [Self <: GetGatewayInput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
  }
}
