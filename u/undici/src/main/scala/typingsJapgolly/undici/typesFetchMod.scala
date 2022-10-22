package typingsJapgolly.undici

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.Blob
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.streamWebMod.ReadableStream
import typingsJapgolly.node.urlMod.URLSearchParams
import typingsJapgolly.node.urlMod.URL_
import typingsJapgolly.std.AsyncIterable
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.Record
import typingsJapgolly.undici.typesFormdataMod.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFetchMod {
  
  @JSImport("undici/types/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("undici/types/fetch", "Headers")
  @js.native
  open class Headers ()
    extends StObject
       with SpecIterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    def entries(): SpecIterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* iterable */ this.type, Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* iterable */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): SpecIterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): SpecIterableIterator[String] = js.native
  }
  
  @JSImport("undici/types/fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with BodyMixin {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream[Any] | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    val cache: RequestCache = js.native
    
    val credentials: RequestCredentials = js.native
    
    val destination: RequestDestination = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    val integrity: String = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val keepalive: Boolean = js.native
    
    val method: String = js.native
    
    val mode: RequestMode = js.native
    
    val redirect: RequestRedirect = js.native
    
    val referrerPolicy: String = js.native
    
    val signal: AbortSignal = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val url: String = js.native
  }
  
  @JSImport("undici/types/fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with BodyMixin {
    def this(body: BodyInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream[Any] | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val `type`: ResponseType = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("undici/types/fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def json(data: Any): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def json(data: Any, init: ResponseInit): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("json")(data.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Response]
    
    inline def redirect(url: String, status: ResponseRedirectStatus): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
    inline def redirect(url: URL_, status: ResponseRedirectStatus): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  inline def fetch(input: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  type BodyInit = js.typedarray.ArrayBuffer | AsyncIterable[js.typedarray.Uint8Array] | Blob | FormData | js.Iterable[js.typedarray.Uint8Array] | ArrayBufferView | URLSearchParams | Null | String
  
  trait BodyMixin extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Blob]
    
    val body: ReadableStream[Any] | Null
    
    val bodyUsed: Boolean
    
    def formData(): js.Promise[FormData]
    
    def json(): js.Promise[Any]
    
    def text(): js.Promise[String]
  }
  object BodyMixin {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      formData: CallbackTo[js.Promise[FormData]],
      json: CallbackTo[js.Promise[Any]],
      text: CallbackTo[js.Promise[String]]
    ): BodyMixin = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = formData.toJsFn, json = json.toJsFn, text = text.toJsFn, body = null)
      __obj.asInstanceOf[BodyMixin]
    }
    
    extension [Self <: BodyMixin](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: ReadableStream[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  type HeadersInit = js.Array[js.Array[String]] | (Record[String, String | js.Array[String]]) | Headers
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings._empty
    - typingsJapgolly.undici.undiciStrings.`no-referrer`
    - typingsJapgolly.undici.undiciStrings.`no-referrer-when-downgrade`
    - typingsJapgolly.undici.undiciStrings.origin
    - typingsJapgolly.undici.undiciStrings.`origin-when-cross-origin`
    - typingsJapgolly.undici.undiciStrings.`same-origin`
    - typingsJapgolly.undici.undiciStrings.`strict-origin`
    - typingsJapgolly.undici.undiciStrings.`strict-origin-when-cross-origin`
    - typingsJapgolly.undici.undiciStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typingsJapgolly.undici.undiciStrings._empty = "".asInstanceOf[typingsJapgolly.undici.undiciStrings._empty]
    
    inline def `no-referrer`: typingsJapgolly.undici.undiciStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsJapgolly.undici.undiciStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typingsJapgolly.undici.undiciStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsJapgolly.undici.undiciStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typingsJapgolly.undici.undiciStrings.origin = "origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.origin]
    
    inline def `origin-when-cross-origin`: typingsJapgolly.undici.undiciStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typingsJapgolly.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`same-origin`]
    
    inline def `strict-origin`: typingsJapgolly.undici.undiciStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typingsJapgolly.undici.undiciStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typingsJapgolly.undici.undiciStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsJapgolly.undici.undiciStrings.`unsafe-url`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings.default
    - typingsJapgolly.undici.undiciStrings.`force-cache`
    - typingsJapgolly.undici.undiciStrings.`no-cache`
    - typingsJapgolly.undici.undiciStrings.`no-store`
    - typingsJapgolly.undici.undiciStrings.`only-if-cached`
    - typingsJapgolly.undici.undiciStrings.reload
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    inline def default: typingsJapgolly.undici.undiciStrings.default = "default".asInstanceOf[typingsJapgolly.undici.undiciStrings.default]
    
    inline def `force-cache`: typingsJapgolly.undici.undiciStrings.`force-cache` = "force-cache".asInstanceOf[typingsJapgolly.undici.undiciStrings.`force-cache`]
    
    inline def `no-cache`: typingsJapgolly.undici.undiciStrings.`no-cache` = "no-cache".asInstanceOf[typingsJapgolly.undici.undiciStrings.`no-cache`]
    
    inline def `no-store`: typingsJapgolly.undici.undiciStrings.`no-store` = "no-store".asInstanceOf[typingsJapgolly.undici.undiciStrings.`no-store`]
    
    inline def `only-if-cached`: typingsJapgolly.undici.undiciStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typingsJapgolly.undici.undiciStrings.`only-if-cached`]
    
    inline def reload: typingsJapgolly.undici.undiciStrings.reload = "reload".asInstanceOf[typingsJapgolly.undici.undiciStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings.omit
    - typingsJapgolly.undici.undiciStrings.include
    - typingsJapgolly.undici.undiciStrings.`same-origin`
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    inline def include: typingsJapgolly.undici.undiciStrings.include = "include".asInstanceOf[typingsJapgolly.undici.undiciStrings.include]
    
    inline def omit: typingsJapgolly.undici.undiciStrings.omit = "omit".asInstanceOf[typingsJapgolly.undici.undiciStrings.omit]
    
    inline def `same-origin`: typingsJapgolly.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings._empty
    - typingsJapgolly.undici.undiciStrings.audio
    - typingsJapgolly.undici.undiciStrings.audioworklet
    - typingsJapgolly.undici.undiciStrings.document
    - typingsJapgolly.undici.undiciStrings.embed
    - typingsJapgolly.undici.undiciStrings.font
    - typingsJapgolly.undici.undiciStrings.image
    - typingsJapgolly.undici.undiciStrings.manifest
    - typingsJapgolly.undici.undiciStrings.`object`
    - typingsJapgolly.undici.undiciStrings.paintworklet
    - typingsJapgolly.undici.undiciStrings.report
    - typingsJapgolly.undici.undiciStrings.script
    - typingsJapgolly.undici.undiciStrings.sharedworker
    - typingsJapgolly.undici.undiciStrings.style
    - typingsJapgolly.undici.undiciStrings.track
    - typingsJapgolly.undici.undiciStrings.video
    - typingsJapgolly.undici.undiciStrings.worker
    - typingsJapgolly.undici.undiciStrings.xslt
  */
  trait RequestDestination extends StObject
  object RequestDestination {
    
    inline def _empty: typingsJapgolly.undici.undiciStrings._empty = "".asInstanceOf[typingsJapgolly.undici.undiciStrings._empty]
    
    inline def audio: typingsJapgolly.undici.undiciStrings.audio = "audio".asInstanceOf[typingsJapgolly.undici.undiciStrings.audio]
    
    inline def audioworklet: typingsJapgolly.undici.undiciStrings.audioworklet = "audioworklet".asInstanceOf[typingsJapgolly.undici.undiciStrings.audioworklet]
    
    inline def document: typingsJapgolly.undici.undiciStrings.document = "document".asInstanceOf[typingsJapgolly.undici.undiciStrings.document]
    
    inline def embed: typingsJapgolly.undici.undiciStrings.embed = "embed".asInstanceOf[typingsJapgolly.undici.undiciStrings.embed]
    
    inline def font: typingsJapgolly.undici.undiciStrings.font = "font".asInstanceOf[typingsJapgolly.undici.undiciStrings.font]
    
    inline def image: typingsJapgolly.undici.undiciStrings.image = "image".asInstanceOf[typingsJapgolly.undici.undiciStrings.image]
    
    inline def manifest: typingsJapgolly.undici.undiciStrings.manifest = "manifest".asInstanceOf[typingsJapgolly.undici.undiciStrings.manifest]
    
    inline def `object`: typingsJapgolly.undici.undiciStrings.`object` = "object".asInstanceOf[typingsJapgolly.undici.undiciStrings.`object`]
    
    inline def paintworklet: typingsJapgolly.undici.undiciStrings.paintworklet = "paintworklet".asInstanceOf[typingsJapgolly.undici.undiciStrings.paintworklet]
    
    inline def report: typingsJapgolly.undici.undiciStrings.report = "report".asInstanceOf[typingsJapgolly.undici.undiciStrings.report]
    
    inline def script: typingsJapgolly.undici.undiciStrings.script = "script".asInstanceOf[typingsJapgolly.undici.undiciStrings.script]
    
    inline def sharedworker: typingsJapgolly.undici.undiciStrings.sharedworker = "sharedworker".asInstanceOf[typingsJapgolly.undici.undiciStrings.sharedworker]
    
    inline def style: typingsJapgolly.undici.undiciStrings.style = "style".asInstanceOf[typingsJapgolly.undici.undiciStrings.style]
    
    inline def track: typingsJapgolly.undici.undiciStrings.track = "track".asInstanceOf[typingsJapgolly.undici.undiciStrings.track]
    
    inline def video: typingsJapgolly.undici.undiciStrings.video = "video".asInstanceOf[typingsJapgolly.undici.undiciStrings.video]
    
    inline def worker: typingsJapgolly.undici.undiciStrings.worker = "worker".asInstanceOf[typingsJapgolly.undici.undiciStrings.worker]
    
    inline def xslt: typingsJapgolly.undici.undiciStrings.xslt = "xslt".asInstanceOf[typingsJapgolly.undici.undiciStrings.xslt]
  }
  
  type RequestInfo = String | URL_ | Request
  
  trait RequestInit extends StObject {
    
    var body: js.UndefOr[BodyInit] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var dispatcher: js.UndefOr[typingsJapgolly.undici.typesDispatcherMod.^] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDispatcher(value: typingsJapgolly.undici.typesDispatcherMod.^): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
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
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings.cors
    - typingsJapgolly.undici.undiciStrings.navigate
    - typingsJapgolly.undici.undiciStrings.`no-cors`
    - typingsJapgolly.undici.undiciStrings.`same-origin`
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    inline def cors: typingsJapgolly.undici.undiciStrings.cors = "cors".asInstanceOf[typingsJapgolly.undici.undiciStrings.cors]
    
    inline def navigate: typingsJapgolly.undici.undiciStrings.navigate = "navigate".asInstanceOf[typingsJapgolly.undici.undiciStrings.navigate]
    
    inline def `no-cors`: typingsJapgolly.undici.undiciStrings.`no-cors` = "no-cors".asInstanceOf[typingsJapgolly.undici.undiciStrings.`no-cors`]
    
    inline def `same-origin`: typingsJapgolly.undici.undiciStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.undici.undiciStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings.error
    - typingsJapgolly.undici.undiciStrings.follow
    - typingsJapgolly.undici.undiciStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    inline def error: typingsJapgolly.undici.undiciStrings.error = "error".asInstanceOf[typingsJapgolly.undici.undiciStrings.error]
    
    inline def follow: typingsJapgolly.undici.undiciStrings.follow = "follow".asInstanceOf[typingsJapgolly.undici.undiciStrings.follow]
    
    inline def manual: typingsJapgolly.undici.undiciStrings.manual = "manual".asInstanceOf[typingsJapgolly.undici.undiciStrings.manual]
  }
  
  trait ResponseInit extends StObject {
    
    val headers: js.UndefOr[HeadersInit] = js.undefined
    
    val status: js.UndefOr[Double] = js.undefined
    
    val statusText: js.UndefOr[String] = js.undefined
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
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciInts.`301`
    - typingsJapgolly.undici.undiciInts.`302`
    - typingsJapgolly.undici.undiciInts.`303`
    - typingsJapgolly.undici.undiciInts.`307`
    - typingsJapgolly.undici.undiciInts.`308`
  */
  trait ResponseRedirectStatus extends StObject
  object ResponseRedirectStatus {
    
    inline def `301`: typingsJapgolly.undici.undiciInts.`301` = 301.asInstanceOf[typingsJapgolly.undici.undiciInts.`301`]
    
    inline def `302`: typingsJapgolly.undici.undiciInts.`302` = 302.asInstanceOf[typingsJapgolly.undici.undiciInts.`302`]
    
    inline def `303`: typingsJapgolly.undici.undiciInts.`303` = 303.asInstanceOf[typingsJapgolly.undici.undiciInts.`303`]
    
    inline def `307`: typingsJapgolly.undici.undiciInts.`307` = 307.asInstanceOf[typingsJapgolly.undici.undiciInts.`307`]
    
    inline def `308`: typingsJapgolly.undici.undiciInts.`308` = 308.asInstanceOf[typingsJapgolly.undici.undiciInts.`308`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.undici.undiciStrings.basic
    - typingsJapgolly.undici.undiciStrings.cors
    - typingsJapgolly.undici.undiciStrings.default
    - typingsJapgolly.undici.undiciStrings.error
    - typingsJapgolly.undici.undiciStrings.opaque
    - typingsJapgolly.undici.undiciStrings.opaqueredirect
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def default: typingsJapgolly.undici.undiciStrings.default = "default".asInstanceOf[typingsJapgolly.undici.undiciStrings.default]
    
    inline def basic: typingsJapgolly.undici.undiciStrings.basic = "basic".asInstanceOf[typingsJapgolly.undici.undiciStrings.basic]
    
    inline def cors: typingsJapgolly.undici.undiciStrings.cors = "cors".asInstanceOf[typingsJapgolly.undici.undiciStrings.cors]
    
    inline def error: typingsJapgolly.undici.undiciStrings.error = "error".asInstanceOf[typingsJapgolly.undici.undiciStrings.error]
    
    inline def opaque: typingsJapgolly.undici.undiciStrings.opaque = "opaque".asInstanceOf[typingsJapgolly.undici.undiciStrings.opaque]
    
    inline def opaqueredirect: typingsJapgolly.undici.undiciStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typingsJapgolly.undici.undiciStrings.opaqueredirect]
  }
  
  @js.native
  trait SpecIterable[T] extends StObject {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[SpecIterator[T, Any, Unit]] = js.native
  }
  
  @js.native
  trait SpecIterableIterator[T]
    extends StObject
       with SpecIterator[T, Any, Unit] {
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[SpecIterableIterator[T]] = js.native
  }
  
  @js.native
  trait SpecIterator[T, TReturn, TNext] extends StObject {
    
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [] | [TNext] is not an array type */ args: js.Array[Any | TNext]
    ): IteratorResult[T, TReturn] = js.native
  }
}
