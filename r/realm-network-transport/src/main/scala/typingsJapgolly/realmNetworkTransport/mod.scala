package typingsJapgolly.realmNetworkTransport

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** A controller object that allows you to abort one or more DOM requests as and when desired. */
  @js.native
  trait AbortController
    extends StObject
       with /**
    * Constructs an AbortController.
    */
  Instantiable0[AbortController] {
    
    /**
      * Invoking this method will set this object's AbortSignal's aborted flag and signal to any observers that the associated activity is to be aborted.
      */
    def abort(): Unit = js.native
    
    /**
      * Returns the AbortSignal object associated with this object.
      */
    val signal: AbortSignal = js.native
  }
  
  type AbortSignal = Any
  
  trait CallbackResponse extends StObject {
    
    var body: String
    
    var headers: Headers
    
    var statusCode: Double
  }
  object CallbackResponse {
    
    inline def apply(body: String, headers: Headers, statusCode: Double): CallbackResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackResponse]
    }
    
    extension [Self <: CallbackResponse](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultNetworkTransport
    extends StObject
       with NetworkTransport {
    
    /* private */ var createTimeoutSignal: Any
  }
  object DefaultNetworkTransport {
    
    inline def apply(
      createTimeoutSignal: Any,
      fetch: Request[Any] => js.Promise[FetchResponse],
      fetchWithCallbacks: (Request[Any], ResponseHandler) => Callback
    ): DefaultNetworkTransport = {
      val __obj = js.Dynamic.literal(createTimeoutSignal = createTimeoutSignal.asInstanceOf[js.Any], fetch = js.Any.fromFunction1(fetch), fetchWithCallbacks = js.Any.fromFunction2((t0: Request[Any], t1: ResponseHandler) => (fetchWithCallbacks(t0, t1)).runNow()))
      __obj.asInstanceOf[DefaultNetworkTransport]
    }
    
    extension [Self <: DefaultNetworkTransport](x: Self) {
      
      inline def setCreateTimeoutSignal(value: Any): Self = StObject.set(x, "createTimeoutSignal", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function1[/* err */ js.Error, Unit]
  
  type Fetch = js.Function2[
    /* input */ FetchRequestInfo, 
    /* init */ js.UndefOr[FetchRequestInit[Any]], 
    js.Promise[FetchResponse]
  ]
  
  trait FetchBody extends StObject {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer]
    
    def blob(): js.Promise[Any]
    
    val body: FetchReadableStream | Null
    
    val bodyUsed: Boolean
    
    def json[ResponseBody](): js.Promise[ResponseBody]
    
    def text(): js.Promise[String]
  }
  object FetchBody {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Any]],
      bodyUsed: Boolean,
      json: CallbackTo[js.Promise[Any]],
      text: CallbackTo[js.Promise[String]]
    ): FetchBody = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], json = json.toJsFn, text = text.toJsFn, body = null)
      __obj.asInstanceOf[FetchBody]
    }
    
    extension [Self <: FetchBody](x: Self) {
      
      inline def setArrayBuffer(value: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]]): Self = StObject.set(x, "arrayBuffer", value.toJsFn)
      
      inline def setBlob(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setBody(value: FetchReadableStream): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUsed(value: Boolean): Self = StObject.set(x, "bodyUsed", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setText(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  trait FetchHeaders extends StObject {
    
    def append(name: String, value: String): Unit
    
    def delete(name: String): Unit
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit
    
    def get(name: String): String | Null
    
    def has(name: String): Boolean
    
    def set(name: String, value: String): Unit
  }
  object FetchHeaders {
    
    inline def apply(
      append: (String, String) => Callback,
      delete: String => Callback,
      forEach: js.Function2[/* value */ String, /* name */ String, Unit] => Callback,
      get: String => String | Null,
      has: String => Boolean,
      set: (String, String) => Callback
    ): FetchHeaders = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2((t0: String, t1: String) => (append(t0, t1)).runNow()), delete = js.Any.fromFunction1((t0: String) => delete(t0).runNow()), forEach = js.Any.fromFunction1((t0: js.Function2[/* value */ String, /* name */ String, Unit]) => forEach(t0).runNow()), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2((t0: String, t1: String) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[FetchHeaders]
    }
    
    extension [Self <: FetchHeaders](x: Self) {
      
      inline def setAppend(value: (String, String) => Callback): Self = StObject.set(x, "append", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setDelete(value: String => Callback): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setForEach(value: js.Function2[/* value */ String, /* name */ String, Unit] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function2[/* value */ String, /* name */ String, Unit]) => value(t0).runNow()))
      
      inline def setGet(value: String => String | Null): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => Callback): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  type FetchHeadersInit = FetchHeaders | js.Array[js.Array[String]] | (Record[String, String])
  
  type FetchReadableStream = Any
  
  /** This Fetch API interface represents a resource request. */
  trait FetchRequest
    extends StObject
       with FetchBody {
    
    /**
      * Returns a Headers object consisting of the headers associated with request. Note that headers added in the network layer by the user agent will not be accounted for in this object, e.g., the "Host" header.
      */
    val headers: FetchHeaders
    
    /**
      * Returns a boolean indicating whether or not request can outlive the global in which it was created.
      */
    val keepalive: Boolean
    
    /**
      * Returns request's HTTP method, which is "GET" by default.
      */
    val method: String
    
    /**
      * Returns the signal associated with request, which is an AbortSignal object indicating whether or not request has been aborted, and its abort event handler.
      */
    val signal: AbortSignal
    
    /**
      * Returns the URL of request as a string.
      */
    val url: String
  }
  object FetchRequest {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Any]],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: CallbackTo[js.Promise[Any]],
      keepalive: Boolean,
      method: String,
      signal: AbortSignal,
      text: CallbackTo[js.Promise[String]],
      url: String
    ): FetchRequest = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, keepalive = keepalive.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.asInstanceOf[FetchRequest]
    }
    
    extension [Self <: FetchRequest](x: Self) {
      
      inline def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.include
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.omit
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`
  */
  trait FetchRequestCredentials extends StObject
  object FetchRequestCredentials {
    
    inline def include: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.include = "include".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.include]
    
    inline def omit: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.omit = "omit".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.omit]
    
    inline def `same-origin`: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`]
  }
  
  type FetchRequestInfo = FetchRequest | String
  
  trait FetchRequestInit[RequestBody] extends StObject {
    
    /**
      * A BodyInit object or null to set request's body.
      */
    var body: js.UndefOr[RequestBody] = js.undefined
    
    /**
      * A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials.
      */
    var credentials: js.UndefOr[FetchRequestCredentials] = js.undefined
    
    /**
      * A Headers object, an object literal, or an array of two-item arrays to set request's headers.
      */
    var headers: js.UndefOr[FetchHeadersInit] = js.undefined
    
    /**
      * A cryptographic hash of the resource to be fetched by request. Sets request's integrity.
      */
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      * A boolean to set request's keepalive.
      */
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string to set request's method.
      */
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode.
      */
    var mode: js.UndefOr[FetchRequestMode] = js.undefined
    
    /**
      * An AbortSignal to set request's signal.
      */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
  }
  object FetchRequestInit {
    
    inline def apply[RequestBody](): FetchRequestInit[RequestBody] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchRequestInit[RequestBody]]
    }
    
    extension [Self <: FetchRequestInit[?], RequestBody](x: Self & FetchRequestInit[RequestBody]) {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCredentials(value: FetchRequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: FetchHeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: FetchRequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.cors
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.navigate
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`no-cors`
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`
  */
  trait FetchRequestMode extends StObject
  object FetchRequestMode {
    
    inline def cors: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.cors = "cors".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.cors]
    
    inline def navigate: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.navigate = "navigate".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.navigate]
    
    inline def `no-cors`: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`no-cors` = "no-cors".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`no-cors`]
    
    inline def `same-origin`: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.`same-origin`]
  }
  
  trait FetchResponse
    extends StObject
       with FetchBody {
    
    val headers: FetchHeaders
    
    val ok: Boolean
    
    val redirected: Boolean
    
    val status: Double
    
    val statusText: String
    
    val `type`: Any
    
    val url: String
  }
  object FetchResponse {
    
    inline def apply(
      arrayBuffer: CallbackTo[js.Promise[js.typedarray.ArrayBuffer]],
      blob: CallbackTo[js.Promise[Any]],
      bodyUsed: Boolean,
      headers: FetchHeaders,
      json: CallbackTo[js.Promise[Any]],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusText: String,
      text: CallbackTo[js.Promise[String]],
      `type`: Any,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = arrayBuffer.toJsFn, blob = blob.toJsFn, bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = text.toJsFn, url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    extension [Self <: FetchResponse](x: Self) {
      
      inline def setHeaders(value: FetchHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRedirected(value: Boolean): Self = StObject.set(x, "redirected", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.GET
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.POST
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.DELETE
    - typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.PUT
  */
  trait Method extends StObject
  object Method {
    
    inline def DELETE: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.DELETE]
    
    inline def GET: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.GET = "GET".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.GET]
    
    inline def POST: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.POST = "POST".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.POST]
    
    inline def PUT: typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.realmNetworkTransport.realmNetworkTransportStrings.PUT]
  }
  
  trait NetworkTransport extends StObject {
    
    def fetch[RequestBody](request: Request[RequestBody]): js.Promise[FetchResponse]
    
    def fetchWithCallbacks[RequestBody](request: Request[RequestBody], handler: ResponseHandler): Unit
  }
  object NetworkTransport {
    
    inline def apply(
      fetch: Request[Any] => js.Promise[FetchResponse],
      fetchWithCallbacks: (Request[Any], ResponseHandler) => Callback
    ): NetworkTransport = {
      val __obj = js.Dynamic.literal(fetch = js.Any.fromFunction1(fetch), fetchWithCallbacks = js.Any.fromFunction2((t0: Request[Any], t1: ResponseHandler) => (fetchWithCallbacks(t0, t1)).runNow()))
      __obj.asInstanceOf[NetworkTransport]
    }
    
    extension [Self <: NetworkTransport](x: Self) {
      
      inline def setFetch(value: Request[Any] => js.Promise[FetchResponse]): Self = StObject.set(x, "fetch", js.Any.fromFunction1(value))
      
      inline def setFetchWithCallbacks(value: (Request[Any], ResponseHandler) => Callback): Self = StObject.set(x, "fetchWithCallbacks", js.Any.fromFunction2((t0: Request[Any], t1: ResponseHandler) => (value(t0, t1)).runNow()))
    }
  }
  
  trait Request[RequestBody]
    extends StObject
       with FetchRequestInit[RequestBody] {
    
    @JSName("method")
    var method_Request: Method
    
    var timeoutMs: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object Request {
    
    inline def apply[RequestBody](method: Method, url: String): Request[RequestBody] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request[RequestBody]]
    }
    
    extension [Self <: Request[?], RequestBody](x: Self & Request[RequestBody]) {
      
      inline def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponseHandler extends StObject {
    
    def onError(err: js.Error): Unit
    @JSName("onError")
    var onError_Original: ErrorCallback
    
    def onSuccess(response: CallbackResponse): Unit
    @JSName("onSuccess")
    var onSuccess_Original: SuccessCallback
  }
  object ResponseHandler {
    
    inline def apply(onError: /* err */ js.Error => Callback, onSuccess: /* response */ CallbackResponse => Callback): ResponseHandler = {
      val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1((t0: /* err */ js.Error) => onError(t0).runNow()), onSuccess = js.Any.fromFunction1((t0: /* response */ CallbackResponse) => onSuccess(t0).runNow()))
      __obj.asInstanceOf[ResponseHandler]
    }
    
    extension [Self <: ResponseHandler](x: Self) {
      
      inline def setOnError(value: /* err */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setOnSuccess(value: /* response */ CallbackResponse => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: /* response */ CallbackResponse) => value(t0).runNow()))
    }
  }
  
  type SuccessCallback = js.Function1[/* response */ CallbackResponse, Unit]
}
