package typingsJapgolly.itWs

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.itWs.anon.Port
import typingsJapgolly.itWs.distSrcDuplexMod.DuplexWebSocket
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.ws.anon.Origin
import typingsJapgolly.ws.mod.AddressInfo
import typingsJapgolly.ws.mod.VerifyClientCallbackAsync
import typingsJapgolly.ws.mod.VerifyClientCallbackSync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcServerMod {
  
  @JSImport("it-ws/dist/src/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createServer(): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")().asInstanceOf[WebSocketServer]
  inline def createServer(opts: ServerOptions): WebSocketServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(opts.asInstanceOf[js.Any]).asInstanceOf[WebSocketServer]
  
  trait ServerOptions extends StObject {
    
    var cert: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var onConnection: js.UndefOr[js.Function1[/* connection */ DuplexWebSocket, Unit]] = js.undefined
    
    var server: js.UndefOr[
        (Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]) | (typingsJapgolly.node.httpsMod.Server[
          Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
          ]
        ])
      ] = js.undefined
    
    var verifyClient: js.UndefOr[VerifyClientCallbackAsync | VerifyClientCallbackSync] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnConnection(value: /* connection */ DuplexWebSocket => Callback): Self = StObject.set(x, "onConnection", js.Any.fromFunction1((t0: /* connection */ DuplexWebSocket) => value(t0).runNow()))
      
      inline def setOnConnectionUndefined: Self = StObject.set(x, "onConnection", js.undefined)
      
      inline def setServer(
        value: (Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]) | (typingsJapgolly.node.httpsMod.Server[
              Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
              ]
            ])
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setVerifyClient(value: VerifyClientCallbackAsync | VerifyClientCallbackSync): Self = StObject.set(x, "verifyClient", value.asInstanceOf[js.Any])
      
      inline def setVerifyClientFunction1(value: /* info */ Origin => Boolean): Self = StObject.set(x, "verifyClient", js.Any.fromFunction1(value))
      
      inline def setVerifyClientFunction2(
        value: (/* info */ Origin, /* callback */ js.Function4[
              /* res */ Boolean, 
              /* code */ js.UndefOr[Double], 
              /* message */ js.UndefOr[String], 
              /* headers */ js.UndefOr[OutgoingHttpHeaders], 
              Unit
            ]) => Callback
      ): Self = StObject.set(x, "verifyClient", js.Any.fromFunction2((t0: /* info */ Origin, t1: /* callback */ js.Function4[
              /* res */ Boolean, 
              /* code */ js.UndefOr[Double], 
              /* message */ js.UndefOr[String], 
              /* headers */ js.UndefOr[OutgoingHttpHeaders], 
              Unit
            ]) => (value(t0, t1)).runNow()))
      
      inline def setVerifyClientUndefined: Self = StObject.set(x, "verifyClient", js.undefined)
    }
  }
  
  @js.native
  trait WebSocketServer extends EventEmitter {
    
    def address(): String | AddressInfo | Null = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def listen(addrInfo: Double): js.Promise[WebSocketServer] = js.native
    def listen(addrInfo: Port): js.Promise[WebSocketServer] = js.native
  }
}
