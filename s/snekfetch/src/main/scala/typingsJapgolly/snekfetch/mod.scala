package typingsJapgolly.snekfetch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snekfetch", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Snekfetch {
    def this(method: methods, url: String) = this()
    def this(method: methods, url: String, opts: SnekfetchOptions) = this()
  }
  @JSImport("snekfetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("snekfetch", "METHODS")
  @js.native
  def METHODS_ : js.Array[methods] = js.native
  
  inline def METHODS__=(x: js.Array[methods]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def acl(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("acl")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def acl(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("acl")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def bind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def bind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def checkout(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def checkout(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def connect(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def connect(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def copy(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def copy(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def delete(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def delete(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def get(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def get(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def head(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def head(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def link(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def link(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def lock(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def lock(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def merge(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def merge(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkactivity(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkactivity")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkactivity(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkactivity")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkcalendar(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkcalendar")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkcalendar(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkcalendar")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkcol(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkcol")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkcol(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkcol")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def move(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def move(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def notify_(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def notify_(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def options(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def options(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def patch(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def patch(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def post(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def post(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def propfind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def propfind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def proppatch(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("proppatch")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def proppatch(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("proppatch")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def purge(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("purge")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def purge(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("purge")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def put(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def put(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def rebind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def rebind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def report(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("report")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def report(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def search(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def search(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def source(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def source(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def subscribe(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def subscribe(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def trace(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def trace(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unbind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unbind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unlink(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unlink(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unlock(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unlock(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unsubscribe(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unsubscribe(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  @JSImport("snekfetch", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Snekfetch extends Readable {
    
    def attach(name: String, data: String): Snekfetch = js.native
    def attach(name: String, data: String, filename: String): Snekfetch = js.native
    def attach(name: String, data: js.Object): Snekfetch = js.native
    def attach(name: String, data: js.Object, filename: String): Snekfetch = js.native
    def attach(name: String, data: Buffer): Snekfetch = js.native
    def attach(name: String, data: Buffer, filename: String): Snekfetch = js.native
    
    def `catch`(rejector: js.Function1[/* err */ js.Error, Any]): js.Promise[SnekfetchResponse] = js.native
    
    var data: Any = js.native
    
    def end(): js.Promise[SnekfetchResponse] = js.native
    def end[T](cb: js.Function2[/* err */ js.Error | Null, /* res */ SnekfetchResponse | js.Error | Null, T]): js.Promise[T] = js.native
    
    def query(name: String): Snekfetch = js.native
    def query(name: String, value: String): Snekfetch = js.native
    def query(name: StringDictionary[Any]): Snekfetch = js.native
    def query(name: StringDictionary[Any], value: String): Snekfetch = js.native
    
    var request: ClientRequest = js.native
    
    val response: SnekfetchResponse | Null = js.native
    
    def send(): Snekfetch = js.native
    def send(data: String): Snekfetch = js.native
    def send(data: js.Object): Snekfetch = js.native
    def send(data: Buffer): Snekfetch = js.native
    
    def set(name: String): Snekfetch = js.native
    def set(name: String, value: String): Snekfetch = js.native
    def set(name: StringDictionary[Any]): Snekfetch = js.native
    def set(name: StringDictionary[Any], value: String): Snekfetch = js.native
    
    def `then`(): js.Promise[SnekfetchResponse] = js.native
    def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T]): js.Promise[T] = js.native
    def `then`[T](
      resolver: js.Function1[/* res */ SnekfetchResponse, T],
      rejector: js.Function1[/* err */ js.Error, Any]
    ): js.Promise[T] = js.native
  }
  
  trait SnekfetchOptions extends StObject {
    
    var agent: js.UndefOr[Agent | Boolean] = js.undefined
    
    var data: js.UndefOr[js.Object | String | Buffer] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var qs: js.UndefOr[js.Object] = js.undefined
    
    var query: js.UndefOr[js.Object | String] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
  }
  object SnekfetchOptions {
    
    inline def apply(): SnekfetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnekfetchOptions]
    }
    
    extension [Self <: SnekfetchOptions](x: Self) {
      
      inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setData(value: js.Object | String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait SnekfetchResponse extends StObject {
    
    var body: String | js.Object | Buffer
    
    var headers: StringDictionary[Any]
    
    var ok: Boolean
    
    var raw: Buffer
    
    var request: ClientRequest
    
    var status: Double
    
    var statusText: String
  }
  object SnekfetchResponse {
    
    inline def apply(
      body: String | js.Object | Buffer,
      headers: StringDictionary[Any],
      ok: Boolean,
      raw: Buffer,
      request: ClientRequest,
      status: Double,
      statusText: String
    ): SnekfetchResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnekfetchResponse]
    }
    
    extension [Self <: SnekfetchResponse](x: Self) {
      
      inline def setBody(value: String | js.Object | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ClientRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.snekfetch.snekfetchStrings.ACL
    - typingsJapgolly.snekfetch.snekfetchStrings.BIND
    - typingsJapgolly.snekfetch.snekfetchStrings.CHECKOUT
    - typingsJapgolly.snekfetch.snekfetchStrings.CONNECT
    - typingsJapgolly.snekfetch.snekfetchStrings.COPY
    - typingsJapgolly.snekfetch.snekfetchStrings.DELETE
    - typingsJapgolly.snekfetch.snekfetchStrings.GET
    - typingsJapgolly.snekfetch.snekfetchStrings.HEAD
    - typingsJapgolly.snekfetch.snekfetchStrings.LINK
    - typingsJapgolly.snekfetch.snekfetchStrings.LOCK
    - typingsJapgolly.snekfetch.snekfetchStrings.MERGE
    - typingsJapgolly.snekfetch.snekfetchStrings.MKACTIVITY
    - typingsJapgolly.snekfetch.snekfetchStrings.MKCALENDAR
    - typingsJapgolly.snekfetch.snekfetchStrings.MKCOL
    - typingsJapgolly.snekfetch.snekfetchStrings.MOVE
    - typingsJapgolly.snekfetch.snekfetchStrings.NOTIFY
    - typingsJapgolly.snekfetch.snekfetchStrings.OPTIONS
    - typingsJapgolly.snekfetch.snekfetchStrings.PATCH
    - typingsJapgolly.snekfetch.snekfetchStrings.POST
    - typingsJapgolly.snekfetch.snekfetchStrings.PROPFIND
    - typingsJapgolly.snekfetch.snekfetchStrings.PROPPATCH
    - typingsJapgolly.snekfetch.snekfetchStrings.PURGE
    - typingsJapgolly.snekfetch.snekfetchStrings.PUT
    - typingsJapgolly.snekfetch.snekfetchStrings.REBIND
    - typingsJapgolly.snekfetch.snekfetchStrings.REPORT
    - typingsJapgolly.snekfetch.snekfetchStrings.SEARCH
    - typingsJapgolly.snekfetch.snekfetchStrings.SOURCE
    - typingsJapgolly.snekfetch.snekfetchStrings.SUBSCRIBE
    - typingsJapgolly.snekfetch.snekfetchStrings.TRACE
    - typingsJapgolly.snekfetch.snekfetchStrings.UNBIND
    - typingsJapgolly.snekfetch.snekfetchStrings.UNLINK
    - typingsJapgolly.snekfetch.snekfetchStrings.UNLOCK
    - typingsJapgolly.snekfetch.snekfetchStrings.UNSUBSCRIBE
  */
  trait methods extends StObject
  object methods {
    
    inline def ACL: typingsJapgolly.snekfetch.snekfetchStrings.ACL = "ACL".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.ACL]
    
    inline def BIND: typingsJapgolly.snekfetch.snekfetchStrings.BIND = "BIND".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.BIND]
    
    inline def CHECKOUT: typingsJapgolly.snekfetch.snekfetchStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.CHECKOUT]
    
    inline def CONNECT: typingsJapgolly.snekfetch.snekfetchStrings.CONNECT = "CONNECT".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.CONNECT]
    
    inline def COPY: typingsJapgolly.snekfetch.snekfetchStrings.COPY = "COPY".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.COPY]
    
    inline def DELETE: typingsJapgolly.snekfetch.snekfetchStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.DELETE]
    
    inline def GET: typingsJapgolly.snekfetch.snekfetchStrings.GET = "GET".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.GET]
    
    inline def HEAD: typingsJapgolly.snekfetch.snekfetchStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.HEAD]
    
    inline def LINK: typingsJapgolly.snekfetch.snekfetchStrings.LINK = "LINK".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.LINK]
    
    inline def LOCK: typingsJapgolly.snekfetch.snekfetchStrings.LOCK = "LOCK".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.LOCK]
    
    inline def MERGE: typingsJapgolly.snekfetch.snekfetchStrings.MERGE = "MERGE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.MERGE]
    
    inline def MKACTIVITY: typingsJapgolly.snekfetch.snekfetchStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typingsJapgolly.snekfetch.snekfetchStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.MKCALENDAR]
    
    inline def MKCOL: typingsJapgolly.snekfetch.snekfetchStrings.MKCOL = "MKCOL".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.MKCOL]
    
    inline def MOVE: typingsJapgolly.snekfetch.snekfetchStrings.MOVE = "MOVE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.MOVE]
    
    inline def NOTIFY: typingsJapgolly.snekfetch.snekfetchStrings.NOTIFY = "NOTIFY".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.NOTIFY]
    
    inline def OPTIONS: typingsJapgolly.snekfetch.snekfetchStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.snekfetch.snekfetchStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.PATCH]
    
    inline def POST: typingsJapgolly.snekfetch.snekfetchStrings.POST = "POST".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.POST]
    
    inline def PROPFIND: typingsJapgolly.snekfetch.snekfetchStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.PROPFIND]
    
    inline def PROPPATCH: typingsJapgolly.snekfetch.snekfetchStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.PROPPATCH]
    
    inline def PURGE: typingsJapgolly.snekfetch.snekfetchStrings.PURGE = "PURGE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.PURGE]
    
    inline def PUT: typingsJapgolly.snekfetch.snekfetchStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.PUT]
    
    inline def REBIND: typingsJapgolly.snekfetch.snekfetchStrings.REBIND = "REBIND".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.REBIND]
    
    inline def REPORT: typingsJapgolly.snekfetch.snekfetchStrings.REPORT = "REPORT".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.REPORT]
    
    inline def SEARCH: typingsJapgolly.snekfetch.snekfetchStrings.SEARCH = "SEARCH".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.SEARCH]
    
    inline def SOURCE: typingsJapgolly.snekfetch.snekfetchStrings.SOURCE = "SOURCE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.SOURCE]
    
    inline def SUBSCRIBE: typingsJapgolly.snekfetch.snekfetchStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.SUBSCRIBE]
    
    inline def TRACE: typingsJapgolly.snekfetch.snekfetchStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.TRACE]
    
    inline def UNBIND: typingsJapgolly.snekfetch.snekfetchStrings.UNBIND = "UNBIND".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.UNBIND]
    
    inline def UNLINK: typingsJapgolly.snekfetch.snekfetchStrings.UNLINK = "UNLINK".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.UNLINK]
    
    inline def UNLOCK: typingsJapgolly.snekfetch.snekfetchStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typingsJapgolly.snekfetch.snekfetchStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typingsJapgolly.snekfetch.snekfetchStrings.UNSUBSCRIBE]
  }
}
