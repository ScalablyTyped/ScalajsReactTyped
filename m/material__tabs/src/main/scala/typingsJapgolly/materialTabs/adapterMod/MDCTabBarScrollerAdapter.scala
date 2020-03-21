package typingsJapgolly.materialTabs.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarScrollerAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassToBackIndicator(className: String): Unit
  def addClassToForwardIndicator(className: String): Unit
  def deregisterBackIndicatorClickHandler(handler: EventListener): Unit
  def deregisterCapturedInteractionHandler(evt: String, handler: EventListener): Unit
  def deregisterForwardIndicatorClickHandler(handler: EventListener): Unit
  def deregisterWindowResizeHandler(handler: EventListener): Unit
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  def getComputedLeftForTabAtIndex(): Double
  def getComputedWidthForTabAtIndex(): Double
  def getNumberOfTabs(): Double
  def getOffsetLeftForEventTarget(target: EventTarget): Double
  def getOffsetWidthForEventTarget(target: EventTarget): Double
  def getOffsetWidthForScrollFrame(): Double
  def getOffsetWidthForTabBar(): Double
  def getScrollLeftForScrollFrame(): Double
  def isRTL(): Boolean
  def registerBackIndicatorClickHandler(handler: EventListener): Unit
  def registerCapturedInteractionHandler(evt: String, handler: EventListener): Unit
  def registerForwardIndicatorClickHandler(handler: EventListener): Unit
  def registerWindowResizeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeClassFromBackIndicator(className: String): Unit
  def removeClassFromForwardIndicator(className: String): Unit
  def setScrollLeftForScrollFrame(scrollLeftAmount: Double): Unit
  def setTransformStyleForTabBar(value: String): Unit
}

object MDCTabBarScrollerAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    addClassToBackIndicator: String => Callback,
    addClassToForwardIndicator: String => Callback,
    deregisterBackIndicatorClickHandler: EventListener => Callback,
    deregisterCapturedInteractionHandler: (String, EventListener) => Callback,
    deregisterForwardIndicatorClickHandler: EventListener => Callback,
    deregisterWindowResizeHandler: EventListener => Callback,
    eventTargetHasClass: (EventTarget, String) => CallbackTo[Boolean],
    getComputedLeftForTabAtIndex: CallbackTo[Double],
    getComputedWidthForTabAtIndex: CallbackTo[Double],
    getNumberOfTabs: CallbackTo[Double],
    getOffsetLeftForEventTarget: EventTarget => CallbackTo[Double],
    getOffsetWidthForEventTarget: EventTarget => CallbackTo[Double],
    getOffsetWidthForScrollFrame: CallbackTo[Double],
    getOffsetWidthForTabBar: CallbackTo[Double],
    getScrollLeftForScrollFrame: CallbackTo[Double],
    isRTL: CallbackTo[Boolean],
    registerBackIndicatorClickHandler: EventListener => Callback,
    registerCapturedInteractionHandler: (String, EventListener) => Callback,
    registerForwardIndicatorClickHandler: EventListener => Callback,
    registerWindowResizeHandler: EventListener => Callback,
    removeClass: String => Callback,
    removeClassFromBackIndicator: String => Callback,
    removeClassFromForwardIndicator: String => Callback,
    setScrollLeftForScrollFrame: Double => Callback,
    setTransformStyleForTabBar: String => Callback
  ): MDCTabBarScrollerAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("addClassToBackIndicator")(js.Any.fromFunction1((t0: java.lang.String) => addClassToBackIndicator(t0).runNow()))
    __obj.updateDynamic("addClassToForwardIndicator")(js.Any.fromFunction1((t0: java.lang.String) => addClassToForwardIndicator(t0).runNow()))
    __obj.updateDynamic("deregisterBackIndicatorClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterBackIndicatorClickHandler(t0).runNow()))
    __obj.updateDynamic("deregisterCapturedInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterCapturedInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterForwardIndicatorClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterForwardIndicatorClickHandler(t0).runNow()))
    __obj.updateDynamic("deregisterWindowResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterWindowResizeHandler(t0).runNow()))
    __obj.updateDynamic("eventTargetHasClass")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.EventTarget, t1: java.lang.String) => eventTargetHasClass(t0, t1).runNow()))
    __obj.updateDynamic("getComputedLeftForTabAtIndex")(getComputedLeftForTabAtIndex.toJsFn)
    __obj.updateDynamic("getComputedWidthForTabAtIndex")(getComputedWidthForTabAtIndex.toJsFn)
    __obj.updateDynamic("getNumberOfTabs")(getNumberOfTabs.toJsFn)
    __obj.updateDynamic("getOffsetLeftForEventTarget")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.EventTarget) => getOffsetLeftForEventTarget(t0).runNow()))
    __obj.updateDynamic("getOffsetWidthForEventTarget")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.EventTarget) => getOffsetWidthForEventTarget(t0).runNow()))
    __obj.updateDynamic("getOffsetWidthForScrollFrame")(getOffsetWidthForScrollFrame.toJsFn)
    __obj.updateDynamic("getOffsetWidthForTabBar")(getOffsetWidthForTabBar.toJsFn)
    __obj.updateDynamic("getScrollLeftForScrollFrame")(getScrollLeftForScrollFrame.toJsFn)
    __obj.updateDynamic("isRTL")(isRTL.toJsFn)
    __obj.updateDynamic("registerBackIndicatorClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerBackIndicatorClickHandler(t0).runNow()))
    __obj.updateDynamic("registerCapturedInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerCapturedInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerForwardIndicatorClickHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerForwardIndicatorClickHandler(t0).runNow()))
    __obj.updateDynamic("registerWindowResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerWindowResizeHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("removeClassFromBackIndicator")(js.Any.fromFunction1((t0: java.lang.String) => removeClassFromBackIndicator(t0).runNow()))
    __obj.updateDynamic("removeClassFromForwardIndicator")(js.Any.fromFunction1((t0: java.lang.String) => removeClassFromForwardIndicator(t0).runNow()))
    __obj.updateDynamic("setScrollLeftForScrollFrame")(js.Any.fromFunction1((t0: scala.Double) => setScrollLeftForScrollFrame(t0).runNow()))
    __obj.updateDynamic("setTransformStyleForTabBar")(js.Any.fromFunction1((t0: java.lang.String) => setTransformStyleForTabBar(t0).runNow()))
    __obj.asInstanceOf[MDCTabBarScrollerAdapter]
  }
}

