package typingsJapgolly.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutMaintenanceStartTimeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of a gateway for which you set the maintenance start time.
    */
  var GatewayArn: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupgatewayMod.GatewayArn] = js.undefined
}
object PutMaintenanceStartTimeOutput {
  
  inline def apply(): PutMaintenanceStartTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutMaintenanceStartTimeOutput]
  }
  
  extension [Self <: PutMaintenanceStartTimeOutput](x: Self) {
    
    inline def setGatewayArn(value: GatewayArn): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayArnUndefined: Self = StObject.set(x, "GatewayArn", js.undefined)
  }
}
