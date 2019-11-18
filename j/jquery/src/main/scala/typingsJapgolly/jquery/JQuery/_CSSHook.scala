package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CSSHook[TElement] extends js.Object {
  def get(elem: TElement, computed: js.Any, extra: js.Any): js.Any
  def set(elem: TElement, value: js.Any): Unit
}

object _CSSHook {
  @scala.inline
  def apply[TElement](get: (TElement, js.Any, js.Any) => CallbackTo[js.Any], set: (TElement, js.Any) => Callback): _CSSHook[TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction3((t0: TElement, t1: js.Any, t2: js.Any) => get(t0, t1, t2).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TElement, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[_CSSHook[TElement]]
  }
}

