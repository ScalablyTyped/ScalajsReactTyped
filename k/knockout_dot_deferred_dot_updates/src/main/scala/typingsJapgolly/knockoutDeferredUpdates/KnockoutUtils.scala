package typingsJapgolly.knockoutDeferredUpdates

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utils
trait KnockoutUtils extends js.Object {
  def objectForEach(obj: js.Any, action: js.Function): Unit
  def objectMap(source: js.Any, mapping: js.Function): js.Any
}

object KnockoutUtils {
  @scala.inline
  def apply(
    objectForEach: (js.Any, js.Function) => Callback,
    objectMap: (js.Any, js.Function) => CallbackTo[js.Any]
  ): KnockoutUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("objectForEach")(js.Any.fromFunction2((t0: js.Any, t1: js.Function) => objectForEach(t0, t1).runNow()))
    __obj.updateDynamic("objectMap")(js.Any.fromFunction2((t0: js.Any, t1: js.Function) => objectMap(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutUtils]
  }
}

