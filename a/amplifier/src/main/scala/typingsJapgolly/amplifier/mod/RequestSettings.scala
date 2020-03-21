package typingsJapgolly.amplifier.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSettings extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var resourceId: String
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object RequestSettings {
  @scala.inline
  def apply(
    resourceId: String,
    data: js.Any = null,
    error: /* repeated */ js.Any => Callback = null,
    success: /* repeated */ js.Any => Callback = null
  ): RequestSettings = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[RequestSettings]
  }
}

