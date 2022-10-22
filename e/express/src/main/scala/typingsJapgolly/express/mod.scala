package typingsJapgolly.express

import typingsJapgolly.express.anon.FnCall
import typingsJapgolly.expressServeStaticCore.mod.Application
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.qs.mod.IParseOptions
import typingsJapgolly.serveStatic.mod.RequestHandlerConstructor
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Creates an Express application. The express() function is a top-level function exported by the express module.
    */
  inline def apply(): typingsJapgolly.expressServeStaticCore.mod.Express = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.expressServeStaticCore.mod.Express]
  
  @JSImport("express", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Router(): typingsJapgolly.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")().asInstanceOf[typingsJapgolly.expressServeStaticCore.mod.Router]
  inline def Router(options: RouterOptions): typingsJapgolly.expressServeStaticCore.mod.Router = ^.asInstanceOf[js.Dynamic].applyDynamic("Router")(options.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.expressServeStaticCore.mod.Router]
  type Router = typingsJapgolly.expressServeStaticCore.mod.Router
  
  /**
    * These are the exposed prototypes.
    */
  @JSImport("express", "application")
  @js.native
  def application: Application_ = js.native
  inline def application_=(x: Application_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("application")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "json")
  @js.native
  def json: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any = js.native
  inline def json_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])
  
  inline def query(options: FnCall): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def query(options: IParseOptions): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[Handler]
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with Buffer payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "raw")
  @js.native
  def raw: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.raw */ Any = js.native
  inline def raw_=(x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.raw */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("raw")(x.asInstanceOf[js.Any])
  
  @JSImport("express", "request")
  @js.native
  def request: Request_[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ] = js.native
  inline def request_=(
    x: Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  
  @JSImport("express", "response")
  @js.native
  def response: Response_[Any, Record[String, Any]] = js.native
  inline def response_=(x: Response_[Any, Record[String, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("response")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
    */
  @JSImport("express", "static")
  @js.native
  def static: RequestHandlerConstructor[Response_[Any, Record[String, Any]]] = js.native
  inline def static_=(x: RequestHandlerConstructor[Response_[Any, Record[String, Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("static")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with text payloads and is based on body-parser.
    * @since 4.17.0
    */
  @JSImport("express", "text")
  @js.native
  def text: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.text */ Any = js.native
  inline def text_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.text */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  
  /**
    * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
    * @since 4.16.0
    */
  @JSImport("express", "urlencoded")
  @js.native
  def urlencoded: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any = js.native
  inline def urlencoded_=(
    x: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("urlencoded")(x.asInstanceOf[js.Any])
  
  type Application_ = Application
  
  type CookieOptions = typingsJapgolly.expressServeStaticCore.mod.CookieOptions
  
  type Errback = typingsJapgolly.expressServeStaticCore.mod.Errback
  
  type ErrorRequestHandler[P, ResBody, ReqBody, ReqQuery, Locals /* <: Record[String, Any] */] = typingsJapgolly.expressServeStaticCore.mod.ErrorRequestHandler
  
  type Express = typingsJapgolly.expressServeStaticCore.mod.Express
  
  type Handler = typingsJapgolly.expressServeStaticCore.mod.Handler
  
  type IRoute = typingsJapgolly.expressServeStaticCore.mod.IRoute
  
  type IRouter = typingsJapgolly.expressServeStaticCore.mod.IRouter
  
  type IRouterHandler[T] = typingsJapgolly.expressServeStaticCore.mod.IRouterHandler[T]
  
  type IRouterMatcher[T] = typingsJapgolly.expressServeStaticCore.mod.IRouterMatcher[T]
  
  type MediaType = typingsJapgolly.expressServeStaticCore.mod.MediaType
  
  type NextFunction = typingsJapgolly.expressServeStaticCore.mod.NextFunction
  
  type RequestHandler[P, ResBody, ReqBody, ReqQuery, Locals /* <: Record[String, Any] */] = typingsJapgolly.expressServeStaticCore.mod.RequestHandler
  
  type RequestParamHandler = typingsJapgolly.expressServeStaticCore.mod.RequestParamHandler
  
  type Request_[P, ResBody, ReqBody, ReqQuery, Locals /* <: Record[String, Any] */] = Request
  
  type Response_[ResBody, Locals /* <: Record[String, Any] */] = Response
  
  trait RouterOptions extends StObject {
    
    /**
      * Enable case sensitivity.
      */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Preserve the req.params values from the parent router.
      * If the parent and the child have conflicting param names, the child’s value take precedence.
      *
      * @default false
      * @since 4.5.0
      */
    var mergeParams: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable strict routing.
      */
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object RouterOptions {
    
    inline def apply(): RouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouterOptions]
    }
    
    extension [Self <: RouterOptions](x: Self) {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setMergeParams(value: Boolean): Self = StObject.set(x, "mergeParams", value.asInstanceOf[js.Any])
      
      inline def setMergeParamsUndefined: Self = StObject.set(x, "mergeParams", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type Send = typingsJapgolly.expressServeStaticCore.mod.Send
}
