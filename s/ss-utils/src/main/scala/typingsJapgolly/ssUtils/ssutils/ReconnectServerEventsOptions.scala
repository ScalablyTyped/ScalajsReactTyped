package typingsJapgolly.ssUtils.ssutils

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReconnectServerEventsOptions extends js.Object {
  var errorArgs: js.UndefOr[js.Array[_]] = js.undefined
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ReconnectServerEventsOptions {
  @scala.inline
  def apply(
    errorArgs: js.Array[_] = null,
    onerror: /* repeated */ js.Any => Callback = null,
    onmessage: /* repeated */ js.Any => Callback = null,
    url: String = null
  ): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    if (errorArgs != null) __obj.updateDynamic("errorArgs")(errorArgs.asInstanceOf[js.Any])
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onerror(t0).runNow()))
    if (onmessage != null) __obj.updateDynamic("onmessage")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onmessage(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
}

