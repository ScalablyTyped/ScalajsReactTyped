package typingsJapgolly.expressWsRoutes

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.IRouter
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Record
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Express]
  
  @JSImport("express-ws-routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type CbHandler = js.Function1[/* connectHandler */ WebSocketHandler | Boolean, Unit]
  
  trait ClientInfo extends StObject {
    
    var origin: String
    
    var req: Request_[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    
    var secure: Boolean
  }
  object ClientInfo {
    
    inline def apply(
      origin: String,
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      secure: Boolean
    ): ClientInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfo]
    }
    
    extension [Self <: ClientInfo](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setReq(
        value: Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]
      ): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Express
    extends typingsJapgolly.expressServeStaticCore.mod.Express {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Express = js.native
  }
  
  @js.native
  trait Router extends IRouter {
    
    def websocket(route: String, handler: WebSocketRouteHandler): Router = js.native
  }
  
  @js.native
  trait Server
    extends typingsJapgolly.node.httpMod.Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ] {
    
    var wsServer: typingsJapgolly.ws.mod.Server[WebSocket] = js.native
  }
  
  type WebSocketHandler = js.Function1[/* socket */ WebSocket, Unit]
  
  type WebSocketRouteHandler = js.Function3[/* info */ ClientInfo, /* cb */ CbHandler, /* next */ NextFunction, Unit]
}
