package typingsJapgolly.atAngularCore.atAngularCoreMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ɵDirectRenderer extends js.Object {
  def appendChild(node: js.Any, parent: js.Any): Unit
  def insertBefore(node: js.Any, refNode: js.Any): Unit
  def nextSibling(node: js.Any): js.Any
  def parentElement(node: js.Any): js.Any
  def remove(node: js.Any): Unit
}

object ɵDirectRenderer {
  @scala.inline
  def apply(
    appendChild: (js.Any, js.Any) => Callback,
    insertBefore: (js.Any, js.Any) => Callback,
    nextSibling: js.Any => CallbackTo[js.Any],
    parentElement: js.Any => CallbackTo[js.Any],
    remove: js.Any => Callback
  ): ɵDirectRenderer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appendChild")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => appendChild(t0, t1).runNow()))
    __obj.updateDynamic("insertBefore")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => insertBefore(t0, t1).runNow()))
    __obj.updateDynamic("nextSibling")(js.Any.fromFunction1((t0: js.Any) => nextSibling(t0).runNow()))
    __obj.updateDynamic("parentElement")(js.Any.fromFunction1((t0: js.Any) => parentElement(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Any) => remove(t0).runNow()))
    __obj.asInstanceOf[ɵDirectRenderer]
  }
}

