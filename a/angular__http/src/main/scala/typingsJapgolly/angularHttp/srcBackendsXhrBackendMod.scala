package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.srcBackendsBrowserXhrMod.BrowserXhr
import typingsJapgolly.angularHttp.srcBaseResponseOptionsMod.ResponseOptions
import typingsJapgolly.angularHttp.srcInterfacesMod.Connection
import typingsJapgolly.angularHttp.srcInterfacesMod.ConnectionBackend
import typingsJapgolly.angularHttp.srcInterfacesMod.XSRFStrategy
import typingsJapgolly.angularHttp.srcStaticRequestMod.Request
import typingsJapgolly.angularHttp.srcStaticResponseMod.Response
import typingsJapgolly.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBackendsXhrBackendMod {
  
  @JSImport("@angular/http/src/backends/xhr_backend", "CookieXSRFStrategy")
  @js.native
  open class CookieXSRFStrategy () extends XSRFStrategy {
    def this(_cookieName: String) = this()
    def this(_cookieName: String, _headerName: String) = this()
    def this(_cookieName: Unit, _headerName: String) = this()
    
    /* private */ var _cookieName: Any = js.native
    
    /* private */ var _headerName: Any = js.native
  }
  
  @JSImport("@angular/http/src/backends/xhr_backend", "XHRBackend")
  @js.native
  open class XHRBackend protected () extends ConnectionBackend {
    def this(_browserXHR: BrowserXhr, _baseResponseOptions: ResponseOptions, _xsrfStrategy: XSRFStrategy) = this()
    
    /* private */ var _baseResponseOptions: Any = js.native
    
    /* private */ var _browserXHR: Any = js.native
    
    /* private */ var _xsrfStrategy: Any = js.native
    
    def createConnection(request: Request): XHRConnection = js.native
  }
  
  @JSImport("@angular/http/src/backends/xhr_backend", "XHRConnection")
  @js.native
  open class XHRConnection protected () extends Connection {
    def this(req: Request, browserXHR: BrowserXhr) = this()
    def this(req: Request, browserXHR: BrowserXhr, baseResponseOptions: ResponseOptions) = this()
    
    /**
      * Response {@link EventEmitter} which emits a single {@link Response} value on load event of
      * `XMLHttpRequest`.
      */
    @JSName("response")
    var response_XHRConnection: Observable_[Response] = js.native
    
    def setDetectedContentType(req: Any, _xhr: Any): Unit = js.native
  }
}
