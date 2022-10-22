package typingsJapgolly.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServerResponse extends StObject {
  
  /**
    * Contains the response to a UpdateServer request. 
    */
  var Server: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworkscmMod.Server] = js.undefined
}
object UpdateServerResponse {
  
  inline def apply(): UpdateServerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServerResponse]
  }
  
  extension [Self <: UpdateServerResponse](x: Self) {
    
    inline def setServer(value: Server): Self = StObject.set(x, "Server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "Server", js.undefined)
  }
}
