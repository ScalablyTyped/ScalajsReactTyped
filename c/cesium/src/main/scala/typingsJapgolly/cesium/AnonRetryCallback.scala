package typingsJapgolly.cesium

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.Request
import typingsJapgolly.cesium.mod.DefaultProxy
import typingsJapgolly.cesium.mod.Resource
import typingsJapgolly.cesium.mod.Resource.RetryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRetryCallback extends js.Object {
  var callbackParameterName: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object AnonRetryCallback {
  @scala.inline
  def apply(
    url: String,
    callbackParameterName: String = null,
    headers: js.Any = null,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    retryAttempts: Int | Double = null,
    retryCallback: (/* resource */ Resource, /* error */ js.Error) => Callback = null,
    templateValues: js.Any = null
  ): AnonRetryCallback = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (callbackParameterName != null) __obj.updateDynamic("callbackParameterName")(callbackParameterName.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2((t0: /* resource */ typingsJapgolly.cesium.mod.Resource, t1: /* error */ js.Error) => retryCallback(t0, t1).runNow()))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRetryCallback]
  }
}

