package typingsJapgolly.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGatewayInformationInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the gateway to update.
    */
  var GatewayArn: typingsJapgolly.awsSdk.clientsBackupgatewayMod.GatewayArn
  
  /**
    * The updated display name of the gateway.
    */
  var GatewayDisplayName: js.UndefOr[Name] = js.undefined
}
object UpdateGatewayInformationInput {
  
  inline def apply(GatewayArn: GatewayArn): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
  
  extension [Self <: UpdateGatewayInformationInput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayDisplayName(value: Name): Self = StObject.set(x, "GatewayDisplayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayDisplayNameUndefined: Self = StObject.set(x, "GatewayDisplayName", js.undefined)
  }
}
