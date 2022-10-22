package typingsJapgolly.libp2pWebsockets

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.libp2pInterfaceTransport.mod.MultiaddrFilter
import typingsJapgolly.libp2pInterfaceTransport.mod.Transport
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.ws.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/websockets", "WebSockets")
  @js.native
  open class WebSockets ()
    extends StObject
       with Transport {
    def this(init: WebSocketsInit) = this()
    
    def _connect(ma: Multiaddr_, options: AbortOptions): js.Promise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DuplexWebSocket */ Any
      ] = js.native
    
    var get: Any = js.native
    
    /* private */ val init: Any = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_WebSockets: js.Function0[String] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WebSocketOptions * / any */ trait WebSocketsInit
    extends StObject
       with AbortOptions {
    
    var filter: js.UndefOr[MultiaddrFilter] = js.undefined
    
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var websocket: js.UndefOr[ClientOptions] = js.undefined
  }
  object WebSocketsInit {
    
    inline def apply(): WebSocketsInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebSocketsInit]
    }
    
    extension [Self <: WebSocketsInit](x: Self) {
      
      inline def setFilter(value: /* multiaddrs */ js.Array[Multiaddr_] => js.Array[Multiaddr_]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setWebsocket(value: ClientOptions): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
}
