package typingsJapgolly.expoDevServer.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDebuggerConnected extends StObject {
  
  def isDebuggerConnected(): Boolean
  
  var server: Server[WebSocket]
}
object IsDebuggerConnected {
  
  inline def apply(isDebuggerConnected: CallbackTo[Boolean], server: Server[WebSocket]): IsDebuggerConnected = {
    val __obj = js.Dynamic.literal(isDebuggerConnected = isDebuggerConnected.toJsFn, server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDebuggerConnected]
  }
  
  extension [Self <: IsDebuggerConnected](x: Self) {
    
    inline def setIsDebuggerConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDebuggerConnected", value.toJsFn)
    
    inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
