package typingsJapgolly.axiosTokenInterceptor.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Interfaces
trait InterceptorOptions extends js.Object {
  var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.undefined
  var token: js.UndefOr[String] = js.undefined
}

object InterceptorOptions {
  @scala.inline
  def apply(
    getToken: js.UndefOr[CallbackTo[String | js.Promise[String]]] = js.undefined,
    header: String = null,
    headerFormatter: /* token */ String => CallbackTo[String] = null,
    token: String = null
  ): InterceptorOptions = {
    val __obj = js.Dynamic.literal()
    getToken.foreach(p => __obj.updateDynamic("getToken")(p.toJsFn))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (headerFormatter != null) __obj.updateDynamic("headerFormatter")(js.Any.fromFunction1((t0: /* token */ java.lang.String) => headerFormatter(t0).runNow()))
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterceptorOptions]
  }
}

