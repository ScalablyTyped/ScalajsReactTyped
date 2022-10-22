package typingsJapgolly.feathersjsExpress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.ErrorRequestHandler
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.RouterOptions
import typingsJapgolly.expressServeStaticCore.mod.NextFunction
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.expressServeStaticCore.mod.Response
import typingsJapgolly.feathersjsFeathers.mod.Application
import typingsJapgolly.feathersjsFeathers.mod.Id
import typingsJapgolly.feathersjsFeathers.mod.NullableId
import typingsJapgolly.feathersjsFeathers.mod.Paginated
import typingsJapgolly.serveStatic.mod.RequestHandlerConstructor
import typingsJapgolly.serveStatic.mod.ServeStaticOptions
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(): js.Function0[Unit] = js.native
    def apply(
      handler: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Function0[Unit] = js.native
    
    def formatter(req: Request, res: Response): Any = js.native
    def formatter(req: Request, res: Response, next: NextFunction): Any = js.native
    @JSName("formatter")
    var formatter_Original: RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  }
  object Error {
    
    inline def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: /* msg */ String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* msg */ String) => value(t0).runNow()))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait Html extends StObject {
    
    var html: js.UndefOr[Any] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var logger: js.UndefOr[Error] = js.undefined
    
    var public: js.UndefOr[String] = js.undefined
  }
  object Html {
    
    inline def apply(): Html = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Html]
    }
    
    extension [Self <: Html](x: Self) {
      
      inline def setHtml(value: Any): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setLogger(value: Error): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPublic(value: String): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@feathersjs/feathers.@feathersjs/feathers.ServiceMethods<any> & @feathersjs/feathers.@feathersjs/feathers.SetupMethod> */
  trait PartialServiceMethodsanyS extends StObject {
    
    var create: js.UndefOr[js.Function1[/* data */ Partial[Any], js.Promise[Any | js.Array[Any]]]] = js.undefined
    
    var find: js.UndefOr[js.Function0[js.Promise[Any | js.Array[Any] | Paginated[Any]]]] = js.undefined
    
    var get: js.UndefOr[js.Function1[/* id */ Id, js.Promise[Any]]] = js.undefined
    
    var patch: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Partial[Any], js.Promise[Any]]] = js.undefined
    
    var remove: js.UndefOr[js.Function1[/* id */ NullableId, js.Promise[Any]]] = js.undefined
    
    var setup: js.UndefOr[js.Function2[/* app */ Application[Any], /* path */ String, Unit]] = js.undefined
    
    var update: js.UndefOr[js.Function2[/* id */ NullableId, /* data */ Any, js.Promise[Any]]] = js.undefined
  }
  object PartialServiceMethodsanyS {
    
    inline def apply(): PartialServiceMethodsanyS = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialServiceMethodsanyS]
    }
    
    extension [Self <: PartialServiceMethodsanyS](x: Self) {
      
      inline def setCreate(value: /* data */ Partial[Any] => js.Promise[Any | js.Array[Any]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setFind(value: CallbackTo[js.Promise[Any | js.Array[Any] | Paginated[Any]]]): Self = StObject.set(x, "find", value.toJsFn)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setGet(value: /* id */ Id => js.Promise[Any]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setPatch(value: (/* id */ NullableId, /* data */ Partial[Any]) => js.Promise[Any]): Self = StObject.set(x, "patch", js.Any.fromFunction2(value))
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
      
      inline def setRemove(value: /* id */ NullableId => js.Promise[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setSetup(value: (/* app */ Application[Any], /* path */ String) => Callback): Self = StObject.set(x, "setup", js.Any.fromFunction2((t0: /* app */ Application[Any], t1: /* path */ String) => (value(t0, t1)).runNow()))
      
      inline def setSetupUndefined: Self = StObject.set(x, "setup", js.undefined)
      
      inline def setUpdate(value: (/* id */ NullableId, /* data */ Any) => js.Promise[Any]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait Typeofself extends StObject {
    
    def default[T](app: Application[T]): typingsJapgolly.feathersjsExpress.mod.Application[T] = js.native
    
    def Router(): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
    def Router(options: RouterOptions): typingsJapgolly.expressServeStaticCore.mod.Router = js.native
    
    def errorHandler(): ErrorRequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def errorHandler(options: Html): ErrorRequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * This is a built-in middleware function in Express. It parses incoming requests with JSON payloads and is based on body-parser.
      * @since 4.16.0
      */
    var json: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.json */ Any = js.native
    
    def notFound(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def rest(): js.Function0[Unit] = js.native
    def rest(
      handler: RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): js.Function0[Unit] = js.native
    @JSName("rest")
    val rest_Original: Call = js.native
    
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    def static(root: String): typingsJapgolly.serveStatic.mod.RequestHandler[Response_[Any, Record[String, Any]]] = js.native
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    def static(root: String, options: ServeStaticOptions[Response_[Any, Record[String, Any]]]): typingsJapgolly.serveStatic.mod.RequestHandler[Response_[Any, Record[String, Any]]] = js.native
    /**
      * This is a built-in middleware function in Express. It serves static files and is based on serve-static.
      */
    @JSName("static")
    var static_Original: RequestHandlerConstructor[Response_[Any, Record[String, Any]]] = js.native
    
    /**
      * This is a built-in middleware function in Express. It parses incoming requests with urlencoded payloads and is based on body-parser.
      * @since 4.16.0
      */
    var urlencoded: /* import warning: ResolveTypeQueries.resolve Loop while resolving typeof bodyParser.urlencoded */ Any = js.native
  }
}
