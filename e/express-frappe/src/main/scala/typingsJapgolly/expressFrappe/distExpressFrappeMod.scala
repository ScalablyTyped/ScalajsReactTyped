package typingsJapgolly.expressFrappe

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cors.mod.CorsOptions
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.expressFrappe.anon.Json
import typingsJapgolly.expressFrappe.anon.Options
import typingsJapgolly.expressFrappe.anon.Partialuseioanysocketanyn
import typingsJapgolly.expressRouters.distExpressRoutersMod.RouteConfig
import typingsJapgolly.expressRouters.distExpressRoutersMod.RouteConfigAlternative
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.expressServeStaticCore.mod.Express
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExpressFrappeMod {
  
  @JSImport("express-frappe/dist/express-frappe", "ExpressFrappe")
  @js.native
  open class ExpressFrappe protected () extends StObject {
    def this(config: ExpressFrappeConfig) = this()
    
    def app(): Application = js.native
    @JSName("app")
    var app_Original: Express = js.native
    
    var server: Server[
        Instantiable1[/* socket */ Socket, IncomingMessage], 
        Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
          ServerResponse[IncomingMessage]
        ]
      ] = js.native
  }
  
  trait ExpressFrappeConfig extends StObject {
    
    var bodyParser: js.UndefOr[Boolean | Json] = js.undefined
    
    var cors: js.UndefOr[Boolean | CorsOptions] = js.undefined
    
    var errorHandler: js.UndefOr[
        ErrorRequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ] = js.undefined
    
    var io: js.UndefOr[ExpressFrappeSocketIOConfig] = js.undefined
    
    var middleware: js.UndefOr[
        js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ]
      ] = js.undefined
    
    var morgan: js.UndefOr[Boolean] = js.undefined
    
    var routes: js.UndefOr[js.Array[RouteConfig] | RouteConfigAlternative] = js.undefined
    
    var static: js.UndefOr[String | Options] = js.undefined
  }
  object ExpressFrappeConfig {
    
    inline def apply(): ExpressFrappeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExpressFrappeConfig]
    }
    
    extension [Self <: ExpressFrappeConfig](x: Self) {
      
      inline def setBodyParser(value: Boolean | Json): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
      
      inline def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
      
      inline def setCors(value: Boolean | CorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
      
      inline def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
      
      inline def setErrorHandler(value: (/* err */ Any, /* req */ Request, /* res */ Response, /* next */ NextFunction) => Any): Self = StObject.set(x, "errorHandler", js.Any.fromFunction4(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setIo(value: ExpressFrappeSocketIOConfig): Self = StObject.set(x, "io", value.asInstanceOf[js.Any])
      
      inline def setIoUndefined: Self = StObject.set(x, "io", js.undefined)
      
      inline def setMiddleware(
        value: js.Array[
              RequestHandler[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ]
            ]
      ): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setMiddlewareVarargs(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ])*
      ): Self = StObject.set(x, "middleware", js.Array(value*))
      
      inline def setMorgan(value: Boolean): Self = StObject.set(x, "morgan", value.asInstanceOf[js.Any])
      
      inline def setMorganUndefined: Self = StObject.set(x, "morgan", js.undefined)
      
      inline def setRoutes(value: js.Array[RouteConfig] | RouteConfigAlternative): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
      
      inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
      
      inline def setRoutesVarargs(value: RouteConfig*): Self = StObject.set(x, "routes", js.Array(value*))
      
      inline def setStatic(value: String | Options): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    }
  }
  
  type ExpressFrappeSocketIOConfig = StringDictionary[Partialuseioanysocketanyn]
}
