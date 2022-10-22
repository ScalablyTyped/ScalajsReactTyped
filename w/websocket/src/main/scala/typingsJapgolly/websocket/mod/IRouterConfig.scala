package typingsJapgolly.websocket.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRouterConfig extends StObject {
  
  /*
    * The WebSocketServer instance to attach to.
    */
  var server: typingsJapgolly.websocket.mod.server
}
object IRouterConfig {
  
  inline def apply(server: server): IRouterConfig = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRouterConfig]
  }
  
  extension [Self <: IRouterConfig](x: Self) {
    
    inline def setServer(value: server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
