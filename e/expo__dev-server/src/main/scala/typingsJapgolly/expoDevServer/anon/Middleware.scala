package typingsJapgolly.expoDevServer.anon

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.connect.mod.Server
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Middleware extends StObject {
  
  def middleware(req: IncomingMessage, res: ServerResponse[IncomingMessage]): Unit
  def middleware(req: IncomingMessage, res: ServerResponse[IncomingMessage], next: js.Function): Unit
  @JSName("middleware")
  var middleware_Original: Server
  
  var server: typingsJapgolly.node.httpMod.Server[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
}
object Middleware {
  
  inline def apply(
    middleware: Server,
    server: typingsJapgolly.node.httpMod.Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): Middleware = {
    val __obj = js.Dynamic.literal(middleware = middleware.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[Middleware]
  }
  
  extension [Self <: Middleware](x: Self) {
    
    inline def setMiddleware(value: Server): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
    
    inline def setServer(
      value: typingsJapgolly.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
