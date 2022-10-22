package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionMod.default
import typingsJapgolly.pusherJs.typesSrcCoreConnectionProtocolActionMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionHandshakeHandshakePayloadMod {
  
  trait HandshakePayload
    extends StObject
       with Action {
    
    var connection: js.UndefOr[default] = js.undefined
    
    var transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default
  }
  object HandshakePayload {
    
    inline def apply(
      action: String,
      transport: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default
    ): HandshakePayload = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandshakePayload]
    }
    
    extension [Self <: HandshakePayload](x: Self) {
      
      inline def setConnection(value: default): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      inline def setTransport(value: typingsJapgolly.pusherJs.typesSrcCoreTransportsTransportConnectionMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
