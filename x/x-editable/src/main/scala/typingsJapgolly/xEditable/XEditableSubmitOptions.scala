package typingsJapgolly.xEditable

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XEditableSubmitOptions extends js.Object {
  var ajaxOptions: js.UndefOr[js.Any] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var url: js.UndefOr[js.Any] = js.undefined
  def error(obj: js.Any): Unit
  def success(obj: js.Any, config: js.Any): Unit
}

object XEditableSubmitOptions {
  @scala.inline
  def apply(
    error: js.Any => Callback,
    success: (js.Any, js.Any) => Callback,
    ajaxOptions: js.Any = null,
    data: js.Any = null,
    url: js.Any = null
  ): XEditableSubmitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("success")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => success(t0, t1).runNow()))
    if (ajaxOptions != null) __obj.updateDynamic("ajaxOptions")(ajaxOptions.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[XEditableSubmitOptions]
  }
}

