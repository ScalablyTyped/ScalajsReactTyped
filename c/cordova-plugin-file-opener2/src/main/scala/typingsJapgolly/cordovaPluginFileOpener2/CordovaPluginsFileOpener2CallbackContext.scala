package typingsJapgolly.cordovaPluginFileOpener2

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPluginsFileOpener2CallbackContext extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ CordovaPluginsFileOpener2Result, Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CordovaPluginsFileOpener2CallbackContext {
  @scala.inline
  def apply(
    error: /* error */ CordovaPluginsFileOpener2Result => Callback = null,
    success: js.UndefOr[Callback] = js.undefined
  ): CordovaPluginsFileOpener2CallbackContext = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.cordovaPluginFileOpener2.CordovaPluginsFileOpener2Result) => error(t0).runNow()))
    success.foreach(p => __obj.updateDynamic("success")(p.toJsFn))
    __obj.asInstanceOf[CordovaPluginsFileOpener2CallbackContext]
  }
}

