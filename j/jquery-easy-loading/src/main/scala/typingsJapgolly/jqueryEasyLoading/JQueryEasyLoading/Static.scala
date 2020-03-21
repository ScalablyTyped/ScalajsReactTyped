package typingsJapgolly.jqueryEasyLoading.JQueryEasyLoading

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  /**
    * Extend the Loading plugin default settings with the user options
    * Use it as `$.Loading.setDefaults({ ... })`
    *
    * @param {Object} options Custom options to override the plugin defaults
    */
  def setDefaults(options: Options): Unit
}

object Static {
  @scala.inline
  def apply(setDefaults: Options => Callback): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setDefaults")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryEasyLoading.JQueryEasyLoading.Options) => setDefaults(t0).runNow()))
    __obj.asInstanceOf[Static]
  }
}

