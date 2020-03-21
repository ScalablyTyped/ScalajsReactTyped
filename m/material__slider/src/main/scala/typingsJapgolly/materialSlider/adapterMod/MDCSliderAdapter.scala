package typingsJapgolly.materialSlider.adapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.ClientRect
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCSliderAdapter extends js.Object {
  def addClass(className: String): Unit
  def appendTrackMarkers(numMarkers: Double): Unit
  def computeBoundingRect(): ClientRect
  def deregisterBodyInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterInteractionHandler(`type`: String, handler: EventListener): Unit
  def deregisterResizeHandler(handler: EventListener): Unit
  def deregisterThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit
  def getAttribute(name: String): String | Null
  def getTabIndex(): Double
  def hasClass(className: String): Boolean
  def isRTL(): Boolean
  def notifyChange(): Unit
  def notifyInput(): Unit
  def registerBodyInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerInteractionHandler(`type`: String, handler: EventListener): Unit
  def registerResizeHandler(handler: EventListener): Unit
  def registerThumbContainerInteractionHandler(`type`: String, handler: EventListener): Unit
  def removeAttribute(name: String): Unit
  def removeClass(className: String): Unit
  def removeTrackMarkers(): Unit
  def setAttribute(name: String, value: String): Unit
  def setLastTrackMarkersStyleProperty(propertyName: String, value: String): Unit
  def setMarkerValue(value: Double): Unit
  def setThumbContainerStyleProperty(propertyName: String, value: String): Unit
  def setTrackStyleProperty(propertyName: String, value: String): Unit
}

object MDCSliderAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    appendTrackMarkers: Double => Callback,
    computeBoundingRect: CallbackTo[ClientRect],
    deregisterBodyInteractionHandler: (String, EventListener) => Callback,
    deregisterInteractionHandler: (String, EventListener) => Callback,
    deregisterResizeHandler: EventListener => Callback,
    deregisterThumbContainerInteractionHandler: (String, EventListener) => Callback,
    getAttribute: String => CallbackTo[String | Null],
    getTabIndex: CallbackTo[Double],
    hasClass: String => CallbackTo[Boolean],
    isRTL: CallbackTo[Boolean],
    notifyChange: Callback,
    notifyInput: Callback,
    registerBodyInteractionHandler: (String, EventListener) => Callback,
    registerInteractionHandler: (String, EventListener) => Callback,
    registerResizeHandler: EventListener => Callback,
    registerThumbContainerInteractionHandler: (String, EventListener) => Callback,
    removeAttribute: String => Callback,
    removeClass: String => Callback,
    removeTrackMarkers: Callback,
    setAttribute: (String, String) => Callback,
    setLastTrackMarkersStyleProperty: (String, String) => Callback,
    setMarkerValue: Double => Callback,
    setThumbContainerStyleProperty: (String, String) => Callback,
    setTrackStyleProperty: (String, String) => Callback
  ): MDCSliderAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("appendTrackMarkers")(js.Any.fromFunction1((t0: scala.Double) => appendTrackMarkers(t0).runNow()))
    __obj.updateDynamic("computeBoundingRect")(computeBoundingRect.toJsFn)
    __obj.updateDynamic("deregisterBodyInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterBodyInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => deregisterResizeHandler(t0).runNow()))
    __obj.updateDynamic("deregisterThumbContainerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterThumbContainerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("getAttribute")(js.Any.fromFunction1((t0: java.lang.String) => getAttribute(t0).runNow()))
    __obj.updateDynamic("getTabIndex")(getTabIndex.toJsFn)
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("isRTL")(isRTL.toJsFn)
    __obj.updateDynamic("notifyChange")(notifyChange.toJsFn)
    __obj.updateDynamic("notifyInput")(notifyInput.toJsFn)
    __obj.updateDynamic("registerBodyInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerBodyInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerResizeHandler")(js.Any.fromFunction1((t0: typingsJapgolly.std.EventListener) => registerResizeHandler(t0).runNow()))
    __obj.updateDynamic("registerThumbContainerInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerThumbContainerInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeAttribute")(js.Any.fromFunction1((t0: java.lang.String) => removeAttribute(t0).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("removeTrackMarkers")(removeTrackMarkers.toJsFn)
    __obj.updateDynamic("setAttribute")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAttribute(t0, t1).runNow()))
    __obj.updateDynamic("setLastTrackMarkersStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setLastTrackMarkersStyleProperty(t0, t1).runNow()))
    __obj.updateDynamic("setMarkerValue")(js.Any.fromFunction1((t0: scala.Double) => setMarkerValue(t0).runNow()))
    __obj.updateDynamic("setThumbContainerStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setThumbContainerStyleProperty(t0, t1).runNow()))
    __obj.updateDynamic("setTrackStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setTrackStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[MDCSliderAdapter]
  }
}

