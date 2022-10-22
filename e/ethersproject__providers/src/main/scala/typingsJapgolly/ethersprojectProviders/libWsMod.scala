package typingsJapgolly.ethersprojectProviders

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ethersprojectProviders.ethersprojectProvidersInts.`0`
import typingsJapgolly.ethersprojectProviders.ethersprojectProvidersInts.`1`
import typingsJapgolly.ethersprojectProviders.ethersprojectProvidersInts.`2`
import typingsJapgolly.ethersprojectProviders.ethersprojectProvidersInts.`3`
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.ws.mod.ClientOptions
import typingsJapgolly.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWsMod {
  
  // WebSocket socket.
  @JSImport("@ethersproject/providers/lib/ws", "WebSocket")
  @js.native
  open class WebSocket protected ()
    extends typingsJapgolly.ws.mod.WebSocket {
    def this(address: String) = this()
    def this(address: Null) = this()
    def this(address: URL_) = this()
    def this(address: String, options: ClientRequestArgs) = this()
    def this(address: String, options: ClientOptions) = this()
    def this(address: String, protocols: String) = this()
    def this(address: String, protocols: js.Array[String]) = this()
    def this(address: URL_, options: ClientRequestArgs) = this()
    def this(address: URL_, options: ClientOptions) = this()
    def this(address: URL_, protocols: String) = this()
    def this(address: URL_, protocols: js.Array[String]) = this()
    def this(address: String, protocols: String, options: ClientRequestArgs) = this()
    def this(address: String, protocols: String, options: ClientOptions) = this()
    def this(address: String, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: String, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: String, protocols: Unit, options: ClientRequestArgs) = this()
    def this(address: String, protocols: Unit, options: ClientOptions) = this()
    def this(address: URL_, protocols: String, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: String, options: ClientOptions) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: js.Array[String], options: ClientOptions) = this()
    def this(address: URL_, protocols: Unit, options: ClientRequestArgs) = this()
    def this(address: URL_, protocols: Unit, options: ClientOptions) = this()
  }
  object WebSocket extends Shortcut {
    
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket")
    @js.native
    val ^ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
    
    /** The connection is closed. */
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CLOSED")
    @js.native
    val CLOSED: `3` = js.native
    
    /** The connection is in the process of closing. */
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CLOSING")
    @js.native
    val CLOSING: `2` = js.native
    
    /** The connection is not yet open. */
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.CONNECTING")
    @js.native
    val CONNECTING: `0` = js.native
    
    /** The connection is open and ready to communicate. */
    /* static member */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.OPEN")
    @js.native
    val OPEN: `1` = js.native
    
    // WebSocket Server
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.Server")
    @js.native
    open class Server[T /* <: typingsJapgolly.ws.mod.WebSocket */] ()
      extends typingsJapgolly.ws.mod.Server[T] {
      def this(options: ServerOptions) = this()
      def this(options: Unit, callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
    
    // tslint:disable-line no-empty-interface
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.WebSocket")
    @js.native
    val WebSocket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
    
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.WebSocketServer")
    @js.native
    val WebSocketServer: Instantiable2[
        /* options */ js.UndefOr[ServerOptions], 
        /* callback */ js.UndefOr[js.Function0[Unit]], 
        typingsJapgolly.ws.mod.Server[typingsJapgolly.ws.mod.WebSocket]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("@ethersproject/providers/lib/ws", "WebSocket.WebSocketServer")
    @js.native
    open class WebSocketServerCls[T /* <: typingsJapgolly.ws.mod.WebSocket */] ()
      extends typingsJapgolly.ws.mod.Server[T] {
      def this(options: ServerOptions) = this()
      def this(options: Unit, callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
    
    // tslint:disable-line no-empty-interface
    // WebSocket stream
    inline def createWebSocketStream(websocket: typingsJapgolly.ws.mod.WebSocket): Duplex = ^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any]).asInstanceOf[Duplex]
    inline def createWebSocketStream(websocket: typingsJapgolly.ws.mod.WebSocket, options: DuplexOptions): Duplex = (^.asInstanceOf[js.Dynamic].applyDynamic("createWebSocketStream")(websocket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Duplex]
    
    type _To = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any
    
    /* This means you don't have to write `^`, but can instead just say `WebSocket.foo` */
    override def _to: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = ^
  }
}
