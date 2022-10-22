package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.srcBackendsJsonpBackendMod.JSONPBackend
import typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.CookieXSRFStrategy
import typingsJapgolly.angularHttp.srcBackendsXhrBackendMod.XHRBackend
import typingsJapgolly.angularHttp.srcBaseRequestOptionsMod.RequestOptions
import typingsJapgolly.angularHttp.srcHttpMod.Http
import typingsJapgolly.angularHttp.srcHttpMod.Jsonp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHttpModuleMod {
  
  @JSImport("@angular/http/src/http_module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/http/src/http_module", "HttpModule")
  @js.native
  open class HttpModule () extends StObject
  
  @JSImport("@angular/http/src/http_module", "JsonpModule")
  @js.native
  open class JsonpModule () extends StObject
  
  inline def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = ^.asInstanceOf[js.Dynamic].applyDynamic("_createDefaultCookieXSRFStrategy")().asInstanceOf[CookieXSRFStrategy]
  
  inline def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = (^.asInstanceOf[js.Dynamic].applyDynamic("httpFactory")(xhrBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[Http]
  
  inline def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = (^.asInstanceOf[js.Dynamic].applyDynamic("jsonpFactory")(jsonpBackend.asInstanceOf[js.Any], requestOptions.asInstanceOf[js.Any])).asInstanceOf[Jsonp]
}
