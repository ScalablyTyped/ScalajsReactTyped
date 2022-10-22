package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionResponse extends StObject {
  
  /**
    *  Information about the connection. 
    */
  var ConnectionDetails: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.ConnectionDetails] = js.undefined
  
  /**
    *  The ID of the connection. 
    */
  var ConnectionId: js.UndefOr[typingsJapgolly.awsSdk.clientsOutpostsMod.ConnectionId] = js.undefined
}
object GetConnectionResponse {
  
  inline def apply(): GetConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionResponse]
  }
  
  extension [Self <: GetConnectionResponse](x: Self) {
    
    inline def setConnectionDetails(value: ConnectionDetails): Self = StObject.set(x, "ConnectionDetails", value.asInstanceOf[js.Any])
    
    inline def setConnectionDetailsUndefined: Self = StObject.set(x, "ConnectionDetails", js.undefined)
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
  }
}
