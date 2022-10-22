package typingsJapgolly.findMyWay

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.findMyWay.anon.CommonPrefix
import typingsJapgolly.findMyWay.anon.Del
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[V /* <: HTTPVersion */](): Instance[V] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Instance[V]]
  inline def apply[V /* <: HTTPVersion */](config: Config[V]): Instance[V] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[Instance[V]]
  
  @JSImport("find-my-way", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait HTTPVersion extends StObject
  @JSImport("find-my-way", "HTTPVersion")
  @js.native
  object HTTPVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HTTPVersion & String] = js.native
    
    @js.native
    sealed trait V1
      extends StObject
         with HTTPVersion
    /* "http1" */ val V1: typingsJapgolly.findMyWay.mod.HTTPVersion.V1 & String = js.native
    
    @js.native
    sealed trait V2
      extends StObject
         with HTTPVersion
    /* "http2" */ val V2: typingsJapgolly.findMyWay.mod.HTTPVersion.V2 & String = js.native
  }
  
  trait Config[V /* <: HTTPVersion */] extends StObject {
    
    var allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var constraints: js.UndefOr[StringDictionary[ConstraintStrategy[V, String]]] = js.undefined
    
    var defaultRoute: js.UndefOr[js.Function2[/* req */ Req[V], /* res */ Res[V], Unit]] = js.undefined
    
    var ignoreDuplicateSlashes: js.UndefOr[Boolean] = js.undefined
    
    var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var maxParamLength: js.UndefOr[Double] = js.undefined
    
    var onBadUrl: js.UndefOr[js.Function3[/* path */ String, /* req */ Req[V], /* res */ Res[V], Unit]] = js.undefined
  }
  object Config {
    
    inline def apply[V /* <: HTTPVersion */](): Config[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[V]]
    }
    
    extension [Self <: Config[?], V /* <: HTTPVersion */](x: Self & Config[V]) {
      
      inline def setAllowUnsafeRegex(value: Boolean): Self = StObject.set(x, "allowUnsafeRegex", value.asInstanceOf[js.Any])
      
      inline def setAllowUnsafeRegexUndefined: Self = StObject.set(x, "allowUnsafeRegex", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setConstraints(value: StringDictionary[ConstraintStrategy[V, String]]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setDefaultRoute(value: (/* req */ Req[V], /* res */ Res[V]) => Callback): Self = StObject.set(x, "defaultRoute", js.Any.fromFunction2((t0: /* req */ Req[V], t1: /* res */ Res[V]) => (value(t0, t1)).runNow()))
      
      inline def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      inline def setIgnoreDuplicateSlashes(value: Boolean): Self = StObject.set(x, "ignoreDuplicateSlashes", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDuplicateSlashesUndefined: Self = StObject.set(x, "ignoreDuplicateSlashes", js.undefined)
      
      inline def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
      
      inline def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
      
      inline def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
      
      inline def setOnBadUrl(value: (/* path */ String, /* req */ Req[V], /* res */ Res[V]) => Callback): Self = StObject.set(x, "onBadUrl", js.Any.fromFunction3((t0: /* path */ String, t1: /* req */ Req[V], t2: /* res */ Res[V]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnBadUrlUndefined: Self = StObject.set(x, "onBadUrl", js.undefined)
    }
  }
  
  @js.native
  trait ConstraintStrategy[V /* <: HTTPVersion */, T] extends StObject {
    
    def deriveConstraint[Context](req: Req[V]): T = js.native
    def deriveConstraint[Context](req: Req[V], ctx: Context): T = js.native
    
    var mustMatchWhenDerived: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    def storage(): Del[T, V] = js.native
    
    def validate(value: Any): Unit = js.native
  }
  
  trait FindResult[V /* <: HTTPVersion */] extends StObject {
    
    def handler(
      req: Req[V],
      res: Res[V],
      params: StringDictionary[js.UndefOr[String]],
      store: Any,
      searchParams: StringDictionary[String]
    ): Any
    @JSName("handler")
    var handler_Original: Handler[V]
    
    var params: StringDictionary[js.UndefOr[String]]
    
    var searchParams: StringDictionary[String]
    
    var store: Any
  }
  object FindResult {
    
    inline def apply[V /* <: HTTPVersion */](
      handler: (/* req */ Req[V], /* res */ Res[V], /* params */ StringDictionary[js.UndefOr[String]], /* store */ Any, /* searchParams */ StringDictionary[String]) => Any,
      params: StringDictionary[js.UndefOr[String]],
      searchParams: StringDictionary[String],
      store: Any
    ): FindResult[V] = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction5(handler), params = params.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindResult[V]]
    }
    
    extension [Self <: FindResult[?], V /* <: HTTPVersion */](x: Self & FindResult[V]) {
      
      inline def setHandler(
        value: (/* req */ Req[V], /* res */ Res[V], /* params */ StringDictionary[js.UndefOr[String]], /* store */ Any, /* searchParams */ StringDictionary[String]) => Any
      ): Self = StObject.set(x, "handler", js.Any.fromFunction5(value))
      
      inline def setParams(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSearchParams(value: StringDictionary[String]): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setStore(value: Any): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.findMyWay.findMyWayStrings.ACL
    - typingsJapgolly.findMyWay.findMyWayStrings.BIND
    - typingsJapgolly.findMyWay.findMyWayStrings.CHECKOUT
    - typingsJapgolly.findMyWay.findMyWayStrings.CONNECT
    - typingsJapgolly.findMyWay.findMyWayStrings.COPY
    - typingsJapgolly.findMyWay.findMyWayStrings.DELETE
    - typingsJapgolly.findMyWay.findMyWayStrings.GET
    - typingsJapgolly.findMyWay.findMyWayStrings.HEAD
    - typingsJapgolly.findMyWay.findMyWayStrings.LINK
    - typingsJapgolly.findMyWay.findMyWayStrings.LOCK
    - typingsJapgolly.findMyWay.findMyWayStrings.`M-SEARCH`
    - typingsJapgolly.findMyWay.findMyWayStrings.MERGE
    - typingsJapgolly.findMyWay.findMyWayStrings.MKACTIVITY
    - typingsJapgolly.findMyWay.findMyWayStrings.MKCALENDAR
    - typingsJapgolly.findMyWay.findMyWayStrings.MKCOL
    - typingsJapgolly.findMyWay.findMyWayStrings.MOVE
    - typingsJapgolly.findMyWay.findMyWayStrings.NOTIFY
    - typingsJapgolly.findMyWay.findMyWayStrings.OPTIONS
    - typingsJapgolly.findMyWay.findMyWayStrings.PATCH
    - typingsJapgolly.findMyWay.findMyWayStrings.POST
    - typingsJapgolly.findMyWay.findMyWayStrings.PROPFIND
    - typingsJapgolly.findMyWay.findMyWayStrings.PROPPATCH
    - typingsJapgolly.findMyWay.findMyWayStrings.PURGE
    - typingsJapgolly.findMyWay.findMyWayStrings.PUT
    - typingsJapgolly.findMyWay.findMyWayStrings.REBIND
    - typingsJapgolly.findMyWay.findMyWayStrings.REPORT
    - typingsJapgolly.findMyWay.findMyWayStrings.SEARCH
    - typingsJapgolly.findMyWay.findMyWayStrings.SOURCE
    - typingsJapgolly.findMyWay.findMyWayStrings.SUBSCRIBE
    - typingsJapgolly.findMyWay.findMyWayStrings.TRACE
    - typingsJapgolly.findMyWay.findMyWayStrings.UNBIND
    - typingsJapgolly.findMyWay.findMyWayStrings.UNLINK
    - typingsJapgolly.findMyWay.findMyWayStrings.UNLOCK
    - typingsJapgolly.findMyWay.findMyWayStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    inline def ACL: typingsJapgolly.findMyWay.findMyWayStrings.ACL = "ACL".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.ACL]
    
    inline def BIND: typingsJapgolly.findMyWay.findMyWayStrings.BIND = "BIND".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.BIND]
    
    inline def CHECKOUT: typingsJapgolly.findMyWay.findMyWayStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.CHECKOUT]
    
    inline def CONNECT: typingsJapgolly.findMyWay.findMyWayStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.CONNECT]
    
    inline def COPY: typingsJapgolly.findMyWay.findMyWayStrings.COPY = "COPY".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.COPY]
    
    inline def DELETE: typingsJapgolly.findMyWay.findMyWayStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.DELETE]
    
    inline def GET: typingsJapgolly.findMyWay.findMyWayStrings.GET = "GET".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.GET]
    
    inline def HEAD: typingsJapgolly.findMyWay.findMyWayStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.HEAD]
    
    inline def LINK: typingsJapgolly.findMyWay.findMyWayStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.LINK]
    
    inline def LOCK: typingsJapgolly.findMyWay.findMyWayStrings.LOCK = "LOCK".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.LOCK]
    
    inline def `M-SEARCH`: typingsJapgolly.findMyWay.findMyWayStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.`M-SEARCH`]
    
    inline def MERGE: typingsJapgolly.findMyWay.findMyWayStrings.MERGE = "MERGE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.MERGE]
    
    inline def MKACTIVITY: typingsJapgolly.findMyWay.findMyWayStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typingsJapgolly.findMyWay.findMyWayStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.MKCALENDAR]
    
    inline def MKCOL: typingsJapgolly.findMyWay.findMyWayStrings.MKCOL = "MKCOL".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.MKCOL]
    
    inline def MOVE: typingsJapgolly.findMyWay.findMyWayStrings.MOVE = "MOVE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.MOVE]
    
    inline def NOTIFY: typingsJapgolly.findMyWay.findMyWayStrings.NOTIFY = "NOTIFY".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.NOTIFY]
    
    inline def OPTIONS: typingsJapgolly.findMyWay.findMyWayStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.findMyWay.findMyWayStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.PATCH]
    
    inline def POST: typingsJapgolly.findMyWay.findMyWayStrings.POST = "POST".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.POST]
    
    inline def PROPFIND: typingsJapgolly.findMyWay.findMyWayStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.PROPFIND]
    
    inline def PROPPATCH: typingsJapgolly.findMyWay.findMyWayStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.PROPPATCH]
    
    inline def PURGE: typingsJapgolly.findMyWay.findMyWayStrings.PURGE = "PURGE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.PURGE]
    
    inline def PUT: typingsJapgolly.findMyWay.findMyWayStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.PUT]
    
    inline def REBIND: typingsJapgolly.findMyWay.findMyWayStrings.REBIND = "REBIND".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.REBIND]
    
    inline def REPORT: typingsJapgolly.findMyWay.findMyWayStrings.REPORT = "REPORT".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.REPORT]
    
    inline def SEARCH: typingsJapgolly.findMyWay.findMyWayStrings.SEARCH = "SEARCH".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.SEARCH]
    
    inline def SOURCE: typingsJapgolly.findMyWay.findMyWayStrings.SOURCE = "SOURCE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.SOURCE]
    
    inline def SUBSCRIBE: typingsJapgolly.findMyWay.findMyWayStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.SUBSCRIBE]
    
    inline def TRACE: typingsJapgolly.findMyWay.findMyWayStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.TRACE]
    
    inline def UNBIND: typingsJapgolly.findMyWay.findMyWayStrings.UNBIND = "UNBIND".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.UNBIND]
    
    inline def UNLINK: typingsJapgolly.findMyWay.findMyWayStrings.UNLINK = "UNLINK".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.UNLINK]
    
    inline def UNLOCK: typingsJapgolly.findMyWay.findMyWayStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typingsJapgolly.findMyWay.findMyWayStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typingsJapgolly.findMyWay.findMyWayStrings.UNSUBSCRIBE]
  }
  
  type Handler[V /* <: HTTPVersion */] = js.Function5[
    /* req */ Req[V], 
    /* res */ Res[V], 
    /* params */ StringDictionary[js.UndefOr[String]], 
    /* store */ Any, 
    /* searchParams */ StringDictionary[String], 
    Any
  ]
  
  @js.native
  trait Instance[V /* <: HTTPVersion */] extends StObject {
    
    def acl(path: String, handler: Handler[V]): Unit = js.native
    def acl(path: String, handler: Handler[V], store: Any): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("acl")
    var acl_Original: ShortHandRoute[V] = js.native
    
    def addConstraintStrategy(constraintStrategy: ConstraintStrategy[V, String]): Unit = js.native
    
    def all(path: String, handler: Handler[V]): Unit = js.native
    def all(path: String, handler: Handler[V], store: Any): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("all")
    var all_Original: ShortHandRoute[V] = js.native
    
    def bind(path: String, handler: Handler[V]): Unit = js.native
    def bind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("bind")
    var bind_Original: ShortHandRoute[V] = js.native
    
    def checkout(path: String, handler: Handler[V]): Unit = js.native
    def checkout(path: String, handler: Handler[V], store: Any): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("checkout")
    var checkout_Original: ShortHandRoute[V] = js.native
    
    def connect(path: String, handler: Handler[V]): Unit = js.native
    def connect(path: String, handler: Handler[V], store: Any): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("connect")
    var connect_Original: ShortHandRoute[V] = js.native
    
    def copy(path: String, handler: Handler[V]): Unit = js.native
    def copy(path: String, handler: Handler[V], store: Any): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("copy")
    var copy_Original: ShortHandRoute[V] = js.native
    
    def delete(path: String, handler: Handler[V]): Unit = js.native
    def delete(path: String, handler: Handler[V], store: Any): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("delete")
    var delete_Original: ShortHandRoute[V] = js.native
    
    def find(method: HTTPMethod, path: String): FindResult[V] | Null = js.native
    def find(method: HTTPMethod, path: String, constraints: StringDictionary[Any]): FindResult[V] | Null = js.native
    
    def get(path: String, handler: Handler[V]): Unit = js.native
    def get(path: String, handler: Handler[V], store: Any): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("get")
    var get_Original: ShortHandRoute[V] = js.native
    
    def hasConstraintStrategy(strategyName: String): Boolean = js.native
    
    def head(path: String, handler: Handler[V]): Unit = js.native
    def head(path: String, handler: Handler[V], store: Any): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("head")
    var head_Original: ShortHandRoute[V] = js.native
    
    def link(path: String, handler: Handler[V]): Unit = js.native
    def link(path: String, handler: Handler[V], store: Any): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("link")
    var link_Original: ShortHandRoute[V] = js.native
    
    def lock(path: String, handler: Handler[V]): Unit = js.native
    def lock(path: String, handler: Handler[V], store: Any): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("lock")
    var lock_Original: ShortHandRoute[V] = js.native
    
    def lookup[Context](req: Req[V], res: Res[V]): Any = js.native
    def lookup[Context](req: Req[V], res: Res[V], ctx: Context): Any = js.native
    
    def `m-search`(path: String, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, handler: Handler[V], store: Any): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("m-search")
    var `m-search_Original`: ShortHandRoute[V] = js.native
    
    def merge(path: String, handler: Handler[V]): Unit = js.native
    def merge(path: String, handler: Handler[V], store: Any): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("merge")
    var merge_Original: ShortHandRoute[V] = js.native
    
    def mkactivity(path: String, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkactivity")
    var mkactivity_Original: ShortHandRoute[V] = js.native
    
    def mkcalendar(path: String, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkcalendar")
    var mkcalendar_Original: ShortHandRoute[V] = js.native
    
    def mkcol(path: String, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, handler: Handler[V], store: Any): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("mkcol")
    var mkcol_Original: ShortHandRoute[V] = js.native
    
    def move(path: String, handler: Handler[V]): Unit = js.native
    def move(path: String, handler: Handler[V], store: Any): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("move")
    var move_Original: ShortHandRoute[V] = js.native
    
    def notify(path: String, handler: Handler[V]): Unit = js.native
    def notify(path: String, handler: Handler[V], store: Any): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("notify")
    var notify_Original: ShortHandRoute[V] = js.native
    
    def off(method: js.Array[HTTPMethod], path: String): Unit = js.native
    def off(method: js.Array[HTTPMethod], path: String, constraints: StringDictionary[Any]): Unit = js.native
    def off(method: HTTPMethod, path: String): Unit = js.native
    def off(method: HTTPMethod, path: String, constraints: StringDictionary[Any]): Unit = js.native
    
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V]): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V], store: Any): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V], store: Any): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    
    def options(path: String, handler: Handler[V]): Unit = js.native
    def options(path: String, handler: Handler[V], store: Any): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("options")
    var options_Original: ShortHandRoute[V] = js.native
    
    def patch(path: String, handler: Handler[V]): Unit = js.native
    def patch(path: String, handler: Handler[V], store: Any): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("patch")
    var patch_Original: ShortHandRoute[V] = js.native
    
    def post(path: String, handler: Handler[V]): Unit = js.native
    def post(path: String, handler: Handler[V], store: Any): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("post")
    var post_Original: ShortHandRoute[V] = js.native
    
    def prettyPrint(): String = js.native
    def prettyPrint(opts: CommonPrefix): String = js.native
    
    def propfind(path: String, handler: Handler[V]): Unit = js.native
    def propfind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("propfind")
    var propfind_Original: ShortHandRoute[V] = js.native
    
    def proppatch(path: String, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, handler: Handler[V], store: Any): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("proppatch")
    var proppatch_Original: ShortHandRoute[V] = js.native
    
    def purge(path: String, handler: Handler[V]): Unit = js.native
    def purge(path: String, handler: Handler[V], store: Any): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("purge")
    var purge_Original: ShortHandRoute[V] = js.native
    
    def put(path: String, handler: Handler[V]): Unit = js.native
    def put(path: String, handler: Handler[V], store: Any): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("put")
    var put_Original: ShortHandRoute[V] = js.native
    
    def rebind(path: String, handler: Handler[V]): Unit = js.native
    def rebind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("rebind")
    var rebind_Original: ShortHandRoute[V] = js.native
    
    def report(path: String, handler: Handler[V]): Unit = js.native
    def report(path: String, handler: Handler[V], store: Any): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("report")
    var report_Original: ShortHandRoute[V] = js.native
    
    def reset(): Unit = js.native
    
    def search(path: String, handler: Handler[V]): Unit = js.native
    def search(path: String, handler: Handler[V], store: Any): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("search")
    var search_Original: ShortHandRoute[V] = js.native
    
    def source(path: String, handler: Handler[V]): Unit = js.native
    def source(path: String, handler: Handler[V], store: Any): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("source")
    var source_Original: ShortHandRoute[V] = js.native
    
    def subscribe(path: String, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, handler: Handler[V], store: Any): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("subscribe")
    var subscribe_Original: ShortHandRoute[V] = js.native
    
    def trace(path: String, handler: Handler[V]): Unit = js.native
    def trace(path: String, handler: Handler[V], store: Any): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("trace")
    var trace_Original: ShortHandRoute[V] = js.native
    
    def unbind(path: String, handler: Handler[V]): Unit = js.native
    def unbind(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unbind")
    var unbind_Original: ShortHandRoute[V] = js.native
    
    def unlink(path: String, handler: Handler[V]): Unit = js.native
    def unlink(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unlink")
    var unlink_Original: ShortHandRoute[V] = js.native
    
    def unlock(path: String, handler: Handler[V]): Unit = js.native
    def unlock(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unlock")
    var unlock_Original: ShortHandRoute[V] = js.native
    
    def unsubscribe(path: String, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, handler: Handler[V], store: Any): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: ShortHandRoute[V] = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends find-my-way.find-my-way.HTTPVersion.V1 ? node.http.IncomingMessage : node.http2.Http2ServerRequest
    }}}
    */
  @js.native
  trait Req[V] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    V extends find-my-way.find-my-way.HTTPVersion.V1 ? node.http.ServerResponse<node.http.IncomingMessage> : node.http2.Http2ServerResponse
    }}}
    */
  @js.native
  trait Res[V] extends StObject
  
  trait RouteOptions extends StObject {
    
    var constraints: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object RouteOptions {
    
    inline def apply(): RouteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteOptions]
    }
    
    extension [Self <: RouteOptions](x: Self) {
      
      inline def setConstraints(value: StringDictionary[Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
    }
  }
  
  @js.native
  trait ShortHandRoute[V /* <: HTTPVersion */] extends StObject {
    
    def apply(path: String, handler: Handler[V]): Unit = js.native
    def apply(path: String, handler: Handler[V], store: Any): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V], store: Any): Unit = js.native
  }
}
