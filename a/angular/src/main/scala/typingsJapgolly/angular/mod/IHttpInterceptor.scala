package typingsJapgolly.angular.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHttpInterceptor extends js.Object {
  var request: js.UndefOr[
    js.Function1[/* config */ IRequestConfig, IRequestConfig | IPromise[IRequestConfig]]
  ] = js.undefined
  var requestError: js.UndefOr[js.Function1[/* rejection */ js.Any, IRequestConfig | IPromise[IRequestConfig]]] = js.undefined
  var response: js.UndefOr[
    js.Function1[/* response */ IHttpResponse[_], IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.undefined
  var responseError: js.UndefOr[
    js.Function1[/* rejection */ js.Any, IPromise[IHttpResponse[_]] | IHttpResponse[_]]
  ] = js.undefined
}

object IHttpInterceptor {
  @scala.inline
  def apply(
    request: /* config */ IRequestConfig => CallbackTo[IRequestConfig | IPromise[IRequestConfig]] = null,
    requestError: /* rejection */ js.Any => CallbackTo[IRequestConfig | IPromise[IRequestConfig]] = null,
    response: /* response */ IHttpResponse[js.Any] => CallbackTo[IPromise[IHttpResponse[js.Any]] | IHttpResponse[js.Any]] = null,
    responseError: /* rejection */ js.Any => CallbackTo[IPromise[IHttpResponse[js.Any]] | IHttpResponse[js.Any]] = null
  ): IHttpInterceptor = {
    val __obj = js.Dynamic.literal()
    if (request != null) __obj.updateDynamic("request")(js.Any.fromFunction1((t0: /* config */ typingsJapgolly.angular.mod.IRequestConfig) => request(t0).runNow()))
    if (requestError != null) __obj.updateDynamic("requestError")(js.Any.fromFunction1((t0: /* rejection */ js.Any) => requestError(t0).runNow()))
    if (response != null) __obj.updateDynamic("response")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.angular.mod.IHttpResponse[js.Any]) => response(t0).runNow()))
    if (responseError != null) __obj.updateDynamic("responseError")(js.Any.fromFunction1((t0: /* rejection */ js.Any) => responseError(t0).runNow()))
    __obj.asInstanceOf[IHttpInterceptor]
  }
}

