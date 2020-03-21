package typingsJapgolly.devextreme.mod.DevExpress

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxEvent extends event {
  /** The DOM element within the current event propagation stage. */
  var currentTarget: Element
  /** Data passed to the event handler. */
  var data: js.Any
  /** The DOM element to which the currently-called event handler was attached. */
  var delegateTarget: Element
  /** The DOM element that initiated the event. */
  var target: Element
  /** Checks if the preventDefault() method was called on this event object. */
  def isDefaultPrevented(): Boolean
  /** Checks if the stopImmediatePropagation() method was called on this event object. */
  def isImmediatePropagationStopped(): Boolean
  /** Checks if the stopPropagation() method was called on this event object. */
  def isPropagationStopped(): Boolean
  /** Prevents the event's default action from triggering. */
  def preventDefault(): Unit
  /** Stops the event's propagation up the DOM tree, preventing the rest of the handlers from being executed. */
  def stopImmediatePropagation(): Unit
  /** Stops the event's propagation up the DOM tree, keeping parent handlers unnotified of the event. */
  def stopPropagation(): Unit
}

object dxEvent {
  @scala.inline
  def apply(
    currentTarget: Element,
    data: js.Any,
    delegateTarget: Element,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: Element
  ): dxEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], delegateTarget = delegateTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.asInstanceOf[dxEvent]
  }
}

