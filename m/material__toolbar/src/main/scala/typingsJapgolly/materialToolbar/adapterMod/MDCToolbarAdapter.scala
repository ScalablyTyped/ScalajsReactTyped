package typingsJapgolly.materialToolbar.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialToolbar.AnonFlexibleExpansionRatio
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCToolbarAdapter extends js.Object {
  def addClass(className: String): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterScrollHandler(handler: EventListener): Unit
  def getFirstRowElementOffsetHeight(): Double
  def getOffsetHeight(): Double
  def getViewportScrollY(): Double
  def getViewportWidth(): Double
  def hasClass(className: String): Boolean
  def notifyChange(evtData: AnonFlexibleExpansionRatio): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerScrollHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setStyle(property: String, value: String): Unit
  def setStyleForFixedAdjustElement(property: String, value: String): Unit
  def setStyleForFlexibleRowElement(property: String, value: String): Unit
  def setStyleForTitleElement(property: String, value: String): Unit
}

object MDCToolbarAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterResizeHandler: EventListener => Callback,
    deregisterScrollHandler: EventListener => Callback,
    getFirstRowElementOffsetHeight: CallbackTo[Double],
    getOffsetHeight: CallbackTo[Double],
    getViewportScrollY: CallbackTo[Double],
    getViewportWidth: CallbackTo[Double],
    hasClass: String => CallbackTo[Boolean],
    notifyChange: AnonFlexibleExpansionRatio => Callback,
    registerResizeHandler: EventListener => Callback,
    registerScrollHandler: EventListener => Callback,
    removeClass: String => Callback,
    setStyle: (String, String) => Callback,
    setStyleForFixedAdjustElement: (String, String) => Callback,
    setStyleForFlexibleRowElement: (String, String) => Callback,
    setStyleForTitleElement: (String, String) => Callback
  ): MDCToolbarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterResizeHandler(t0).runNow()))
    __obj.updateDynamic("deregisterScrollHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterScrollHandler(t0).runNow()))
    __obj.updateDynamic("getFirstRowElementOffsetHeight")(getFirstRowElementOffsetHeight.toJsFn)
    __obj.updateDynamic("getOffsetHeight")(getOffsetHeight.toJsFn)
    __obj.updateDynamic("getViewportScrollY")(getViewportScrollY.toJsFn)
    __obj.updateDynamic("getViewportWidth")(getViewportWidth.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("notifyChange")(js.Any.fromFunction1((t0: typingsJapgolly.materialToolbar.AnonFlexibleExpansionRatio) => notifyChange(t0).runNow()))
    __obj.updateDynamic("registerResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerResizeHandler(t0).runNow()))
    __obj.updateDynamic("registerScrollHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerScrollHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyle(t0, t1).runNow()))
    __obj.updateDynamic("setStyleForFixedAdjustElement")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleForFixedAdjustElement(t0, t1).runNow()))
    __obj.updateDynamic("setStyleForFlexibleRowElement")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleForFlexibleRowElement(t0, t1).runNow()))
    __obj.updateDynamic("setStyleForTitleElement")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleForTitleElement(t0, t1).runNow()))
    __obj.asInstanceOf[MDCToolbarAdapter]
  }
}

