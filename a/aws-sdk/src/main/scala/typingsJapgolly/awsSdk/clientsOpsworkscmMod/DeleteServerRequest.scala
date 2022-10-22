package typingsJapgolly.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServerRequest extends StObject {
  
  /**
    * The ID of the server to delete.
    */
  var ServerName: typingsJapgolly.awsSdk.clientsOpsworkscmMod.ServerName
}
object DeleteServerRequest {
  
  inline def apply(ServerName: ServerName): DeleteServerRequest = {
    val __obj = js.Dynamic.literal(ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServerRequest]
  }
  
  extension [Self <: DeleteServerRequest](x: Self) {
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
