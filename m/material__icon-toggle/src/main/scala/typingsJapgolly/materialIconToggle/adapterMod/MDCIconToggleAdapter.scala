package typingsJapgolly.materialIconToggle.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCIconToggleAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def getAttr(name: String): String
  def getTabIndex(): Double
  def notifyChange(evtData: IconToggleEvent): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def rmAttr(name: String): Unit
  def setAttr(name: String, value: String): Unit
  def setTabIndex(tabIndex: Double): Unit
  def setText(text: String): Unit
}

object MDCIconToggleAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    getAttr: String => CallbackTo[String],
    getTabIndex: CallbackTo[Double],
    notifyChange: IconToggleEvent => Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    rmAttr: String => Callback,
    setAttr: (String, String) => Callback,
    setTabIndex: Double => Callback,
    setText: String => Callback
  ): MDCIconToggleAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("getAttr")(js.Any.fromFunction1((t0: java.lang.String) => getAttr(t0).runNow()))
    __obj.updateDynamic("getTabIndex")(getTabIndex.toJsFn)
    __obj.updateDynamic("notifyChange")(js.Any.fromFunction1((t0: typingsJapgolly.materialIconToggle.adapterMod.IconToggleEvent) => notifyChange(t0).runNow()))
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("rmAttr")(js.Any.fromFunction1((t0: java.lang.String) => rmAttr(t0).runNow()))
    __obj.updateDynamic("setAttr")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttr(t0, t1).runNow()))
    __obj.updateDynamic("setTabIndex")(js.Any.fromFunction1((t0: scala.Double) => setTabIndex(t0).runNow()))
    __obj.updateDynamic("setText")(js.Any.fromFunction1((t0: java.lang.String) => setText(t0).runNow()))
    __obj.asInstanceOf[MDCIconToggleAdapter]
  }
}

