package typingsJapgolly.timezoneJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezoneJsOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* data */ String, Unit]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object TimezoneJsOptions {
  @scala.inline
  def apply(
    async: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ js.Error => Callback = null,
    success: /* data */ String => Callback = null,
    url: String = null
  ): TimezoneJsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.Error) => error(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* data */ java.lang.String) => success(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezoneJsOptions]
  }
}

