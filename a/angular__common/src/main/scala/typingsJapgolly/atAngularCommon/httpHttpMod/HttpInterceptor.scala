package typingsJapgolly.atAngularCommon.httpHttpMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rxjs.rxjsMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpInterceptor extends js.Object {
  /**
    * Identifies and handles a given HTTP request.
    * @param req The outgoing request object to handle.
    * @param next The next interceptor in the chain, or the backend
    * if no interceptors remain in the chain.
    * @returns An observable of the event stream.
    */
  def intercept(req: HttpRequest[_], next: HttpHandler): Observable[HttpEvent[_]]
}

object HttpInterceptor {
  @scala.inline
  def apply(intercept: (HttpRequest[js.Any], HttpHandler) => CallbackTo[Observable[HttpEvent[js.Any]]]): HttpInterceptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("intercept")(js.Any.fromFunction2((t0: typingsJapgolly.atAngularCommon.httpHttpMod.HttpRequest[js.Any], t1: typingsJapgolly.atAngularCommon.httpHttpMod.HttpHandler) => intercept(t0, t1).runNow()))
    __obj.asInstanceOf[HttpInterceptor]
  }
}

