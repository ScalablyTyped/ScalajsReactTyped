package typingsJapgolly.atAngularCommon.httpHttpMod

import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/http/http", "ɵangular_packages_common_http_http_h")
@js.native
class ɵangular_packages_common_http_http_h protected () extends HttpInterceptor {
  def this(tokenService: HttpXsrfTokenExtractor, headerName: String) = this()
  var headerName: js.Any = js.native
  var tokenService: js.Any = js.native
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  /* CompleteClass */
  override def intercept(req: HttpRequest[_], next: HttpHandler): Observable[HttpEvent[_]] = js.native
}

