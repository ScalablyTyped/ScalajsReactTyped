package typingsJapgolly.materialCheckbox.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialSelectionControl.mod.MDCSelectionControlState
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCCheckboxAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterAnimationEndHandler(handler: EventListener): Unit
  def deregisterChangeHandler(handler: EventListener): Unit
  def forceLayout(): Unit
  def getNativeControl(): MDCSelectionControlState
  def isAttachedToDOM(): Boolean
  def registerAnimationEndHandler(handler: EventListener): Unit
  def registerChangeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeNativeControlAttr(attr: String): Unit
  def setNativeControlAttr(attr: String, value: String): Unit
}

object MDCCheckboxAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterAnimationEndHandler: EventListener => Callback,
    deregisterChangeHandler: EventListener => Callback,
    forceLayout: Callback,
    getNativeControl: CallbackTo[MDCSelectionControlState],
    isAttachedToDOM: CallbackTo[Boolean],
    registerAnimationEndHandler: EventListener => Callback,
    registerChangeHandler: EventListener => Callback,
    removeClass: String => Callback,
    removeNativeControlAttr: String => Callback,
    setNativeControlAttr: (String, String) => Callback
  ): MDCCheckboxAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterAnimationEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterAnimationEndHandler(t0).runNow()))
    __obj.updateDynamic("deregisterChangeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterChangeHandler(t0).runNow()))
    __obj.updateDynamic("forceLayout")(forceLayout.toJsFn)
    __obj.updateDynamic("getNativeControl")(getNativeControl.toJsFn)
    __obj.updateDynamic("isAttachedToDOM")(isAttachedToDOM.toJsFn)
    __obj.updateDynamic("registerAnimationEndHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerAnimationEndHandler(t0).runNow()))
    __obj.updateDynamic("registerChangeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerChangeHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("removeNativeControlAttr")(js.Any.fromFunction1((t0: java.lang.String) => removeNativeControlAttr(t0).runNow()))
    __obj.updateDynamic("setNativeControlAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setNativeControlAttr(t0, t1).runNow()))
    __obj.asInstanceOf[MDCCheckboxAdapter]
  }
}

