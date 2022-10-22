package typingsJapgolly.expoDevServer.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageSocket extends StObject {
  
  var messageSocket: typingsJapgolly.expoDevServer.buildMetroDevServerMod.MessageSocket
  
  var middleware: Any
  
  var server: Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
}
object MessageSocket {
  
  inline def apply(
    messageSocket: typingsJapgolly.expoDevServer.buildMetroDevServerMod.MessageSocket,
    middleware: Any,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): MessageSocket = {
    val __obj = js.Dynamic.literal(messageSocket = messageSocket.asInstanceOf[js.Any], middleware = middleware.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSocket]
  }
  
  extension [Self <: MessageSocket](x: Self) {
    
    inline def setMessageSocket(value: typingsJapgolly.expoDevServer.buildMetroDevServerMod.MessageSocket): Self = StObject.set(x, "messageSocket", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: Any): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
