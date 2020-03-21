package typingsJapgolly.materialChips.chipAdapterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.EventTarget
import typingsJapgolly.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MDCChipAdapter extends js.Object {
  def addClass(className: String): Unit
  def addClassToLeadingIcon(className: String): Unit
  /**
    * Deregisters an event listener on the root element for a given event.
    */
  def deregisterEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Deregisters an event listener on the trailing icon element for a given event.
    */
  def deregisterTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit
  /**
    * Returns true if target has className, false otherwise.
    */
  def eventTargetHasClass(target: EventTarget, className: String): Boolean
  /**
    * Returns the computed property value of the given style property on the root element.
    */
  def getComputedStyleValue(propertyName: String): String
  def hasClass(className: String): Boolean
  /**
    * Emits a custom "MDCChip:interaction" event denoting the chip has been
    * interacted with (typically on click or keydown).
    */
  def notifyInteraction(): Unit
  /**
    * Emits a custom event "MDCChip:removal" denoting the chip will be removed.
    */
  def notifyRemoval(): Unit
  /**
    * Emits a custom "MDCChip:trailingIconInteraction" event denoting the trailing icon has been
    * interacted with (typically on click or keydown).
    */
  def notifyTrailingIconInteraction(): Unit
  /**
    * Registers an event listener on the root element for a given event.
    */
  def registerEventHandler(evtType: String, handler: EventListener): Unit
  /**
    * Registers an event listener on the trailing icon element for a given event.
    */
  def registerTrailingIconInteractionHandler(evtType: String, handler: EventListener): Unit
  def removeClass(className: String): Unit
  def removeClassFromLeadingIcon(className: String): Unit
  /**
    * Sets the property value of the given style property on the root element.
    */
  def setStyleProperty(propertyName: String, value: String): Unit
}

object MDCChipAdapter {
  @scala.inline
  def apply(
    addClass: String => Callback,
    addClassToLeadingIcon: String => Callback,
    deregisterEventHandler: (String, EventListener) => Callback,
    deregisterTrailingIconInteractionHandler: (String, EventListener) => Callback,
    eventTargetHasClass: (EventTarget, String) => CallbackTo[Boolean],
    getComputedStyleValue: String => CallbackTo[String],
    hasClass: String => CallbackTo[Boolean],
    notifyInteraction: Callback,
    notifyRemoval: Callback,
    notifyTrailingIconInteraction: Callback,
    registerEventHandler: (String, EventListener) => Callback,
    registerTrailingIconInteractionHandler: (String, EventListener) => Callback,
    removeClass: String => Callback,
    removeClassFromLeadingIcon: String => Callback,
    setStyleProperty: (String, String) => Callback
  ): MDCChipAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addClass")(js.Any.fromFunction1((t0: java.lang.String) => addClass(t0).runNow()))
    __obj.updateDynamic("addClassToLeadingIcon")(js.Any.fromFunction1((t0: java.lang.String) => addClassToLeadingIcon(t0).runNow()))
    __obj.updateDynamic("deregisterEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("deregisterTrailingIconInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => deregisterTrailingIconInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("eventTargetHasClass")(js.Any.fromFunction2((t0: org.scalajs.dom.raw.EventTarget, t1: java.lang.String) => eventTargetHasClass(t0, t1).runNow()))
    __obj.updateDynamic("getComputedStyleValue")(js.Any.fromFunction1((t0: java.lang.String) => getComputedStyleValue(t0).runNow()))
    __obj.updateDynamic("hasClass")(js.Any.fromFunction1((t0: java.lang.String) => hasClass(t0).runNow()))
    __obj.updateDynamic("notifyInteraction")(notifyInteraction.toJsFn)
    __obj.updateDynamic("notifyRemoval")(notifyRemoval.toJsFn)
    __obj.updateDynamic("notifyTrailingIconInteraction")(notifyTrailingIconInteraction.toJsFn)
    __obj.updateDynamic("registerEventHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerEventHandler(t0, t1).runNow()))
    __obj.updateDynamic("registerTrailingIconInteractionHandler")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.std.EventListener) => registerTrailingIconInteractionHandler(t0, t1).runNow()))
    __obj.updateDynamic("removeClass")(js.Any.fromFunction1((t0: java.lang.String) => removeClass(t0).runNow()))
    __obj.updateDynamic("removeClassFromLeadingIcon")(js.Any.fromFunction1((t0: java.lang.String) => removeClassFromLeadingIcon(t0).runNow()))
    __obj.updateDynamic("setStyleProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setStyleProperty(t0, t1).runNow()))
    __obj.asInstanceOf[MDCChipAdapter]
  }
}

