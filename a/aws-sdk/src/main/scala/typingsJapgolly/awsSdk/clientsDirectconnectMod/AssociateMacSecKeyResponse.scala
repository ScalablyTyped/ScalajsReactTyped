package typingsJapgolly.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateMacSecKeyResponse extends StObject {
  
  /**
    * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  
  /**
    * The MAC Security (MACsec) security keys associated with the dedicated connection.
    */
  var macSecKeys: js.UndefOr[MacSecKeyList] = js.undefined
}
object AssociateMacSecKeyResponse {
  
  inline def apply(): AssociateMacSecKeyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateMacSecKeyResponse]
  }
  
  extension [Self <: AssociateMacSecKeyResponse](x: Self) {
    
    inline def setConnectionId(value: ConnectionId): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setMacSecKeys(value: MacSecKeyList): Self = StObject.set(x, "macSecKeys", value.asInstanceOf[js.Any])
    
    inline def setMacSecKeysUndefined: Self = StObject.set(x, "macSecKeys", js.undefined)
    
    inline def setMacSecKeysVarargs(value: MacSecKey*): Self = StObject.set(x, "macSecKeys", js.Array(value*))
  }
}
