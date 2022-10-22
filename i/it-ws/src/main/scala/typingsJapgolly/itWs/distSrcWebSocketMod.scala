package typingsJapgolly.itWs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.itWs.itWsInts.`0`
import typingsJapgolly.itWs.itWsInts.`1`
import typingsJapgolly.itWs.itWsInts.`2`
import typingsJapgolly.itWs.itWsInts.`3`
import typingsJapgolly.node.httpMod.ClientRequestArgs
import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.DuplexOptions
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.ws.mod.ClientOptions
import typingsJapgolly.ws.mod.ServerOptions
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcWebSocketMod {
  
  // WebSocket socket.
  @JSImport("it-ws/dist/src/web-socket", JSImport.Default)
  @js.native
  open class default protected () extends WebSocket {
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
  object default extends Shortcut {
    
    @JSImport("it-ws/dist/src/web-socket", JSImport.Default)
    @js.native
    val ^ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
    
    /** The connection is closed. */
    /* static member */
    @JSImport("it-ws/dist/src/web-socket", "default.CLOSED")
    @js.native
    val CLOSED: `3` = js.native
    
    /** The connection is in the process of closing. */
    /* static member */
    @JSImport("it-ws/dist/src/web-socket", "default.CLOSING")
    @js.native
    val CLOSING: `2` = js.native
    
    /** The connection is not yet open. */
    /* static member */
    @JSImport("it-ws/dist/src/web-socket", "default.CONNECTING")
    @js.native
    val CONNECTING: `0` = js.native
    
    /** The connection is open and ready to communicate. */
    /* static member */
    @JSImport("it-ws/dist/src/web-socket", "default.OPEN")
    @js.native
    val OPEN: `1` = js.native
    
    // WebSocket Server
    @JSImport("it-ws/dist/src/web-socket", "default.Server")
    @js.native
    open class Server[T /* <: typingsJapgolly.ws.mod.WebSocket */] ()
      extends typingsJapgolly.ws.mod.Server[T] {
      def this(options: ServerOptions) = this()
      def this(options: Unit, callback: js.Function0[Unit]) = this()
      def this(options: ServerOptions, callback: js.Function0[Unit]) = this()
    }
    
    // tslint:disable-line no-empty-interface
    @JSImport("it-ws/dist/src/web-socket", "default.WebSocket")
    @js.native
    val WebSocket: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = js.native
    
    @JSImport("it-ws/dist/src/web-socket", "default.WebSocketServer")
    @js.native
    val WebSocketServer: Instantiable2[
        /* options */ js.UndefOr[ServerOptions], 
        /* callback */ js.UndefOr[js.Function0[Unit]], 
        typingsJapgolly.ws.mod.Server[typingsJapgolly.ws.mod.WebSocket]
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("it-ws/dist/src/web-socket", "default.WebSocketServer")
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
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WebSocketAlias */ Any = ^
  }
}
