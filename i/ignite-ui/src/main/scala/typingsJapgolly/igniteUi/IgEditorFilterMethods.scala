package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgEditorFilterMethods extends js.Object {
  def destroy(): Unit
  def exitEditMode(): Unit
  def hasInvalidMessage(): Unit
  def remove(): Unit
  def setFocus(delay: js.Object, toggle: js.Object): Unit
  def validator(): Unit
}

object IgEditorFilterMethods {
  @scala.inline
  def apply(
    destroy: Callback,
    exitEditMode: Callback,
    hasInvalidMessage: Callback,
    remove: Callback,
    setFocus: (js.Object, js.Object) => Callback,
    validator: Callback
  ): IgEditorFilterMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("exitEditMode")(exitEditMode.toJsFn)
    __obj.updateDynamic("hasInvalidMessage")(hasInvalidMessage.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.updateDynamic("setFocus")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => setFocus(t0, t1).runNow()))
    __obj.updateDynamic("validator")(validator.toJsFn)
    __obj.asInstanceOf[IgEditorFilterMethods]
  }
}

