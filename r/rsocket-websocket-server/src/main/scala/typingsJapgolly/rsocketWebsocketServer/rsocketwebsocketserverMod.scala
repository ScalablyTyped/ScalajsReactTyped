package typingsJapgolly.rsocketWebsocketServer

import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketCore.rsocketserverMod.TransportServer
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.ServerOptions
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketserverMod {
  
  @JSImport("rsocket-websocket-server/RSocketWebSocketServer", "RSocketWebSocketServer")
  @js.native
  open class RSocketWebSocketServer protected ()
    extends StObject
       with TransportServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[Any]) = this()
    def this(
      options: ServerOptions,
      encoders: Unit,
      factory: js.Function1[/* options */ ServerOptions, Server[WebSocket]]
    ) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[Any],
      factory: js.Function1[/* options */ ServerOptions, Server[WebSocket]]
    ) = this()
    
    /* CompleteClass */
    override def start(): Flowable[DuplexConnection] = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
}
