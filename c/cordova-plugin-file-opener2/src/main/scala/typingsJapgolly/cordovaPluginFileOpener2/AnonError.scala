package typingsJapgolly.cordovaPluginFileOpener2

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* result */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
}

object AnonError {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => Callback = null,
    success: /* result */ CordovaPluginsFileOpener2Result => Callback = null
  ): AnonError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.cordovaPluginFileOpener2.CordovaPluginsFileOpener2Result) => error(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.cordovaPluginFileOpener2.CordovaPluginsFileOpener2Result) => success(t0).runNow()))
    __obj.asInstanceOf[AnonError]
  }
}

