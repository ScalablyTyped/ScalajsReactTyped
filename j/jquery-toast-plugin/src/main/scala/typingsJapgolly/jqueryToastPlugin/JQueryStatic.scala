package typingsJapgolly.jqueryToastPlugin

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  def toast(options: toastOptions): Unit
}

object JQueryStatic {
  @scala.inline
  def apply(toast: toastOptions => Callback): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toast")(js.Any.fromFunction1((t0: typingsJapgolly.jqueryToastPlugin.toastOptions) => toast(t0).runNow()))
    __obj.asInstanceOf[JQueryStatic]
  }
}

