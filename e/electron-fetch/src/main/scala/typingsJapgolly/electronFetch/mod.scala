package typingsJapgolly.electronFetch

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.Blob
import org.scalajs.dom.FormData
import org.scalajs.dom.RequestRedirect
import org.scalajs.dom.ResponseInit
import typingsJapgolly.electron.Electron.CrossProcessExports.Session_
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpsMod.Agent
import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.node.streamMod.Stream
import typingsJapgolly.std.Error
import typingsJapgolly.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("electron-fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: RequestInfo): js.Promise[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Response]]
  inline def default(url: RequestInfo, options: RequestInit): js.Promise[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Response]]
  
  @JSImport("electron-fetch", "FetchError")
  @js.native
  open class FetchError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("electron-fetch", "Headers")
  @js.native
  open class Headers () extends StObject {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    // WebIDL pair iterator: iterable<ByteString, ByteString>
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* value */ String, /* name */ String, /* headers */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): IterableIterator[String] = js.native
  }
  
  @JSImport("electron-fetch", "Request")
  @js.native
  open class Request protected ()
    extends StObject
       with Body {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    val body: Readable = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    // (/!\ only works when running on Node.js)
    var counter: Double = js.native
    
    ////////////////////////////////////////////////////////////////////////////
    // The following properties are electron-fetch extensions
    // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
    var follow: Double = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json[T](): js.Promise[T] = js.native
    
    val method: String = js.native
    
    val redirect: RequestRedirect = js.native
    
    // (/!\ only works when running on Electron)
    var session: js.UndefOr[Session_] = js.native
    
    val signal: AbortSignal = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val url: String = js.native
    
    // (/!\ only works when running on Electron, throws when set to true on Node.js)
    var useElectronNet: Boolean = js.native
    
    // (/!\ only works when running on Electron)
    var useSessionCookies: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("electron-fetch", "Response")
  @js.native
  open class Response protected ()
    extends StObject
       with Body {
    def this(body: BodyInit) = this()
    def this(body: BodyInit, init: ResponseInit) = this()
    
    /* CompleteClass */
    override def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    /* CompleteClass */
    override def blob(): js.Promise[Blob] = js.native
    
    val body: Readable | String = js.native
    
    /* CompleteClass */
    override val bodyUsed: Boolean = js.native
    
    /* CompleteClass */
    override def buffer(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def formData(): js.Promise[FormData] = js.native
    
    val headers: Headers = js.native
    
    /* CompleteClass */
    override def json[T](): js.Promise[T] = js.native
    
    val ok: Boolean = js.native
    
    val status: Double = js.native
    
    val statusText: String = js.native
    
    /* CompleteClass */
    override def text(): js.Promise[String] = js.native
    
    val url: String = js.native
  }
  
  trait Body extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Blob]
    
    val bodyUsed: Boolean
    
    def buffer(): js.Promise[Buffer]
    
    def formData(): js.Promise[FormData]
    
    def json[T](): js.Promise[T]
    
    def text(): js.Promise[String]
  }
  object Body {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Blob]],
      bodyUsed: Boolean,
      buffer: CallbackTo[js.Promise[Buffer]],
      formData: CallbackTo[js.Promise[FormData]],
      json: CallbackTo[js.Promise[Any]],
      text: CallbackTo[js.Promise[String]]
    ): Body = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], buffer = buffer.toJsFn, formData = formData.toJsFn, json = json.toJsFn, text = text.toJsFn)
      __obj.asInstanceOf[Body]
    }
    
    extension [Self <: Body](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[Blob]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: CallbackTo[js.Promise[Buffer]]): Self = StObject.set(x, "buffer", value.toJsFn)
      
      inline def setFormData(value: CallbackTo[js.Promise[FormData]]): Self = StObject.set(x, "formData", value.toJsFn)
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  type BodyInit = Stream | String | Blob | Buffer | Null
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  type RequestInfo = Request | String
  
  trait RequestInit extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var body: js.UndefOr[BodyInit] = js.undefined
    
    ////////////////////////////////////////////////////////////////////////////
    // The following properties are electron-fetch extensions
    // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    // These properties are part of the Fetch Standard
    var method: js.UndefOr[String] = js.undefined
    
    // When running on Electron behind an authenticated HTTP proxy, password to use to authenticate
    var password: js.UndefOr[String] = js.undefined
    
    // (/!\ only works when running on Node.js) set to `manual` to extract redirect headers, `error` to reject redirect
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var session: js.UndefOr[Session_] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    // maximum response body size in bytes. 0 to disable
    var size: js.UndefOr[Double] = js.undefined
    
    // req/res timeout in ms, it resets on redirect. 0 to disable (OS limit applies)
    var timeout: js.UndefOr[Double] = js.undefined
    
    var useElectronNet: js.UndefOr[Boolean] = js.undefined
    
    var useSessionCookies: js.UndefOr[Boolean] = js.undefined
    
    // When running on Electron behind an authenticated HTTP proxy, username to use to authenticate
    var user: js.UndefOr[String] = js.undefined
  }
  object RequestInit {
    
    inline def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUseElectronNet(value: Boolean): Self = StObject.set(x, "useElectronNet", value.asInstanceOf[js.Any])
      
      inline def setUseElectronNetUndefined: Self = StObject.set(x, "useElectronNet", js.undefined)
      
      inline def setUseSessionCookies(value: Boolean): Self = StObject.set(x, "useSessionCookies", value.asInstanceOf[js.Any])
      
      inline def setUseSessionCookiesUndefined: Self = StObject.set(x, "useSessionCookies", js.undefined)
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
}
