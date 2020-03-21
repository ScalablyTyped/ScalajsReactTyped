package typingsJapgolly.hardSourceWebpackPlugin.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hardSourceWebpackPlugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): Unit
}

object hardSourceWebpackPlugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => Callback): hardSourceWebpackPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => apply(t0).runNow()))
    __obj.asInstanceOf[hardSourceWebpackPlugin]
  }
}

