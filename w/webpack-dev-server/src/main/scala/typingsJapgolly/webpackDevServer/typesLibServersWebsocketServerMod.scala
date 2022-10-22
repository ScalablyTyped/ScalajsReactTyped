package typingsJapgolly.webpackDevServer

import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibServersWebsocketServerMod {
  
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", JSImport.Namespace)
  @js.native
  open class ^ () extends WebsocketServer
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack-dev-server/types/lib/servers/WebsocketServer", "heartbeatInterval")
  @js.native
  def heartbeatInterval: Double = js.native
  inline def heartbeatInterval_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartbeatInterval")(x.asInstanceOf[js.Any])
  
  type ClientConnection = typingsJapgolly.webpackDevServer.mod.ClientConnection
  
  type WebSocketServerConfiguration = typingsJapgolly.webpackDevServer.mod.WebSocketServerConfiguration
  
  @js.native
  trait WebsocketServer
    extends typingsJapgolly.webpackDevServer.typesLibServersBaseServerMod.^ {
    
    var implementation: Server[WebSocket] = js.native
  }
}
