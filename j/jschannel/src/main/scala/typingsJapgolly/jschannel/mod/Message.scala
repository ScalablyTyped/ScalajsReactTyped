package typingsJapgolly.jschannel.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var error: js.UndefOr[js.Function2[/* error */ js.Any, /* message */ String, Unit]] = js.undefined
  var method: String
  var params: js.UndefOr[js.Any] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    method: String,
    error: (/* error */ js.Any, /* message */ String) => Callback = null,
    params: js.Any = null,
    success: /* result */ js.Any => Callback = null,
    timeout: Int | Double = null
  ): Message = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2((t0: /* error */ js.Any, t1: /* message */ java.lang.String) => error(t0, t1).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ js.Any) => success(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

