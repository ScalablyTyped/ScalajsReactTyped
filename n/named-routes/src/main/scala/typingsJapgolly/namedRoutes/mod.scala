package typingsJapgolly.namedRoutes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Express
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.PathParams
import typingsJapgolly.expressServeStaticCore.mod.RequestHandlerParams
import typingsJapgolly.namedRoutes.anon.PartialRouteOptions
import typingsJapgolly.namedRoutes.anon.PartialRouterOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("named-routes", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with NamedRouter {
    def this(options: PartialRouterOptions) = this()
  }
  
  @js.native
  trait NamedRouter extends StObject {
    
    def add(
      method: String,
      path: String,
      callbacks: js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ]
    ): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ],
      options: PartialRouteOptions
    ): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    def add(
      method: String,
      path: String,
      callbacks: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      options: PartialRouteOptions
    ): Unit = js.native
    
    def build(name: String): String = js.native
    def build(name: String, params: Unit, method: String): String = js.native
    def build(name: String, params: RouteParams): String = js.native
    def build(name: String, params: RouteParams, method: String): String = js.native
    
    def dispatch(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
    def dispatch(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Unit,
      next: NextFunction
    ): Unit = js.native
    def dispatch(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): Unit = js.native
    def dispatch(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      next: NextFunction
    ): Unit = js.native
    
    def extendExpress(app: Express): NamedRouter = js.native
    def extendExpress(app: Router): NamedRouter = js.native
    
    def `match`(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Boolean | js.Object = js.native
    
    def param(
      callback: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): NamedRouter = js.native
    def param(
      name: String,
      callback: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): NamedRouter = js.native
    
    def registerAppHelpers(app: Express): NamedRouter = js.native
  }
  
  trait RouteOptions extends StObject {
    
    var caseSensitive: Boolean
    
    var name: String
    
    var recursiveWildcard: Boolean
    
    var wildcardInPairs: Boolean
  }
  object RouteOptions {
    
    inline def apply(caseSensitive: Boolean, name: String, recursiveWildcard: Boolean, wildcardInPairs: Boolean): RouteOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recursiveWildcard = recursiveWildcard.asInstanceOf[js.Any], wildcardInPairs = wildcardInPairs.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    extension [Self <: RouteOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRecursiveWildcard(value: Boolean): Self = StObject.set(x, "recursiveWildcard", value.asInstanceOf[js.Any])
      
      inline def setWildcardInPairs(value: Boolean): Self = StObject.set(x, "wildcardInPairs", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteParams = StringDictionary[String | (js.Array[Boolean | Double | String]) | Double | Boolean | Null]
  
  trait RouterOptions extends StObject {
    
    var caseSensitive: Boolean
  }
  object RouterOptions {
    
    inline def apply(caseSensitive: Boolean): RouterOptions = {
      val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterOptions]
    }
    
    extension [Self <: RouterOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Application extends StObject {
      
      var namedRoutes: NamedRouter
    }
    object Application {
      
      inline def apply(namedRoutes: NamedRouter): Application = {
        val __obj = js.Dynamic.literal(namedRoutes = namedRoutes.asInstanceOf[js.Any])
        __obj.asInstanceOf[Application]
      }
      
      extension [Self <: Application](x: Self) {
        
        inline def setNamedRoutes(value: NamedRouter): Self = StObject.set(x, "namedRoutes", value.asInstanceOf[js.Any])
      }
    }
    
    // tslint:disable-next-line interface-name
    @js.native
    trait IRouterMatcher[T] extends StObject {
      
      def apply(
        path: PathParams,
        name: String,
        handlers: (typingsJapgolly.expressServeStaticCore.mod.RequestHandler | RequestHandlerParams)*
      ): T = js.native
    }
  }
}
