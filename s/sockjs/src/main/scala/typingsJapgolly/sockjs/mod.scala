package typingsJapgolly.sockjs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.NodeJS.ReadWriteStream
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.sockjs.anon.Address
import typingsJapgolly.sockjs.sockjsStrings.close
import typingsJapgolly.sockjs.sockjsStrings.connection
import typingsJapgolly.sockjs.sockjsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sockjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[Server]
  inline def createServer(options: ServerOptions): Server = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[Server]
  
  @js.native
  trait Connection
    extends StObject
       with ReadWriteStream {
    
    var address: StringDictionary[Address] = js.native
    
    def close(): Boolean = js.native
    def close(code: String): Boolean = js.native
    def close(code: String, reason: String): Boolean = js.native
    def close(code: Unit, reason: String): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var id: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* message */ String, Any]): this.type = js.native
    
    var pathname: String = js.native
    
    var prefix: String = js.native
    
    var protocol: String = js.native
    
    var readyState: Double = js.native
    
    var remoteAddress: String = js.native
    
    var remotePort: Double = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait Server
    extends StObject
       with EventEmitter {
    
    def installHandlers(
      server: typingsJapgolly.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Any = js.native
    def installHandlers(
      server: typingsJapgolly.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ],
      options: ServerOptions
    ): Any = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* conn */ Connection, Any]): this.type = js.native
  }
  
  trait ServerOptions extends StObject {
    
    var disconnect_delay: js.UndefOr[Double] = js.undefined
    
    var heartbeat_delay: js.UndefOr[Double] = js.undefined
    
    var jsessionid: js.UndefOr[Any] = js.undefined
    
    var log: js.UndefOr[js.Function2[/* severity */ String, /* message */ String, Unit]] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var response_limit: js.UndefOr[Double] = js.undefined
    
    var sockjs_url: js.UndefOr[String] = js.undefined
    
    var websocket: js.UndefOr[Boolean] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setDisconnect_delay(value: Double): Self = StObject.set(x, "disconnect_delay", value.asInstanceOf[js.Any])
      
      inline def setDisconnect_delayUndefined: Self = StObject.set(x, "disconnect_delay", js.undefined)
      
      inline def setHeartbeat_delay(value: Double): Self = StObject.set(x, "heartbeat_delay", value.asInstanceOf[js.Any])
      
      inline def setHeartbeat_delayUndefined: Self = StObject.set(x, "heartbeat_delay", js.undefined)
      
      inline def setJsessionid(value: Any): Self = StObject.set(x, "jsessionid", value.asInstanceOf[js.Any])
      
      inline def setJsessionidUndefined: Self = StObject.set(x, "jsessionid", js.undefined)
      
      inline def setLog(value: (/* severity */ String, /* message */ String) => Callback): Self = StObject.set(x, "log", js.Any.fromFunction2((t0: /* severity */ String, t1: /* message */ String) => (value(t0, t1)).runNow()))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setResponse_limit(value: Double): Self = StObject.set(x, "response_limit", value.asInstanceOf[js.Any])
      
      inline def setResponse_limitUndefined: Self = StObject.set(x, "response_limit", js.undefined)
      
      inline def setSockjs_url(value: String): Self = StObject.set(x, "sockjs_url", value.asInstanceOf[js.Any])
      
      inline def setSockjs_urlUndefined: Self = StObject.set(x, "sockjs_url", js.undefined)
      
      inline def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
}
