package typingsJapgolly.stylefire.customStyleHandlersMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stylefire.typesMod.ResolvedState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomStyleHandler extends js.Object {
  var get: js.UndefOr[String] = js.undefined
  def set(output: ResolvedState, value: js.Any): Unit
}

object CustomStyleHandler {
  @scala.inline
  def apply(set: (ResolvedState, js.Any) => Callback, get: String = null): CustomStyleHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.stylefire.typesMod.ResolvedState, t1: js.Any) => set(t0, t1).runNow()))
    if (get != null) __obj.updateDynamic("get")(get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomStyleHandler]
  }
}

