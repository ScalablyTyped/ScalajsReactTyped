package typingsJapgolly.angularHttp

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCore.mod.Version
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.RequestOptionsArgs
import typingsJapgolly.angularHttp.srcInterfacesMod.ResponseOptionsArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("@angular/http/src", "BaseRequestOptions")
  @js.native
  open class BaseRequestOptions ()
    extends typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.BaseRequestOptions
  
  @JSImport("@angular/http/src", "BaseResponseOptions")
  @js.native
  open class BaseResponseOptions ()
    extends typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.BaseResponseOptions
  
  @JSImport("@angular/http/src", "BrowserXhr")
  @js.native
  open class BrowserXhr ()
    extends typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr
  
  /* note: abstract class */ @JSImport("@angular/http/src", "Connection")
  @js.native
  open class Connection ()
    extends typingsJapgolly.angularHttp.srcInterfacesMod.Connection
  
  /* note: abstract class */ @JSImport("@angular/http/src", "ConnectionBackend")
  @js.native
  open class ConnectionBackend ()
    extends typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend
  
  @JSImport("@angular/http/src", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy ()
    extends typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.CookieXSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
  }
  
  @JSImport("@angular/http/src", "Headers")
  @js.native
  open class Headers ()
    extends typingsJapgolly.angularHttp.srcHeadersMod.Headers {
    def this(headers: StringDictionary[Any]) = this()
    def this(headers: typingsJapgolly.angularHttp.srcHeadersMod.Headers) = this()
  }
  /* static members */
  object Headers {
    
    @JSImport("@angular/http/src", "Headers")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a new Headers instance from the given DOMString of Response Headers
      */
    inline def fromResponseHeaderString(headersString: String): typingsJapgolly.angularHttp.srcHeadersMod.Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("fromResponseHeaderString")(headersString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.angularHttp.srcHeadersMod.Headers]
  }
  
  @JSImport("@angular/http/src", "Http")
  @js.native
  open class Http protected ()
    extends typingsJapgolly.angularHttp.srcHttpMod.Http {
    def this(
      _backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      _defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "HttpModule")
  @js.native
  open class HttpModule ()
    extends typingsJapgolly.angularHttp.srcHttpModuleMod.HttpModule
  
  @JSImport("@angular/http/src", "JSONPBackend")
  @js.native
  open class JSONPBackend ()
    extends typingsJapgolly.angularHttp.srcBackendsJsonpBackendMod.JSONPBackend
  
  @JSImport("@angular/http/src", "JSONPConnection")
  @js.native
  open class JSONPConnection ()
    extends typingsJapgolly.angularHttp.srcBackendsJsonpBackendMod.JSONPConnection
  
  @JSImport("@angular/http/src", "Jsonp")
  @js.native
  open class Jsonp protected ()
    extends typingsJapgolly.angularHttp.srcHttpMod.Jsonp {
    def this(
      backend: typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend,
      defaultOptions: typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
    ) = this()
  }
  
  @JSImport("@angular/http/src", "JsonpModule")
  @js.native
  open class JsonpModule ()
    extends typingsJapgolly.angularHttp.srcHttpModuleMod.JsonpModule
  
  @JSImport("@angular/http/src", "QueryEncoder")
  @js.native
  open class QueryEncoder ()
    extends typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder
  
  @JSImport("@angular/http/src", "ReadyState")
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
  
  @JSImport("@angular/http/src", "Request")
  @js.native
  open class Request protected ()
    extends typingsJapgolly.angularHttp.srcStaticRequestMod.Request {
    def this(requestOptions: RequestArgs) = this()
  }
  
  @JSImport("@angular/http/src", "RequestMethod")
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
  
  @JSImport("@angular/http/src", "RequestOptions")
  @js.native
  open class RequestOptions ()
    extends typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions {
    def this(opts: RequestOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "Response")
  @js.native
  open class Response protected ()
    extends typingsJapgolly.angularHttp.srcStaticResponseMod.Response {
    def this(responseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseContentType")
  @js.native
  object ResponseContentType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType & Double] = js.native
    
    /* 2 */ val ArrayBuffer: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.ArrayBuffer & Double = js.native
    
    /* 3 */ val Blob: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Blob & Double = js.native
    
    /* 1 */ val Json: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Json & Double = js.native
    
    /* 0 */ val Text: typingsJapgolly.angularHttp.srcEnumsMod.ResponseContentType.Text & Double = js.native
  }
  
  @JSImport("@angular/http/src", "ResponseOptions")
  @js.native
  open class ResponseOptions ()
    extends typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions {
    def this(opts: ResponseOptionsArgs) = this()
  }
  
  @JSImport("@angular/http/src", "ResponseType")
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
  
  @JSImport("@angular/http/src", "URLSearchParams")
  @js.native
  open class URLSearchParams ()
    extends typingsJapgolly.angularHttp.srcUrlSearchParamsMod.URLSearchParams {
    def this(rawParams: String) = this()
    def this(rawParams: String, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
    def this(rawParams: Unit, queryEncoder: typingsJapgolly.angularHttp.srcUrlSearchParamsMod.QueryEncoder) = this()
  }
  
  @JSImport("@angular/http/src", "VERSION")
  @js.native
  val VERSION: Version = js.native
  
  @JSImport("@angular/http/src", "XHRBackend")
  @js.native
  open class XHRBackend protected ()
    extends typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.XHRBackend {
    def this(
      _browserXHR: typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr,
      _baseResponseOptions: typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions,
      _xsrfStrategy: typingsJapgolly.angularHttp.srcInterfacesMod.XSRFStrategy
    ) = this()
  }
  
  @JSImport("@angular/http/src", "XHRConnection")
  @js.native
  open class XHRConnection protected ()
    extends typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.XHRConnection {
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
  
  /* note: abstract class */ @JSImport("@angular/http/src", "XSRFStrategy")
  @js.native
  open class XSRFStrategy ()
    extends typingsJapgolly.angularHttp.srcInterfacesMod.XSRFStrategy
}
