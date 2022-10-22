package typingsJapgolly.typedRestClient

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.RequestOptions
import typingsJapgolly.node.urlMod.Url
import typingsJapgolly.typedRestClient.interfacesMod.IHeaders
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClient
import typingsJapgolly.typedRestClient.interfacesMod.IHttpClientResponse
import typingsJapgolly.typedRestClient.interfacesMod.IRequestHandler
import typingsJapgolly.typedRestClient.interfacesMod.IRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClientMod {
  
  @JSImport("typed-rest-client/HttpClient", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typed-rest-client/HttpClient", "HttpClient")
  @js.native
  open class HttpClient ()
    extends StObject
       with IHttpClient {
    def this(userAgent: String) = this()
    def this(userAgent: String, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Null, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: Unit, handlers: js.Array[IRequestHandler]) = this()
    def this(userAgent: String, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
    def this(userAgent: String, handlers: Unit, requestOptions: IRequestOptions) = this()
    def this(userAgent: Null, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
    def this(userAgent: Null, handlers: Unit, requestOptions: IRequestOptions) = this()
    def this(userAgent: Unit, handlers: js.Array[IRequestHandler], requestOptions: IRequestOptions) = this()
    def this(userAgent: Unit, handlers: Unit, requestOptions: IRequestOptions) = this()
    
    /* private */ var _agent: Any = js.native
    
    /* private */ var _allowRedirectDowngrade: Any = js.native
    
    /* private */ var _allowRedirects: Any = js.native
    
    /* private */ var _allowRetries: Any = js.native
    
    /* private */ var _ca: Any = js.native
    
    /* private */ var _cert: Any = js.native
    
    /* private */ var _certConfig: Any = js.native
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _getAgent: Any = js.native
    
    /* private */ var _getProxy: Any = js.native
    
    /* private */ var _httpProxy: Any = js.native
    
    /* private */ var _httpProxyBypassHosts: Any = js.native
    
    /* private */ var _ignoreSslError: Any = js.native
    
    /* private */ var _isMatchInBypassProxyList: Any = js.native
    
    /* private */ var _isPresigned: Any = js.native
    
    /* private */ var _keepAlive: Any = js.native
    
    /* private */ var _key: Any = js.native
    
    /* private */ var _maxRedirects: Any = js.native
    
    /* private */ var _maxRetries: Any = js.native
    
    /* private */ var _mergeHeaders: Any = js.native
    
    /* private */ var _performExponentialBackoff: Any = js.native
    
    /* private */ var _prepareRequest: Any = js.native
    
    /* private */ var _proxyAgent: Any = js.native
    
    /* private */ var _socketTimeout: Any = js.native
    
    /**
      * Needs to be called if keepAlive is set to true in request options.
      */
    def dispose(): Unit = js.native
    
    var handlers: js.Array[IRequestHandler] = js.native
    
    def head(requestUrl: String): js.Promise[IHttpClientResponse] = js.native
    def head(requestUrl: String, additionalHeaders: IHeaders): js.Promise[IHttpClientResponse] = js.native
    
    var requestOptions: IRequestOptions = js.native
    
    var userAgent: js.UndefOr[String | Null] = js.native
  }
  
  @JSImport("typed-rest-client/HttpClient", "HttpClientResponse")
  @js.native
  open class HttpClientResponse protected ()
    extends StObject
       with IHttpClientResponse {
    def this(message: IncomingMessage) = this()
    
    /* CompleteClass */
    var message: IncomingMessage = js.native
    
    /* CompleteClass */
    override def readBody(): js.Promise[String] = js.native
  }
  
  @js.native
  sealed trait HttpCodes extends StObject
  @JSImport("typed-rest-client/HttpClient", "HttpCodes")
  @js.native
  object HttpCodes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpCodes & Double] = js.native
    
    @js.native
    sealed trait BadGateway
      extends StObject
         with HttpCodes
    /* 502 */ val BadGateway: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.BadGateway & Double = js.native
    
    @js.native
    sealed trait BadRequest
      extends StObject
         with HttpCodes
    /* 400 */ val BadRequest: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.BadRequest & Double = js.native
    
    @js.native
    sealed trait Conflict
      extends StObject
         with HttpCodes
    /* 409 */ val Conflict: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.Conflict & Double = js.native
    
    @js.native
    sealed trait Forbidden
      extends StObject
         with HttpCodes
    /* 403 */ val Forbidden: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.Forbidden & Double = js.native
    
    @js.native
    sealed trait GatewayTimeout
      extends StObject
         with HttpCodes
    /* 504 */ val GatewayTimeout: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.GatewayTimeout & Double = js.native
    
    @js.native
    sealed trait Gone
      extends StObject
         with HttpCodes
    /* 410 */ val Gone: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.Gone & Double = js.native
    
    @js.native
    sealed trait InternalServerError
      extends StObject
         with HttpCodes
    /* 500 */ val InternalServerError: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.InternalServerError & Double = js.native
    
    @js.native
    sealed trait MethodNotAllowed
      extends StObject
         with HttpCodes
    /* 405 */ val MethodNotAllowed: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.MethodNotAllowed & Double = js.native
    
    @js.native
    sealed trait MovedPermanently
      extends StObject
         with HttpCodes
    /* 301 */ val MovedPermanently: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.MovedPermanently & Double = js.native
    
    @js.native
    sealed trait MultipleChoices
      extends StObject
         with HttpCodes
    /* 300 */ val MultipleChoices: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.MultipleChoices & Double = js.native
    
    @js.native
    sealed trait NotAcceptable
      extends StObject
         with HttpCodes
    /* 406 */ val NotAcceptable: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.NotAcceptable & Double = js.native
    
    @js.native
    sealed trait NotFound
      extends StObject
         with HttpCodes
    /* 404 */ val NotFound: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.NotFound & Double = js.native
    
    @js.native
    sealed trait NotImplemented
      extends StObject
         with HttpCodes
    /* 501 */ val NotImplemented: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.NotImplemented & Double = js.native
    
    @js.native
    sealed trait NotModified
      extends StObject
         with HttpCodes
    /* 304 */ val NotModified: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.NotModified & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with HttpCodes
    /* 200 */ val OK: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.OK & Double = js.native
    
    @js.native
    sealed trait PaymentRequired
      extends StObject
         with HttpCodes
    /* 402 */ val PaymentRequired: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.PaymentRequired & Double = js.native
    
    @js.native
    sealed trait PermanentRedirect
      extends StObject
         with HttpCodes
    /* 308 */ val PermanentRedirect: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.PermanentRedirect & Double = js.native
    
    @js.native
    sealed trait ProxyAuthenticationRequired
      extends StObject
         with HttpCodes
    /* 407 */ val ProxyAuthenticationRequired: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.ProxyAuthenticationRequired & Double = js.native
    
    @js.native
    sealed trait RequestTimeout
      extends StObject
         with HttpCodes
    /* 408 */ val RequestTimeout: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.RequestTimeout & Double = js.native
    
    @js.native
    sealed trait ResourceMoved
      extends StObject
         with HttpCodes
    /* 302 */ val ResourceMoved: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.ResourceMoved & Double = js.native
    
    @js.native
    sealed trait SeeOther
      extends StObject
         with HttpCodes
    /* 303 */ val SeeOther: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.SeeOther & Double = js.native
    
    @js.native
    sealed trait ServiceUnavailable
      extends StObject
         with HttpCodes
    /* 503 */ val ServiceUnavailable: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.ServiceUnavailable & Double = js.native
    
    @js.native
    sealed trait SwitchProxy
      extends StObject
         with HttpCodes
    /* 306 */ val SwitchProxy: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.SwitchProxy & Double = js.native
    
    @js.native
    sealed trait TemporaryRedirect
      extends StObject
         with HttpCodes
    /* 307 */ val TemporaryRedirect: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.TemporaryRedirect & Double = js.native
    
    @js.native
    sealed trait TooManyRequests
      extends StObject
         with HttpCodes
    /* 429 */ val TooManyRequests: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.TooManyRequests & Double = js.native
    
    @js.native
    sealed trait Unauthorized
      extends StObject
         with HttpCodes
    /* 401 */ val Unauthorized: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.Unauthorized & Double = js.native
    
    @js.native
    sealed trait UseProxy
      extends StObject
         with HttpCodes
    /* 305 */ val UseProxy: typingsJapgolly.typedRestClient.httpClientMod.HttpCodes.UseProxy & Double = js.native
  }
  
  inline def isHttps(requestUrl: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHttps")(requestUrl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait RequestInfo extends StObject {
    
    var httpModule: Any
    
    var options: RequestOptions
    
    var parsedUrl: Url
  }
  object RequestInfo {
    
    inline def apply(httpModule: Any, options: RequestOptions, parsedUrl: Url): RequestInfo = {
      val __obj = js.Dynamic.literal(httpModule = httpModule.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parsedUrl = parsedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInfo]
    }
    
    extension [Self <: RequestInfo](x: Self) {
      
      inline def setHttpModule(value: Any): Self = StObject.set(x, "httpModule", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: RequestOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParsedUrl(value: Url): Self = StObject.set(x, "parsedUrl", value.asInstanceOf[js.Any])
    }
  }
}
