package typingsJapgolly.expressRouters

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Router
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distExpressRoutersMod {
  
  @JSImport("express-routers/dist/express-routers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRouter(routeConfig: js.Array[RouteConfig]): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def createRouter(routeConfig: RouteConfigAlternative): Router = ^.asInstanceOf[js.Dynamic].applyDynamic("createRouter")(routeConfig.asInstanceOf[js.Any]).asInstanceOf[Router]
  
  trait RouteConfig extends StObject {
    
    var handler: (RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]) | (js.Array[
        RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
      ])
    
    var method: RouteConfigMethod
    
    var path: String
  }
  object RouteConfig {
    
    inline def apply(
      handler: (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]) | (js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ]),
      method: RouteConfigMethod,
      path: String
    ): RouteConfig = {
      val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteConfig]
    }
    
    extension [Self <: RouteConfig](x: Self) {
      
      inline def setHandler(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) | (js.Array[
              RequestHandler[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ]
            ])
      ): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      inline def setHandlerVarargs(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ])*
      ): Self = StObject.set(x, "handler", js.Array(value*))
      
      inline def setMethod(value: RouteConfigMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteConfigAlternative = StringDictionary[
    (RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]) | (js.Array[
      RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ]
    ])
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.expressRouters.expressRoutersStrings.GET
    - typingsJapgolly.expressRouters.expressRoutersStrings.POST
    - typingsJapgolly.expressRouters.expressRoutersStrings.PUT
    - typingsJapgolly.expressRouters.expressRoutersStrings.PATCH
    - typingsJapgolly.expressRouters.expressRoutersStrings.DELETE
  */
  trait RouteConfigMethod extends StObject
  object RouteConfigMethod {
    
    inline def DELETE: typingsJapgolly.expressRouters.expressRoutersStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.expressRouters.expressRoutersStrings.DELETE]
    
    inline def GET: typingsJapgolly.expressRouters.expressRoutersStrings.GET = "GET".asInstanceOf[typingsJapgolly.expressRouters.expressRoutersStrings.GET]
    
    inline def PATCH: typingsJapgolly.expressRouters.expressRoutersStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.expressRouters.expressRoutersStrings.PATCH]
    
    inline def POST: typingsJapgolly.expressRouters.expressRoutersStrings.POST = "POST".asInstanceOf[typingsJapgolly.expressRouters.expressRoutersStrings.POST]
    
    inline def PUT: typingsJapgolly.expressRouters.expressRoutersStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.expressRouters.expressRoutersStrings.PUT]
  }
}
