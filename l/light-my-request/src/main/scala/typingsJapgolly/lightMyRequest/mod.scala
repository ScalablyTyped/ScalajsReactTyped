package typingsJapgolly.lightMyRequest

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.lightMyRequest.anon.Close
import typingsJapgolly.lightMyRequest.anon.Hostname
import typingsJapgolly.lightMyRequest.anon.Req
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.delete_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.get_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.head_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.options_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.patch_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.post_
import typingsJapgolly.lightMyRequest.lightMyRequestStrings.put_
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestListener
import typingsJapgolly.node.httpMod.Server
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.nodeColonnetMod.Socket
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("light-my-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def inject(dispatchFunc: DispatchFunc): Chain = ^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any]).asInstanceOf[Chain]
  inline def inject(dispatchFunc: DispatchFunc, options: String): Chain = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chain]
  inline def inject(dispatchFunc: DispatchFunc, options: String, callback: CallbackFunc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def inject(dispatchFunc: DispatchFunc, options: InjectOptions): Chain = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Chain]
  inline def inject(dispatchFunc: DispatchFunc, options: InjectOptions, callback: CallbackFunc): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("inject")(dispatchFunc.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isInjection(obj: IncomingMessage): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isInjection(obj: ServerResponse[IncomingMessage]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInjection")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AbortSignal extends StObject {
    
    val aborted: Boolean
  }
  object AbortSignal {
    
    inline def apply(aborted: Boolean): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    }
  }
  
  type CallbackFunc = js.Function2[/* err */ js.Error, /* response */ Response, Unit]
  
  @js.native
  trait Chain
    extends StObject
       with Promise[Response] {
    
    def body(body: InjectPayload): Chain = js.native
    
    def cookies(query: js.Object): Chain = js.native
    
    def delete(url: String): Chain = js.native
    
    def end(): js.Promise[Response] = js.native
    def end(callback: CallbackFunc): Unit = js.native
    
    def get(url: String): Chain = js.native
    
    def head(url: String): Chain = js.native
    
    def headers(headers: IncomingHttpHeaders): Chain = js.native
    def headers(headers: OutgoingHttpHeaders): Chain = js.native
    
    def options(url: String): Chain = js.native
    
    def patch(url: String): Chain = js.native
    
    def payload(payload: InjectPayload): Chain = js.native
    
    def post(url: String): Chain = js.native
    
    def put(url: String): Chain = js.native
    
    def query(query: String): Chain = js.native
    def query(query: StringDictionary[String | js.Array[String]]): Chain = js.native
    
    def trace(url: String): Chain = js.native
  }
  
  type DispatchFunc = RequestListener[
    Instantiable1[/* socket */ Socket, IncomingMessage], 
    Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
      ServerResponse[IncomingMessage]
    ]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.DELETE
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.delete_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.GET
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.get_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.HEAD
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.head_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.PATCH
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.patch_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.POST
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.post_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.PUT
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.put_
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.OPTIONS
    - typingsJapgolly.lightMyRequest.lightMyRequestStrings.options_
  */
  trait HTTPMethods extends StObject
  object HTTPMethods {
    
    inline def DELETE: typingsJapgolly.lightMyRequest.lightMyRequestStrings.DELETE = "DELETE".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.DELETE]
    
    inline def GET: typingsJapgolly.lightMyRequest.lightMyRequestStrings.GET = "GET".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.GET]
    
    inline def HEAD: typingsJapgolly.lightMyRequest.lightMyRequestStrings.HEAD = "HEAD".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.HEAD]
    
    inline def OPTIONS: typingsJapgolly.lightMyRequest.lightMyRequestStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.OPTIONS]
    
    inline def PATCH: typingsJapgolly.lightMyRequest.lightMyRequestStrings.PATCH = "PATCH".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.PATCH]
    
    inline def POST: typingsJapgolly.lightMyRequest.lightMyRequestStrings.POST = "POST".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.POST]
    
    inline def PUT: typingsJapgolly.lightMyRequest.lightMyRequestStrings.PUT = "PUT".asInstanceOf[typingsJapgolly.lightMyRequest.lightMyRequestStrings.PUT]
    
    inline def delete: delete_ = "delete".asInstanceOf[delete_]
    
    inline def get: get_ = "get".asInstanceOf[get_]
    
    inline def head: head_ = "head".asInstanceOf[head_]
    
    inline def options: options_ = "options".asInstanceOf[options_]
    
    inline def patch: patch_ = "patch".asInstanceOf[patch_]
    
    inline def post: post_ = "post".asInstanceOf[post_]
    
    inline def put: put_ = "put".asInstanceOf[put_]
  }
  
  trait InjectOptions extends StObject {
    
    var Request: js.UndefOr[js.Object] = js.undefined
    
    var authority: js.UndefOr[String] = js.undefined
    
    var cookies: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var headers: js.UndefOr[IncomingHttpHeaders | OutgoingHttpHeaders] = js.undefined
    
    var method: js.UndefOr[HTTPMethods] = js.undefined
    
    var path: js.UndefOr[String | Hostname] = js.undefined
    
    var payload: js.UndefOr[InjectPayload] = js.undefined
    
    var query: js.UndefOr[String | (StringDictionary[String | js.Array[String]])] = js.undefined
    
    var remoteAddress: js.UndefOr[String] = js.undefined
    
    var server: js.UndefOr[
        Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
      ] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var simulate: js.UndefOr[Close] = js.undefined
    
    var url: js.UndefOr[String | Hostname] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
  }
  object InjectOptions {
    
    inline def apply(): InjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InjectOptions]
    }
    
    extension [Self <: InjectOptions](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setCookies(value: StringDictionary[String]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setHeaders(value: IncomingHttpHeaders | OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setPath(value: String | Hostname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPayload(value: InjectPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setQuery(value: String | (StringDictionary[String | js.Array[String]])): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddressUndefined: Self = StObject.set(x, "remoteAddress", js.undefined)
      
      inline def setRequest(value: js.Object): Self = StObject.set(x, "Request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "Request", js.undefined)
      
      inline def setServer(
        value: Server[
              Instantiable1[/* socket */ Socket, IncomingMessage], 
              Instantiable1[
                /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
                ServerResponse[IncomingMessage]
              ]
            ]
      ): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSimulate(value: Close): Self = StObject.set(x, "simulate", value.asInstanceOf[js.Any])
      
      inline def setSimulateUndefined: Self = StObject.set(x, "simulate", js.undefined)
      
      inline def setUrl(value: String | Hostname): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    }
  }
  
  type InjectPayload = String | js.Object | Buffer | ReadableStream
  
  trait Response extends StObject {
    
    var body: String
    
    var cookies: js.Array[js.Object]
    
    var headers: OutgoingHttpHeaders
    
    def json[T](): T
    
    var payload: String
    
    var raw: Req
    
    var rawPayload: Buffer
    
    var statusCode: Double
    
    var statusMessage: String
    
    var trailers: StringDictionary[String]
  }
  object Response {
    
    inline def apply(
      body: String,
      cookies: js.Array[js.Object],
      headers: OutgoingHttpHeaders,
      json: CallbackTo[Any],
      payload: String,
      raw: Req,
      rawPayload: Buffer,
      statusCode: Double,
      statusMessage: String,
      trailers: StringDictionary[String]
    ): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.toJsFn, payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCookies(value: js.Array[js.Object]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesVarargs(value: js.Object*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[Any]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Req): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawPayload(value: Buffer): Self = StObject.set(x, "rawPayload", value.asInstanceOf[js.Any])
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setTrailers(value: StringDictionary[String]): Self = StObject.set(x, "trailers", value.asInstanceOf[js.Any])
    }
  }
}
