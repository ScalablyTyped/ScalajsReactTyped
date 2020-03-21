package typingsJapgolly.materialSelect.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSelectAdapter extends js.Object {
  def activateBottomLine(): Unit
  def addClass(className: String): Unit
  def deactivateBottomLine(): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def floatLabel(value: Boolean): Unit
  def getSelectedIndex(): Double
  def getValue(): String
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setDisabled(disabled: Boolean): Unit
  def setSelectedIndex(index: Double): Unit
  def setValue(value: String): Unit
}

object MDCSelectAdapter {
  @scala.inline
  def apply(
    activateBottomLine: Callback,
    addClass: String => Callback,
    deactivateBottomLine: Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    floatLabel: Boolean => Callback,
    getSelectedIndex: CallbackTo[Double],
    getValue: CallbackTo[String],
    registerInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    setDisabled: Boolean => Callback,
    setSelectedIndex: Double => Callback,
    setValue: String => Callback
  ): MDCSelectAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activateBottomLine")(activateBottomLine.toJsFn)
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deactivateBottomLine")(deactivateBottomLine.toJsFn)
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("floatLabel")(js.Any.fromFunction1((t0: scala.Boolean) => floatLabel(t0).runNow()))
    __obj.updateDynamic("getSelectedIndex")(getSelectedIndex.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setDisabled")(js.Any.fromFunction1((t0: scala.Boolean) => setDisabled(t0).runNow()))
    __obj.updateDynamic("setSelectedIndex")(js.Any.fromFunction1((t0: scala.Double) => setSelectedIndex(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: java.lang.String) => setValue(t0).runNow()))
    __obj.asInstanceOf[MDCSelectAdapter]
  }
}

