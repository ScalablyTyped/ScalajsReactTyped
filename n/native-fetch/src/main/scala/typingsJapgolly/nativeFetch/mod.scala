package typingsJapgolly.nativeFetch

import org.scalajs.dom.AbortSignal
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.ReadableStream
import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestDestination
import org.scalajs.dom.RequestInit
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import org.scalajs.dom.ResponseInit
import org.scalajs.dom.ResponseType
import org.scalajs.dom.URL
import typingsJapgolly.std.BodyInit
import typingsJapgolly.std.HeadersInit
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("native-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("native-fetch", "Headers")
  @js.native
  open class Headers ()
    extends StObject
       with typingsJapgolly.std.Headers {
    def this(init: HeadersInit) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("native-fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with typingsJapgolly.std.Request {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    /* standard dom */
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /** Returns the cache mode associated with request, which is a string indicating how the request will interact with the browser's cache when fetching. */
    /* standard dom */
    /* CompleteClass */
    override val cache: RequestCache = js.native
    
    /** Returns the credentials mode associated with request, which is a string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. */
    /* standard dom */
    /* CompleteClass */
    override val credentials: RequestCredentials = js.native
    
    /** Returns the kind of resource requested by request, e.g., "document" or "script". */
    /* standard dom */
    /* CompleteClass */
    override val destination: RequestDestination = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    /** Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header. */
    /* standard dom */
    /* CompleteClass */
    override val headers: org.scalajs.dom.Headers = js.native
    
    /** Returns request's subresource integrity metadata, which is a cryptographic hash of the resource being fetched. Its value consists of multiple hashes separated by whitespace. [SRI] */
    /* standard dom */
    /* CompleteClass */
    override val integrity: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /** Returns a boolean indicating whether or not request can outlive the global in which it was created. */
    /* standard dom */
    /* CompleteClass */
    override val keepalive: Boolean = js.native
    
    /** Returns request's HTTP method, which is "GET" by default. */
    /* standard dom */
    /* CompleteClass */
    override val method: String = js.native
    
    /** Returns the mode associated with request, which is a string indicating whether the request will use CORS, or will be restricted to same-origin URLs. */
    /* standard dom */
    /* CompleteClass */
    override val mode: RequestMode = js.native
    
    /** Returns the redirect mode associated with request, which is a string indicating how redirects for the request will be handled during fetching. A request will follow redirects by default. */
    /* standard dom */
    /* CompleteClass */
    override val redirect: RequestRedirect = js.native
    
    /** Returns the referrer of request. Its value can be a same-origin URL if explicitly set in init, the empty string to indicate no referrer, and "about:client" when defaulting to the global's default. This is used during fetching to determine the value of the `Referer` header of the request being made. */
    /* standard dom */
    /* CompleteClass */
    override val referrer: String = js.native
    
    /** Returns the referrer policy associated with request. This is used during fetching to compute the value of the request's referrer. */
    /* standard dom */
    /* CompleteClass */
    override val referrerPolicy: ReferrerPolicy = js.native
    
    /** Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler. */
    /* standard dom */
    /* CompleteClass */
    override val signal: AbortSignal = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /** Returns the URL of request as a string. */
    /* standard dom */
    /* CompleteClass */
    override val url: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("native-fetch", "Response")
  @js.native
  open class Response ()
    extends StObject
       with typingsJapgolly.std.Response {
    def this(body: BodyInit) = this()
    def this(body: Null, init: ResponseInit) = this()
    def this(body: Unit, init: ResponseInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* standard dom */
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val body: ReadableStream[js.typedarray.Uint8Array] | Null = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val headers: org.scalajs.dom.Headers = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def json(): js.Promise[Any] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val ok: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val redirected: Boolean = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val status: Double = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val statusText: String = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val `type`: ResponseType = js.native
    
    /* standard dom */
    /* CompleteClass */
    override val url: String = js.native
  }
  object Response {
    
    @JSImport("native-fetch", "Response")
    @js.native
    val ^ : js.Any = js.native
    
    inline def error(): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[org.scalajs.dom.Response]
    
    inline def redirect(url: String): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: String, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: URL): org.scalajs.dom.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Response]
    inline def redirect(url: URL, status: Double): org.scalajs.dom.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Response]
  }
  
  /* was `typeof fetch` */
  inline def fetch(input: URL): js.Promise[org.scalajs.dom.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: URL, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
}
