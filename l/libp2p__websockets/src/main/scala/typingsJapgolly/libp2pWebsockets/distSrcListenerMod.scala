package typingsJapgolly.libp2pWebsockets

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.libp2pInterfaceTransport.mod.CreateListenerOptions
import typingsJapgolly.libp2pInterfaceTransport.mod.Listener
import typingsJapgolly.libp2pInterfaceTransport.mod.Upgrader
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListenerMod {
  
  @JSImport("@libp2p/websockets/dist/src/listener", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createListener(init: WebSocketListenerInit): Listener = ^.asInstanceOf[js.Dynamic].applyDynamic("createListener")(init.asInstanceOf[js.Any]).asInstanceOf[Listener]
  
  trait WebSocketListenerInit
    extends StObject
       with CreateListenerOptions {
    
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
  }
  object WebSocketListenerInit {
    
    inline def apply(upgrader: Upgrader): WebSocketListenerInit = {
      val __obj = js.Dynamic.literal(upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebSocketListenerInit]
    }
    
    extension [Self <: WebSocketListenerInit](x: Self) {
      
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
    }
  }
}
