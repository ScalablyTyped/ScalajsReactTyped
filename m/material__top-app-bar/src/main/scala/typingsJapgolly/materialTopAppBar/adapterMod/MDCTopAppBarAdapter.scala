package typingsJapgolly.materialTopAppBar.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCTopAppBarAdapter extends js.Object {
  /**
    * Adds a class to the root Element.
    */
  def addClass(className: String): Unit
  /**
    * Deregisters an event handler on the navigation icon element for a given event.
    */
  def deregisterNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterScrollHandler(handler: EventListener): Unit
  /**
    * Gets the height of the top app bar.
    */
  def getTopAppBarHeight(): Double
  def getTotalActionItems(): Double
  def getViewportScrollY(): Double
  /**
    * Returns true if the root Element contains the given class.
    */
  def hasClass(className: String): Boolean
  /**
    * Emits an event when the navigation icon is clicked.
    */
  def notifyNavigationIconClicked(): Unit
  /**
    * Registers an event handler on the navigation icon element for a given event.
    */
  def registerNavigationIconInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerScrollHandler(handler: EventListener): Unit
  /**
    * Removes a class from the root Element.
    */
  def removeClass(className: String): Unit
  /**
    * Sets the specified inline style property on the root Element to the given value.
    */
  def setStyle(property: String, value: String): Unit
}

object MDCTopAppBarAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    deregisterNavigationIconInteractionHandler: (String, EventListener) => Callback,
    deregisterResizeHandler: EventListener => Callback,
    deregisterScrollHandler: EventListener => Callback,
    getTopAppBarHeight: CallbackTo[Double],
    getTotalActionItems: CallbackTo[Double],
    getViewportScrollY: CallbackTo[Double],
    hasClass: String => CallbackTo[Boolean],
    notifyNavigationIconClicked: Callback,
    registerNavigationIconInteractionHandler: (String, EventListener) => Callback,
    registerResizeHandler: EventListener => Callback,
    registerScrollHandler: EventListener => Callback,
    removeClass: String => Callback,
    setStyle: (String, String) => Callback
  ): MDCTopAppBarAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("deregisterNavigationIconInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterNavigationIconInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterResizeHandler(t0).runNow()))
    __obj.updateDynamic("deregisterScrollHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterScrollHandler(t0).runNow()))
    __obj.updateDynamic("getTopAppBarHeight")(getTopAppBarHeight.toJsFn)
    __obj.updateDynamic("getTotalActionItems")(getTotalActionItems.toJsFn)
    __obj.updateDynamic("getViewportScrollY")(getViewportScrollY.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("notifyNavigationIconClicked")(notifyNavigationIconClicked.toJsFn)
    __obj.updateDynamic("registerNavigationIconInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerNavigationIconInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerResizeHandler(t0).runNow()))
    __obj.updateDynamic("registerScrollHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerScrollHandler(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("setStyle")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyle(t0, t1).runNow()))
    __obj.asInstanceOf[MDCTopAppBarAdapter]
  }
}

