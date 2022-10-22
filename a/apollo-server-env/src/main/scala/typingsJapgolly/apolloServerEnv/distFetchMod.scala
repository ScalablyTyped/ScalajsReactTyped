package typingsJapgolly.apolloServerEnv

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloServerEnv.apolloServerEnvBooleans.`false`
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFetchMod {
  
  @JSImport("apollo-server-env/dist/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("apollo-server-env/dist/fetch", "Body")
  @js.native
  open class Body () extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    val bodyUsed: Boolean = js.native
    
    def json(): js.Promise[Any] = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Headers")
  @js.native
  open class Headers ()
    extends StObject
       with Iterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): js.Iterator[js.Tuple2[String, String]] = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): js.Iterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): js.Iterator[String] = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Request")
  @js.native
  open class Request protected () extends Body {
    def this(input: String) = this()
    def this(input: Request) = this()
    def this(input: String, init: RequestInit) = this()
    def this(input: Request, init: RequestInit) = this()
    
    val headers: Headers = js.native
    
    val method: String = js.native
    
    val url: String = js.native
  }
  
  @JSImport("apollo-server-env/dist/fetch", "Response")
  @js.native
  open class Response () extends Body {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    val headers: Headers = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("apollo-server-env/dist/fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def redirect(url: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def redirect(url: String, status: Double): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  inline def fetch(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  type BodyInit = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings._empty
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.origin
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings._empty = "".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings._empty]
    
    inline def `no-referrer`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.origin = "origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.origin]
    
    inline def `origin-when-cross-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
    
    inline def `strict-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`unsafe-url`]
  }
  
  type RequestAgent = Agent | typingsJapgolly.node.httpsMod.Agent
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.default
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-store`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.reload
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cache`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`force-cache`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    inline def default: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.default = "default".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.default]
    
    inline def `force-cache`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`force-cache` = "force-cache".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`force-cache`]
    
    inline def `no-cache`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cache` = "no-cache".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cache`]
    
    inline def `no-store`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-store` = "no-store".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-store`]
    
    inline def `only-if-cached`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`only-if-cached`]
    
    inline def reload: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.reload = "reload".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.omit
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.include
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    inline def include: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.include = "include".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.include]
    
    inline def omit: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.omit = "omit".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.omit]
    
    inline def `same-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
  }
  
  type RequestInfo = Request | String
  
  trait RequestInit extends StObject {
    
    var agent: js.UndefOr[RequestAgent | `false`] = js.undefined
    
    var body: js.UndefOr[BodyInit] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    // Cloudflare Workers accept a `cf` property to control Cloudflare features
    // See https://developers.cloudflare.com/workers/reference/cloudflare-features/
    var cf: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    // The following properties are node-fetch extensions
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setAgent(value: RequestAgent | `false`): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCf(value: StringDictionary[Any]): Self = StObject.set(x, "cf", value.asInstanceOf[js.Any])
      
      inline def setCfUndefined: Self = StObject.set(x, "cf", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.navigate
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cors`
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.cors
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    inline def cors: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.cors = "cors".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.cors]
    
    inline def navigate: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.navigate = "navigate".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.navigate]
    
    inline def `no-cors`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cors` = "no-cors".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`no-cors`]
    
    inline def `same-origin`: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.follow
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.error
    - typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    inline def error: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.error = "error".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.error]
    
    inline def follow: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.follow = "follow".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.follow]
    
    inline def manual: typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.manual = "manual".asInstanceOf[typingsJapgolly.apolloServerEnv.apolloServerEnvStrings.manual]
  }
  
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
    
    // Although this isn't part of the spec, `node-fetch` accepts a `url` property
    var url: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    extension [Self <: ResponseInit](x: Self) {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
