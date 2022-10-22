package typingsJapgolly.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCore.mod.Version
import typingsJapgolly.angularHttp.srcBackendsBrowserJsonpMod.BrowserJsonp
import typingsJapgolly.angularHttp.srcBodyMod.Body
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/http", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions ()
    extends typingsJapgolly.angularHttp.publicApiMod.BaseRequestOptions
  
  @JSImport("@angular/http", "BaseResponseOptions")
  @js.native
  open class BaseResponseOptions ()
    extends typingsJapgolly.angularHttp.publicApiMod.BaseResponseOptions
  
  @JSImport("@angular/http", "BrowserXhr")
  @js.native
  open class BrowserXhr ()
    extends typingsJapgolly.angularHttp.publicApiMod.BrowserXhr
  
  /* note: abstract class */ @JSImport("@angular/http", "Connection")
  @js.native
  open class Connection ()
    extends typingsJapgolly.angularHttp.publicApiMod.Connection
  
  /* note: abstract class */ @JSImport("@angular/http", "ConnectionBackend")
  @js.native
  open class ConnectionBackend ()
    extends typingsJapgolly.angularHttp.publicApiMod.ConnectionBackend
  
  @JSImport("@angular/http", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy ()
    extends typingsJapgolly.angularHttp.publicApiMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http", "Headers")
  @js.native
  open class Headers ()
    extends typingsJapgolly.angularHttp.publicApiMod.Headers {
    def this(headers: StringDictionary[Any]) = this()
    def this(headers: typingsJapgolly.angularHttp.srcHeadersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    inline def fromResponseHeaderString(headersString: String): typingsJapgolly.angularHttp.srcHeadersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularHttp.srcHeadersMod.Headers]
  }
  
  @JSImport("@angular/http", "Http")
  @js.native
  open class Http protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.Http {
    def this(
      _backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      _defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "HttpModule")
  @js.native
  open class HttpModule ()
    extends typingsJapgolly.angularHttp.publicApiMod.HttpModule
  
  @JSImport("@angular/http", "JSONPBackend")
  @js.native
  open class JSONPBackend ()
    extends typingsJapgolly.angularHttp.publicApiMod.JSONPBackend
  
  @JSImport("@angular/http", "JSONPConnection")
  @js.native
  open class JSONPConnection ()
    extends typingsJapgolly.angularHttp.publicApiMod.JSONPConnection
  
  @JSImport("@angular/http", "Jsonp")
  @js.native
  open class Jsonp protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.Jsonp {
    def this(
      backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http", "JsonpModule")
  @js.native
  open class JsonpModule ()
    extends typingsJapgolly.angularHttp.publicApiMod.JsonpModule
  
  @JSImport("@angular/http", "QueryEncoder")
  @js.native
  open class QueryEncoder ()
    extends typingsJapgolly.angularHttp.publicApiMod.QueryEncoder
  
  @JSImport("@angular/http", "ReadyState")
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
  
  @JSImport("@angular/http", "Request")
  @js.native
  open class Request protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http", "RequestMethod")
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
  
  @JSImport("@angular/http", "RequestOptions")
  @js.native
  open class RequestOptions ()
    extends typingsJapgolly.angularHttp.publicApiMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "Response")
  @js.native
  open class Response protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.Response {
    def this(responseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http", "ResponseOptions")
  @js.native
  open class ResponseOptions ()
    extends typingsJapgolly.angularHttp.publicApiMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http", "ResponseType")
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
  
  @JSImport("@angular/http", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typingsJapgolly.angularHttp.publicApiMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http", "XHRBackend")
  @js.native
  open class XHRBackend protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.XHRBackend {
    def this(
      _browserXHR: typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsJapgolly.angularHttp.srcInterfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http", "XHRConnection")
  @js.native
  open class XHRConnection protected ()
    extends typingsJapgolly.angularHttp.publicApiMod.XHRConnection {
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
  
  /* note: abstract class */ @JSImport("@angular/http", "XSRFStrategy")
  @js.native
  open class XSRFStrategy ()
    extends typingsJapgolly.angularHttp.publicApiMod.XSRFStrategy
  
  inline def ɵangularPackagesHttpHttpA(): typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.CookieXSRFStrategy = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_http_http_a")().asInstanceOf[typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.CookieXSRFStrategy]
  
  inline def ɵangularPackagesHttpHttpB(
    xhrBackend: typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.XHRBackend,
    requestOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
  ): typingsJapgolly.angularHttp.srcHttpMod.Http = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_http_http_b")(xhrBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularHttp.srcHttpMod.Http]
  
  inline def ɵangularPackagesHttpHttpC(
    jsonpBackend: typingsJapgolly.angularHttp.srcBackendsJsonpBackendMod.JSONPBackend,
    requestOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
  ): typingsJapgolly.angularHttp.srcHttpMod.Jsonp = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_http_http_c")(jsonpBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.angularHttp.srcHttpMod.Jsonp]
  
  @JSImport("@angular/http", "\u0275angular_packages_http_http_e")
  @js.native
  open class ɵangularPackagesHttpHttpE () extends BrowserJsonp
  
  /* note: abstract class */ @JSImport("@angular/http", "\u0275angular_packages_http_http_f")
  @js.native
  open class ɵangularPackagesHttpHttpF () extends Body
}
