package typingsJapgolly.nodeFetch

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.URL
import typingsJapgolly.formdataPolyfill.esmDotminMod.FormData
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.nodeFetch.nodeFetchStrings.abort
import typingsJapgolly.std.Error
import typingsJapgolly.std.IterableIterator
import typingsJapgolly.std.Record
import typingsJapgolly.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def default(url: RequestInfo, init: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("node-fetch", "AbortError")
  @js.native
  open class AbortError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_AbortError: typingsJapgolly.nodeFetch.nodeFetchStrings.AbortError = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: typingsJapgolly.nodeFetch.nodeFetchStrings.AbortError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Blob")
  @js.native
  val Blob: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.Blob */ Any = js.native
  
  @JSImport("node-fetch", "FetchError")
  @js.native
  open class FetchError protected ()
    extends StObject
       with Error {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: Record[String, Any]) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    var name_FetchError: typingsJapgolly.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: typingsJapgolly.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "File")
  @js.native
  val File: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof globalThis.File */ Any = js.native
  
  @JSImport("node-fetch", "Headers")
  @js.native
  open class Headers () extends StObject {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    /**
    	 * Returns an iterator allowing to go through all key/value pairs contained in this object.
    	 */
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    /**
    	 * Returns an iterator allowing to go through all keys of the key/value pairs contained in this object.
    	 */
    def keys(): IterableIterator[String] = js.native
    
    /** Node-fetch extension */
    def raw(): Record[String, js.Array[String]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    /**
    	 * Returns an iterator allowing to go through all values of the key/value pairs contained in this object.
    	 */
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("node-fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with BodyMixin {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[org.scalajs.dom.Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    /**
    	 * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
    	 */
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /**
    	 * Returns request's HTTP method, which is "GET" by default.
    	 */
    val method: String = js.native
    
    /**
    	 * Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default.
    	 */
    val redirect: RequestRedirect = js.native
    
    /**
    	 * A string whose value is a same-origin URL, "about:client", or the empty string, to set request’s referrer.
    	 */
    val referrer: String = js.native
    
    /**
    	 * A referrer policy to set request’s referrerPolicy.
    	 */
    val referrerPolicy: ReferrerPolicy = js.native
    
    /**
    	 * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
    	 */
    val signal: AbortSignal = js.native
    
    /* CompleteClass */
    override val size: Double = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /**
    	 * Returns the URL of request as a string.
    	 */
    val url: String = js.native
  }
  
  @JSImport("node-fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with BodyMixin {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[org.scalajs.dom.Blob] = js.native
    
    /* CompleteClass */
    override val body: ReadableStream | Null = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    val ok: Boolean = js.native
    
    val redirected: Boolean = js.native
    
    /* CompleteClass */
    override val size: Double = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val `type`: ResponseType = js.native
    
    val url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("node-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[Response]
    
    inline def redirect(url: String): Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[Response]
    inline def redirect(url: String, status: Double): Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Response]
  }
  
  inline def blobFrom(path: String): js.Promise[org.scalajs.dom.Blob] = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Blob]]
  inline def blobFrom(path: String, `type`: String): js.Promise[org.scalajs.dom.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Blob]]
  
  inline def blobFromSync(path: String): org.scalajs.dom.Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Blob]
  inline def blobFromSync(path: String, `type`: String): org.scalajs.dom.Blob = (^.asInstanceOf[js.Dynamic].applyDynamic("blobFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Blob]
  
  inline def fileFrom(path: String): js.Promise[org.scalajs.dom.File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.File]]
  inline def fileFrom(path: String, `type`: String): js.Promise[org.scalajs.dom.File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFrom")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.File]]
  
  inline def fileFromSync(path: String): org.scalajs.dom.File = ^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.File]
  inline def fileFromSync(path: String, `type`: String): org.scalajs.dom.File = (^.asInstanceOf[js.Dynamic].applyDynamic("fileFromSync")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.File]
  
  inline def isRedirect(code: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRedirect")(code.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AbortSignal extends StObject {
    
    val aborted: Boolean
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction0[/* this */ AbortSignal, Unit]): Unit
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction0[/* this */ AbortSignal, Unit]): Unit
  }
  object AbortSignal {
    
    inline def apply(
      aborted: Boolean,
      addEventListener: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Callback,
      removeEventListener: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Callback
    ): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2((t0: abort, t1: js.ThisFunction0[/* this */ AbortSignal, Unit]) => (addEventListener(t0, t1)).runNow()), removeEventListener = js.Any.fromFunction2((t0: abort, t1: js.ThisFunction0[/* this */ AbortSignal, Unit]) => (removeEventListener(t0, t1)).runNow()))
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setAddEventListener(value: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Callback): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2((t0: abort, t1: js.ThisFunction0[/* this */ AbortSignal, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setRemoveEventListener(value: (abort, js.ThisFunction0[/* this */ AbortSignal, Unit]) => Callback): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2((t0: abort, t1: js.ThisFunction0[/* this */ AbortSignal, Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  /* Inlined parent std.Pick<node-fetch.node-fetch.BodyMixin, keyof node-fetch.node-fetch.BodyMixin> */
  trait Body extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    @JSName("arrayBuffer")
    var arrayBuffer_Original: js.Function0[js.Promise[js.typedarray.ArrayBuffer]]
    
    def blob(): js.Promise[org.scalajs.dom.Blob]
    @JSName("blob")
    var blob_Original: js.Function0[js.Promise[org.scalajs.dom.Blob]]
    
    var body: js.UndefOr[ReadableStream | Null] = js.undefined
    
    var bodyUsed: Boolean
    
    def buffer(): js.Promise[Buffer]
    @JSName("buffer")
    var buffer_Original: js.Function0[js.Promise[Buffer]]
    
    def formData(): js.Promise[FormData]
    @JSName("formData")
    var formData_Original: js.Function0[js.Promise[FormData]]
    
    def json(): js.Promise[Any]
    @JSName("json")
    var json_Original: js.Function0[js.Promise[Any]]
    
    var size: Double
    
    def text(): js.Promise[String]
    @JSName("text")
    var text_Original: js.Function0[js.Promise[String]]
  }
  object Body {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[org.scalajs.dom.Blob]],
      bodyUsed: Boolean,
      buffer: CallbackTo[js.Promise[Buffer]],
      formData: CallbackTo[js.Promise[FormData]],
      json: CallbackTo[js.Promise[Any]],
      size: Double,
      text: CallbackTo[js.Promise[String]]
    ): Body = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = buffer.toJsFn, formData = formData.toJsFn, json = json.toJsFn, size = size.asInstanceOf[js.Any], text = text.toJsFn)
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[org.scalajs.dom.Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: CallbackTo[js.Promise[Buffer]]): Self = StObject.set(x, "buffer", value.toJsFn)
      
      inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  type BodyInit = org.scalajs.dom.Blob | Buffer | URLSearchParams | FormData | ReadableStream | String
  
  trait BodyMixin extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[org.scalajs.dom.Blob]
    
    val body: ReadableStream | Null
    
    val bodyUsed: Boolean
    
    /** @deprecated Use `body.arrayBuffer()` instead. */
    def buffer(): js.Promise[Buffer]
    
    def formData(): js.Promise[FormData]
    
    def json(): js.Promise[Any]
    
    val size: Double
    
    def text(): js.Promise[String]
  }
  object BodyMixin {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[org.scalajs.dom.Blob]],
      bodyUsed: Boolean,
      buffer: CallbackTo[js.Promise[Buffer]],
      formData: CallbackTo[js.Promise[FormData]],
      json: CallbackTo[js.Promise[Any]],
      size: Double,
      text: CallbackTo[js.Promise[String]]
    ): BodyMixin = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = buffer.toJsFn, formData = formData.toJsFn, json = json.toJsFn, size = size.asInstanceOf[js.Any], text = text.toJsFn, body = null)
      __obj.asInstanceOf[BodyMixin]
    }
    
    extension [Self <: BodyMixin](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[org.scalajs.dom.Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: ReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: CallbackTo[js.Promise[Buffer]]): Self = StObject.set(x, "buffer", value.toJsFn)
      
      inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  type HeadersInit = Headers | (Record[String, String]) | (js.Iterable[js.Iterable[String] | (js.Tuple2[String, String])])
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeFetch.nodeFetchStrings._empty
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.origin
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`origin-when-cross-origin`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin`
    - typingsJapgolly.nodeFetch.nodeFetchStrings.`unsafe-url`
  */
  trait ReferrerPolicy extends StObject
  object ReferrerPolicy {
    
    inline def _empty: typingsJapgolly.nodeFetch.nodeFetchStrings._empty = "".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings._empty]
    
    inline def `no-referrer`: typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typingsJapgolly.nodeFetch.nodeFetchStrings.origin = "origin".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.origin]
    
    inline def `origin-when-cross-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`same-origin`]
    
    inline def `strict-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typingsJapgolly.nodeFetch.nodeFetchStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.`unsafe-url`]
  }
  
  type RequestInfo = String | Request
  
  trait RequestInit extends StObject {
    
    // Node-fetch extensions to the whatwg/fetch spec
    var agent: js.UndefOr[
        Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])
      ] = js.undefined
    
    /**
    	 * A BodyInit object or null to set request's body.
    	 */
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    /**
    	 * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
    	 */
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
    
    /**
    	 * A string to set request's method.
    	 */
    var method: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: js.UndefOr[String] = js.undefined
    
    /**
    	 * A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect.
    	 */
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /**
    	 * A string whose value is a same-origin URL, "about:client", or the empty string, to set request’s referrer.
    	 */
    var referrer: js.UndefOr[String] = js.undefined
    
    /**
    	 * A referrer policy to set request’s referrerPolicy.
    	 */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /**
    	 * An AbortSignal to set request's signal.
    	 */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setAgent(value: Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL => js.UndefOr[Agent | Boolean]): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeFetch.nodeFetchStrings.error
    - typingsJapgolly.nodeFetch.nodeFetchStrings.follow
    - typingsJapgolly.nodeFetch.nodeFetchStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    inline def error: typingsJapgolly.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.error]
    
    inline def follow: typingsJapgolly.nodeFetch.nodeFetchStrings.follow = "follow".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.follow]
    
    inline def manual: typingsJapgolly.nodeFetch.nodeFetchStrings.manual = "manual".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.manual]
  }
  
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
    
    var statusText: js.UndefOr[String] = js.undefined
  }
  object ResponseInit {
    
    inline def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    extension [Self <: ResponseInit](x: Self) {
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeFetch.nodeFetchStrings.basic
    - typingsJapgolly.nodeFetch.nodeFetchStrings.cors
    - typingsJapgolly.nodeFetch.nodeFetchStrings.default
    - typingsJapgolly.nodeFetch.nodeFetchStrings.error
    - typingsJapgolly.nodeFetch.nodeFetchStrings.opaque
    - typingsJapgolly.nodeFetch.nodeFetchStrings.opaqueredirect
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def default: typingsJapgolly.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.default]
    
    inline def basic: typingsJapgolly.nodeFetch.nodeFetchStrings.basic = "basic".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.basic]
    
    inline def cors: typingsJapgolly.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.cors]
    
    inline def error: typingsJapgolly.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.error]
    
    inline def opaque: typingsJapgolly.nodeFetch.nodeFetchStrings.opaque = "opaque".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.opaque]
    
    inline def opaqueredirect: typingsJapgolly.nodeFetch.nodeFetchStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typingsJapgolly.nodeFetch.nodeFetchStrings.opaqueredirect]
  }
}
