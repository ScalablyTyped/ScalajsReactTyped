package typingsJapgolly.angularHttp

import typingsJapgolly.angularHttp.baseRequestOptionsMod.RequestOptions
import typingsJapgolly.angularHttp.httpMod.Http
import typingsJapgolly.angularHttp.httpMod.Jsonp
import typingsJapgolly.angularHttp.jsonpBackendMod.JSONPBackend
import typingsJapgolly.angularHttp.xhrBackendMod.CookieXSRFStrategy
import typingsJapgolly.angularHttp.xhrBackendMod.XHRBackend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/src/http_module", JSImport.Namespace)
@js.native
object httpModuleMod extends js.Object {
  @js.native
  class HttpModule () extends js.Object
  
  @js.native
  class JsonpModule () extends js.Object
  
  @JSName("_createDefaultCookieXSRFStrategy")
  def createDefaultCookieXSRFStrategy(): CookieXSRFStrategy = js.native
  def httpFactory(xhrBackend: XHRBackend, requestOptions: RequestOptions): Http = js.native
  def jsonpFactory(jsonpBackend: JSONPBackend, requestOptions: RequestOptions): Jsonp = js.native
}

