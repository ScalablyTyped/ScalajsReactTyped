package typingsJapgolly.materialTabs.tabBarAdapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.materialTabs.AnonActiveTabIndex
import typingsJapgolly.materialTabs.materialTabsBooleans.`true`
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTabBarAdapter extends js.Object {
  def addClass(className: String): Unit
  def bindOnMDCTabSelectedEvent(): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def getComputedLeftForTabAtIndex(index: Double): Double
  def getComputedWidthForTabAtIndex(index: Double): Double
  def getNumberOfTabs(): Double
  def getOffsetWidth(): Double
  def getOffsetWidthForIndicator(): Double
  def isDefaultPreventedOnClickForTabAtIndex(index: Double): Boolean
  def isTabActiveAtIndex(index: Double): Boolean
  def measureTabAtIndex(index: Double): Unit
  def notifyChange(evtData: AnonActiveTabIndex): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def removeClass(className: String): Unit
  def setPreventDefaultOnClickForTabAtIndex(index: Double, preventDefaultOnClick: Boolean): Unit
  def setStyleForIndicator(propertyName: String, value: String): Unit
  @JSName("setTabActiveAtIndex")
  def setTabActiveAtIndex_true(index: Double, isActive: `true`): Unit
  def unbindOnMDCTabSelectedEvent(): Unit
}

object MDCTabBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    bindOnMDCTabSelectedEvent: Callback,
    deregisterResizeHandler: EventListener => Callback,
    getComputedLeftForTabAtIndex: Double => CallbackTo[Double],
    getComputedWidthForTabAtIndex: Double => CallbackTo[Double],
    getNumberOfTabs: CallbackTo[Double],
    getOffsetWidth: CallbackTo[Double],
    getOffsetWidthForIndicator: CallbackTo[Double],
    isDefaultPreventedOnClickForTabAtIndex: Double => CallbackTo[Boolean],
    isTabActiveAtIndex: Double => CallbackTo[Boolean],
    measureTabAtIndex: Double => Callback,
    notifyChange: AnonActiveTabIndex => Callback,
    registerResizeHandler: EventListener => Callback,
    removeClass: String => Callback,
    setPreventDefaultOnClickForTabAtIndex: (Double, Boolean) => Callback,
    setStyleForIndicator: (String, String) => Callback,
    setTabActiveAtIndex: (Double, `true`) => Callback,
    unbindOnMDCTabSelectedEvent: Callback
  ): MDCTabBarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("bindOnMDCTabSelectedEvent")(bindOnMDCTabSelectedEvent.toJsFn)
    __obj.updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterResizeHandler(t0).runNow()))
    __obj.updateDynamic("getComputedLeftForTabAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getComputedLeftForTabAtIndex(t0).runNow()))
    __obj.updateDynamic("getComputedWidthForTabAtIndex")(js.Any.fromFunction1((t0: scala.Double) => getComputedWidthForTabAtIndex(t0).runNow()))
    __obj.updateDynamic("getNumberOfTabs")(getNumberOfTabs.toJsFn)
    __obj.updateDynamic("getOffsetWidth")(getOffsetWidth.toJsFn)
    __obj.updateDynamic("getOffsetWidthForIndicator")(getOffsetWidthForIndicator.toJsFn)
    __obj.updateDynamic("isDefaultPreventedOnClickForTabAtIndex")(js.Any.fromFunction1((t0: scala.Double) => isDefaultPreventedOnClickForTabAtIndex(t0).runNow()))
    __obj.updateDynamic("isTabActiveAtIndex")(js.Any.fromFunction1((t0: scala.Double) => isTabActiveAtIndex(t0).runNow()))
    __obj.updateDynamic("measureTabAtIndex")(js.Any.fromFunction1((t0: scala.Double) => measureTabAtIndex(t0).runNow()))
    __obj.updateDynamic("notifyChange")(js.Any.fromFunction1((t0: typingsJapgolly.materialTabs.AnonActiveTabIndex) => notifyChange(t0).runNow()))
    __obj.updateDynamic("registerResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerResizeHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setPreventDefaultOnClickForTabAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Boolean) => setPreventDefaultOnClickForTabAtIndex(t0, t1).runNow()))
    __obj.updateDynamic("setStyleForIndicator")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleForIndicator(t0, t1).runNow()))
    __obj.updateDynamic("setTabActiveAtIndex")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.materialTabs.materialTabsBooleans.`true`) => setTabActiveAtIndex(t0, t1).runNow()))
    __obj.updateDynamic("unbindOnMDCTabSelectedEvent")(unbindOnMDCTabSelectedEvent.toJsFn)
    __obj.asInstanceOf[MDCTabBarAdapter]
  }
}

