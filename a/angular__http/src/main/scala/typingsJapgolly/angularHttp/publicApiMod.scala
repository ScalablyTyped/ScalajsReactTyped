package typingsJapgolly.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCore.mod.Version
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publicApiMod {
  
  @JSImport("@angular/http/public_api", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions ()
    extends typingsJapgolly.angularHttp.srcMod.BaseRequestOptions
  
  @JSImport("@angular/http/public_api", "BaseResponseOptions")
  @js.native
  open class BaseResponseOptions ()
    extends typingsJapgolly.angularHttp.srcMod.BaseResponseOptions
  
  @JSImport("@angular/http/public_api", "BrowserXhr")
  @js.native
  open class BrowserXhr ()
    extends typingsJapgolly.angularHttp.srcMod.BrowserXhr
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "Connection")
  @js.native
  open class Connection ()
    extends typingsJapgolly.angularHttp.srcMod.Connection
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "ConnectionBackend")
  @js.native
  open class ConnectionBackend ()
    extends typingsJapgolly.angularHttp.srcMod.ConnectionBackend
  
  @JSImport("@angular/http/public_api", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy ()
    extends typingsJapgolly.angularHttp.srcMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/public_api", "Headers")
  @js.native
  open class Headers ()
    extends typingsJapgolly.angularHttp.srcMod.Headers {
    def this(headers: StringDictionary[Any]) = this()
    def this(headers: typingsJapgolly.angularHttp.srcHeadersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/public_api", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    inline def fromResponseHeaderString(headersString: String): typingsJapgolly.angularHttp.srcHeadersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularHttp.srcHeadersMod.Headers]
  }
  
  @JSImport("@angular/http/public_api", "Http")
  @js.native
  open class Http protected ()
    extends typingsJapgolly.angularHttp.srcMod.Http {
    def this(
      _backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      _defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "HttpModule")
  @js.native
  open class HttpModule ()
    extends typingsJapgolly.angularHttp.srcMod.HttpModule
  
  @JSImport("@angular/http/public_api", "JSONPBackend")
  @js.native
  open class JSONPBackend ()
    extends typingsJapgolly.angularHttp.srcMod.JSONPBackend
  
  @JSImport("@angular/http/public_api", "JSONPConnection")
  @js.native
  open class JSONPConnection ()
    extends typingsJapgolly.angularHttp.srcMod.JSONPConnection
  
  @JSImport("@angular/http/public_api", "Jsonp")
  @js.native
  open class Jsonp protected ()
    extends typingsJapgolly.angularHttp.srcMod.Jsonp {
    def this(
      backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "JsonpModule")
  @js.native
  open class JsonpModule ()
    extends typingsJapgolly.angularHttp.srcMod.JsonpModule
  
  @JSImport("@angular/http/public_api", "QueryEncoder")
  @js.native
  open class QueryEncoder ()
    extends typingsJapgolly.angularHttp.srcMod.QueryEncoder
  
  @JSImport("@angular/http/public_api", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.ReadyState & Double] = js.native
    
    /* 5 */ val Cancelled: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.Cancelled & Double = js.native
    
    /* 4 */ val Done: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.Done & Double = js.native
    
    /* 2 */ val HeadersReceived: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.HeadersReceived & Double = js.native
    
    /* 3 */ val Loading: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.Loading & Double = js.native
    
    /* 1 */ val Open: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.Open & Double = js.native
    
    /* 0 */ val Unsent: typingsJapgolly.angularHttp.srcEnumsMod.ReadyState.Unsent & Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "Request")
  @js.native
  open class Request protected ()
    extends typingsJapgolly.angularHttp.srcMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "RequestMethod")
  @js.native
  object RequestMethod extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod & Double] = js.native
    
    /* 3 */ val Delete: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Delete & Double = js.native
    
    /* 0 */ val Get: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Get & Double = js.native
    
    /* 5 */ val Head: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Head & Double = js.native
    
    /* 4 */ val Options: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Options & Double = js.native
    
    /* 6 */ val Patch: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Patch & Double = js.native
    
    /* 1 */ val Post: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Post & Double = js.native
    
    /* 2 */ val Put: typingsJapgolly.angularHttp.srcEnumsMod.RequestMethod.Put & Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "RequestOptions")
  @js.native
  open class RequestOptions ()
    extends typingsJapgolly.angularHttp.srcMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "Response")
  @js.native
  open class Response protected ()
    extends typingsJapgolly.angularHttp.srcMod.Response {
    def this(responseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "ResponseOptions")
  @js.native
  open class ResponseOptions ()
    extends typingsJapgolly.angularHttp.srcMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/public_api", "ResponseType")
  @js.native
  object ResponseType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.ResponseType & Double] = js.native
    
    /* 0 */ val Basic: typingsJapgolly.angularHttp.srcEnumsMod.ResponseType.Basic & Double = js.native
    
    /* 1 */ val Cors: typingsJapgolly.angularHttp.srcEnumsMod.ResponseType.Cors & Double = js.native
    
    /* 2 */ val Default: typingsJapgolly.angularHttp.srcEnumsMod.ResponseType.Default & Double = js.native
    
    /* 3 */ val Error: typingsJapgolly.angularHttp.srcEnumsMod.ResponseType.Error & Double = js.native
    
    /* 4 */ val Opaque: typingsJapgolly.angularHttp.srcEnumsMod.ResponseType.Opaque & Double = js.native
  }
  
  @JSImport("@angular/http/public_api", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typingsJapgolly.angularHttp.srcMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/public_api", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/public_api", "XHRBackend")
  @js.native
  open class XHRBackend protected ()
    extends typingsJapgolly.angularHttp.srcMod.XHRBackend {
    def this(
      _browserXHR: typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsJapgolly.angularHttp.srcInterfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/public_api", "XHRConnection")
  @js.native
  open class XHRConnection protected ()
    extends typingsJapgolly.angularHttp.srcMod.XHRConnection {
    def this(
      req: typingsJapgolly.angularHttp.srcStaticRequestMod.Request,
      browserXHR: typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr
    ) = this()
    def this(
      req: typingsJapgolly.angularHttp.srcStaticRequestMod.Request,
      browserXHR: typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      baseResponseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("@angular/http/public_api", "XSRFStrategy")
  @js.native
  open class XSRFStrategy ()
    extends typingsJapgolly.angularHttp.srcMod.XSRFStrategy
}
