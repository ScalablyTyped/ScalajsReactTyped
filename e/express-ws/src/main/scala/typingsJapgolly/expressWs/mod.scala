package typingsJapgolly.expressWs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.IRouterMatcher
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.RouterOptions
import typingsJapgolly.expressServeStaticCore.mod.IRouter
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.PathParams
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.RequestHandler
import typingsJapgolly.expressServeStaticCore.mod.RequestHandlerParams
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Record
import typingsJapgolly.ws.mod.ServerOptions
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(app: Application_): Instance = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Instance]
  inline def apply(app: Application_, server: Unit, options: Options): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ],
    options: Options
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ]
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any])).asInstanceOf[Instance]
  inline def apply(
    app: Application_,
    server: typingsJapgolly.node.httpsMod.Server[
      Instantiable1[/* socket */ Socket, typingsJapgolly.node.nodeColonhttpMod.IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        typingsJapgolly.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
      ]
    ],
    options: Options
  ): Instance = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Instance]
  
  @JSImport("express-ws", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object expressAugmentingMod {
    
    @JSImport("express", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Router(options: js.UndefOr[RouterOptions]): typingsJapgolly.express.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.express.mod.Router]
  }
  
  @js.native
  trait Application
    extends typingsJapgolly.expressServeStaticCore.mod.Application
       with WithWebsocketMethod {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
  }
  
  trait Instance extends StObject {
    
    var app: Application
    
    def applyTo(target: RouterLike): Unit
    
    def getWss(): typingsJapgolly.ws.mod.Server[WebSocket]
  }
  object Instance {
    
    inline def apply(
      app: Application,
      applyTo: RouterLike => Callback,
      getWss: CallbackTo[typingsJapgolly.ws.mod.Server[WebSocket]]
    ): Instance = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], applyTo = js.Any.fromFunction1((t0: RouterLike) => applyTo(t0).runNow()), getWss = getWss.toJsFn)
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setApp(value: Application): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setApplyTo(value: RouterLike => Callback): Self = StObject.set(x, "applyTo", js.Any.fromFunction1((t0: RouterLike) => value(t0).runNow()))
      
      inline def setGetWss(value: CallbackTo[typingsJapgolly.ws.mod.Server[WebSocket]]): Self = StObject.set(x, "getWss", value.toJsFn)
    }
  }
  
  trait Options extends StObject {
    
    var leaveRouterUntouched: js.UndefOr[Boolean] = js.undefined
    
    var wsOptions: js.UndefOr[ServerOptions] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setLeaveRouterUntouched(value: Boolean): Self = StObject.set(x, "leaveRouterUntouched", value.asInstanceOf[js.Any])
      
      inline def setLeaveRouterUntouchedUndefined: Self = StObject.set(x, "leaveRouterUntouched", js.undefined)
      
      inline def setWsOptions(value: ServerOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
      
      inline def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
    }
  }
  
  @js.native
  trait Router
    extends IRouter
       with WithWebsocketMethod {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* req */ Request, arg2: /* res */ Response, arg3: /* next */ js.UndefOr[NextFunction]): Any = js.native
  }
  
  trait RouterLike
    extends StObject
       with /* key */ NumberDictionary[Any]
       with /* key */ StringDictionary[Any] {
    
    def get(path: PathParams, handlers: (RequestHandler | RequestHandlerParams)*): this.type
    @JSName("get")
    var get_Original: IRouterMatcher[this.type]
  }
  object RouterLike {
    
    inline def apply(get: IRouterMatcher[RouterLike]): RouterLike = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterLike]
    }
    
    extension [Self <: RouterLike](x: Self) {
      
      inline def setGet(value: IRouterMatcher[RouterLike]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsocketMethod[T] extends StObject {
    
    def apply(route: PathParams, middlewares: WebsocketRequestHandler*): T = js.native
  }
  
  type WebsocketRequestHandler = js.Function3[
    /* ws */ WebSocket, 
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* next */ typingsJapgolly.express.mod.NextFunction, 
    Unit
  ]
  
  trait WithWebsocketMethod extends StObject {
    
    def ws(route: PathParams, middlewares: WebsocketRequestHandler*): this.type
    @JSName("ws")
    var ws_Original: WebsocketMethod[this.type]
  }
  object WithWebsocketMethod {
    
    inline def apply(ws: WebsocketMethod[WithWebsocketMethod]): WithWebsocketMethod = {
      val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWebsocketMethod]
    }
    
    extension [Self <: WithWebsocketMethod](x: Self) {
      
      inline def setWs(value: WebsocketMethod[WithWebsocketMethod]): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
    }
  }
}
