package typingsJapgolly.materialTabs.tabAdapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def getOffsetLeft(): Double
  def getOffsetWidth(): Double
  def notifySelected(): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
}

object MDCTabAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    getOffsetLeft: CallbackTo[Double],
    getOffsetWidth: CallbackTo[Double],
    notifySelected: Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback
  ): MDCTabAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("getOffsetLeft")(getOffsetLeft.toJsFn)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth.toJsFn)
    __obj.updateDynamic("notifySelected")(notifySelected.toJsFn)
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.asInstanceOf[MDCTabAdapter]
  }
}

