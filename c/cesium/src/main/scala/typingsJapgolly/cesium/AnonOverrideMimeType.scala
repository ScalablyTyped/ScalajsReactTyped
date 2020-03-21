package typingsJapgolly.cesium

import japgolly.scalajs.react.Callback
import org.scalajs.dom.experimental.Request
import typingsJapgolly.cesium.mod.DefaultProxy
import typingsJapgolly.cesium.mod.Resource
import typingsJapgolly.cesium.mod.Resource.RetryCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverrideMimeType extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var overrideMimeType: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[Request] = js.undefined
  var responseType: js.UndefOr[String] = js.undefined
  var retryAttempts: js.UndefOr[Double] = js.undefined
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  var templateValues: js.UndefOr[js.Any] = js.undefined
  var url: String
}

object AnonOverrideMimeType {
  @scala.inline
  def apply(
    url: String,
    data: js.Any = null,
    headers: js.Any = null,
    overrideMimeType: String = null,
    proxy: DefaultProxy = null,
    queryParameters: js.Any = null,
    request: Request = null,
    responseType: String = null,
    retryAttempts: Int | Double = null,
    retryCallback: (/* resource */ Resource, /* error */ js.Error) => Callback = null,
    templateValues: js.Any = null
  ): AnonOverrideMimeType = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (retryAttempts != null) __obj.updateDynamic("retryAttempts")(retryAttempts.asInstanceOf[js.Any])
    if (retryCallback != null) __obj.updateDynamic("retryCallback")(js.Any.fromFunction2((t0: /* resource */ typingsJapgolly.cesium.mod.Resource, t1: /* error */ js.Error) => retryCallback(t0, t1).runNow()))
    if (templateValues != null) __obj.updateDynamic("templateValues")(templateValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverrideMimeType]
  }
}

