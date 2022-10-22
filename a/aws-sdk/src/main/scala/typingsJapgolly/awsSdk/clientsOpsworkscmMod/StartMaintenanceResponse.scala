package typingsJapgolly.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMaintenanceResponse extends StObject {
  
  /**
    * Contains the response to a StartMaintenance request. 
    */
  var Server: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworkscmMod.Server] = js.undefined
}
object StartMaintenanceResponse {
  
  inline def apply(): StartMaintenanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartMaintenanceResponse]
  }
  
  extension [Self <: StartMaintenanceResponse](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
