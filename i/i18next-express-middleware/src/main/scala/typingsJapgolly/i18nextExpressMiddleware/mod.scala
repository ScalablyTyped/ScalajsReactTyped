package typingsJapgolly.i18nextExpressMiddleware

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.Handler
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.express.mod.Router
import typingsJapgolly.expressServeStaticCore.mod.Request
import typingsJapgolly.i18next.anon.ReturnDetails
import typingsJapgolly.i18next.anon.ReturnObjects
import typingsJapgolly.i18next.anon.`0`
import typingsJapgolly.i18next.mod.Module
import typingsJapgolly.i18next.mod.ModuleType
import typingsJapgolly.i18next.mod.TFunction
import typingsJapgolly.i18next.mod.TFunctionKeys
import typingsJapgolly.i18next.mod.TFunctionResult
import typingsJapgolly.i18next.mod.TOptions
import typingsJapgolly.i18next.mod.i18n
import typingsJapgolly.i18nextExpressMiddleware.i18nextExpressMiddlewareStrings.languageDetector
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("i18next-express-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("i18next-express-middleware", "LanguageDetector")
  @js.native
  open class LanguageDetector ()
    extends StObject
       with Module {
    def this(options: LanguageDetectorOptions) = this()
    def this(services: LanguageDetectorServices) = this()
    def this(options: Unit, allOptions: LanguageDetectorAllOptions) = this()
    def this(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions) = this()
    def this(services: LanguageDetectorServices, options: LanguageDetectorOptions) = this()
    def this(services: LanguageDetectorServices, options: Unit, allOptions: LanguageDetectorAllOptions) = this()
    def this(
      services: LanguageDetectorServices,
      options: LanguageDetectorOptions,
      allOptions: LanguageDetectorAllOptions
    ) = this()
    
    def addDetector(detector: LanguageDetectorInterface): Unit = js.native
    
    def cacheUserLanguage(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      lng: String,
      caches: LanguageDetectorCaches
    ): Unit = js.native
    
    def detect(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      detectionOrder: LanguageDetectorOrder
    ): Unit = js.native
    
    def init(): Unit = js.native
    def init(options: Unit, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(options: LanguageDetectorOptions): Unit = js.native
    def init(options: LanguageDetectorOptions, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(services: LanguageDetectorServices): Unit = js.native
    def init(services: LanguageDetectorServices, options: Unit, allOptions: LanguageDetectorAllOptions): Unit = js.native
    def init(services: LanguageDetectorServices, options: LanguageDetectorOptions): Unit = js.native
    def init(
      services: LanguageDetectorServices,
      options: LanguageDetectorOptions,
      allOptions: LanguageDetectorAllOptions
    ): Unit = js.native
    
    /* CompleteClass */
    var `type`: ModuleType = js.native
    @JSName("type")
    var type_LanguageDetector: languageDetector = js.native
  }
  
  inline def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    fc: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addRoute")(i18next.asInstanceOf[js.Any], route.asInstanceOf[js.Any], lngs.asInstanceOf[js.Any], app.asInstanceOf[js.Any], verb.asInstanceOf[js.Any], fc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getResourcesHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def getResourcesHandler(i18next: I18next, options: GetResourcesHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("getResourcesHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  inline def handle(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def handle(i18next: I18next, options: HandleOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("handle")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  inline def missingKeyHandler(i18next: I18next): Handler = ^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any]).asInstanceOf[Handler]
  inline def missingKeyHandler(i18next: I18next, options: MissingKeyHandlerOptions): Handler = (^.asInstanceOf[js.Dynamic].applyDynamic("missingKeyHandler")(i18next.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Handler]
  
  type App = Application_ | Router
  
  trait GetResourcesHandlerOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object GetResourcesHandlerOptions {
    
    inline def apply(): GetResourcesHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetResourcesHandlerOptions]
    }
    
    extension [Self <: GetResourcesHandlerOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      inline def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      inline def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
  
  trait HandleOptions extends StObject {
    
    var ignoreRoutes: js.UndefOr[js.Array[String] | IgnoreRoutesFunction] = js.undefined
    
    var removeLngFromUrl: js.UndefOr[Boolean] = js.undefined
  }
  object HandleOptions {
    
    inline def apply(): HandleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HandleOptions]
    }
    
    extension [Self <: HandleOptions](x: Self) {
      
      inline def setIgnoreRoutes(value: js.Array[String] | IgnoreRoutesFunction): Self = StObject.set(x, "ignoreRoutes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreRoutesFunction4(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* res */ Response_[Any, Record[String, Any]], /* options */ HandleOptions, /* i18next */ I18next) => Boolean
      ): Self = StObject.set(x, "ignoreRoutes", js.Any.fromFunction4(value))
      
      inline def setIgnoreRoutesUndefined: Self = StObject.set(x, "ignoreRoutes", js.undefined)
      
      inline def setIgnoreRoutesVarargs(value: String*): Self = StObject.set(x, "ignoreRoutes", js.Array(value*))
      
      inline def setRemoveLngFromUrl(value: Boolean): Self = StObject.set(x, "removeLngFromUrl", value.asInstanceOf[js.Any])
      
      inline def setRemoveLngFromUrlUndefined: Self = StObject.set(x, "removeLngFromUrl", js.undefined)
    }
  }
  
  @js.native
  trait I18NextRequest
    extends StObject
       with Request {
    
    var i18n: typingsJapgolly.i18next.mod.i18n = js.native
    
    var language: String = js.native
    
    var languages: js.Array[String] = js.native
    
    // basic usage
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](
      key: TKeys,
      options: (TOptions[TInterpolationMap] & ReturnDetails & `0` & ReturnObjects) | TOptions[TInterpolationMap]
    ): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: TKeys, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: String, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: String): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], defaultValue: Unit, options: TOptions[TInterpolationMap]): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](
      key: js.Array[TKeys],
      options: (TOptions[TInterpolationMap] & ReturnDetails & `0` & ReturnObjects) | TOptions[TInterpolationMap]
    ): TResult = js.native
    def t[TResult /* <: TFunctionResult */, TKeys /* <: TFunctionKeys */, TInterpolationMap /* <: js.Object */](key: js.Array[TKeys], options: String): TResult = js.native
    @JSName("t")
    var t_Original: TFunction = js.native
  }
  
  type I18next = i18n
  
  type IgnoreRoutesFunction = js.Function4[
    /* req */ Request_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
      Any, 
      Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
      Record[String, Any]
    ], 
    /* res */ Response_[Any, Record[String, Any]], 
    /* options */ HandleOptions, 
    /* i18next */ I18next, 
    Boolean
  ]
  
  trait LanguageDetectorAllOptions extends StObject {
    
    var fallbackLng: Boolean | String | js.Array[String]
  }
  object LanguageDetectorAllOptions {
    
    inline def apply(fallbackLng: Boolean | String | js.Array[String]): LanguageDetectorAllOptions = {
      val __obj = js.Dynamic.literal(fallbackLng = fallbackLng.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectorAllOptions]
    }
    
    extension [Self <: LanguageDetectorAllOptions](x: Self) {
      
      inline def setFallbackLng(value: Boolean | String | js.Array[String]): Self = StObject.set(x, "fallbackLng", value.asInstanceOf[js.Any])
      
      inline def setFallbackLngVarargs(value: String*): Self = StObject.set(x, "fallbackLng", js.Array(value*))
    }
  }
  
  type LanguageDetectorCaches = Boolean | js.Array[String]
  
  @js.native
  trait LanguageDetectorInterface extends StObject {
    
    var cacheUserLanguage: js.UndefOr[
        js.Function4[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* res */ Response_[Any, Record[String, Any]], 
          /* lng */ String, 
          /* options */ js.UndefOr[js.Object], 
          Unit
        ]
      ] = js.native
    
    def lookup(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]]
    ): String | js.Array[String] = js.native
    def lookup(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      res: Response_[Any, Record[String, Any]],
      options: LanguageDetectorInterfaceOptions
    ): String | js.Array[String] = js.native
    
    var name: String = js.native
  }
  
  type LanguageDetectorInterfaceOptions = StringDictionary[Any]
  
  trait LanguageDetectorOptions extends StObject {
    
    var caches: js.UndefOr[LanguageDetectorCaches] = js.undefined
    
    var cookieDomain: js.UndefOr[String] = js.undefined
    
    var cookieExpirationDate: js.UndefOr[js.Date] = js.undefined
    
    var lookupCookie: js.UndefOr[String] = js.undefined
    
    var lookupFromPathIndex: js.UndefOr[Double] = js.undefined
    
    var lookupQuerystring: js.UndefOr[String] = js.undefined
    
    var lookupSession: js.UndefOr[String] = js.undefined
    
    var order: js.UndefOr[LanguageDetectorOrder] = js.undefined
  }
  object LanguageDetectorOptions {
    
    inline def apply(): LanguageDetectorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LanguageDetectorOptions]
    }
    
    extension [Self <: LanguageDetectorOptions](x: Self) {
      
      inline def setCaches(value: LanguageDetectorCaches): Self = StObject.set(x, "caches", value.asInstanceOf[js.Any])
      
      inline def setCachesUndefined: Self = StObject.set(x, "caches", js.undefined)
      
      inline def setCachesVarargs(value: String*): Self = StObject.set(x, "caches", js.Array(value*))
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookieExpirationDate(value: js.Date): Self = StObject.set(x, "cookieExpirationDate", value.asInstanceOf[js.Any])
      
      inline def setCookieExpirationDateUndefined: Self = StObject.set(x, "cookieExpirationDate", js.undefined)
      
      inline def setLookupCookie(value: String): Self = StObject.set(x, "lookupCookie", value.asInstanceOf[js.Any])
      
      inline def setLookupCookieUndefined: Self = StObject.set(x, "lookupCookie", js.undefined)
      
      inline def setLookupFromPathIndex(value: Double): Self = StObject.set(x, "lookupFromPathIndex", value.asInstanceOf[js.Any])
      
      inline def setLookupFromPathIndexUndefined: Self = StObject.set(x, "lookupFromPathIndex", js.undefined)
      
      inline def setLookupQuerystring(value: String): Self = StObject.set(x, "lookupQuerystring", value.asInstanceOf[js.Any])
      
      inline def setLookupQuerystringUndefined: Self = StObject.set(x, "lookupQuerystring", js.undefined)
      
      inline def setLookupSession(value: String): Self = StObject.set(x, "lookupSession", value.asInstanceOf[js.Any])
      
      inline def setLookupSessionUndefined: Self = StObject.set(x, "lookupSession", js.undefined)
      
      inline def setOrder(value: LanguageDetectorOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    }
  }
  
  type LanguageDetectorOrder = js.Array[String]
  
  // LanguageDetector
  type LanguageDetectorServices = Any
  
  trait MissingKeyHandlerOptions extends StObject {
    
    var lngParam: js.UndefOr[String] = js.undefined
    
    var nsParam: js.UndefOr[String] = js.undefined
  }
  object MissingKeyHandlerOptions {
    
    inline def apply(): MissingKeyHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MissingKeyHandlerOptions]
    }
    
    extension [Self <: MissingKeyHandlerOptions](x: Self) {
      
      inline def setLngParam(value: String): Self = StObject.set(x, "lngParam", value.asInstanceOf[js.Any])
      
      inline def setLngParamUndefined: Self = StObject.set(x, "lngParam", js.undefined)
      
      inline def setNsParam(value: String): Self = StObject.set(x, "nsParam", value.asInstanceOf[js.Any])
      
      inline def setNsParamUndefined: Self = StObject.set(x, "nsParam", js.undefined)
    }
  }
}
