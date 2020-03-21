package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#events/event-object
  */
trait AbstractEventObject extends js.Object {
  /** a reference to the corresponding core Core */
  var cy: Core
  /** the event namespace string (e.g. "foo" for "foo.tap") */
  var namespace: String
  /** indicates the element or core that first caused the event */
  var target: js.Any
  /** Unix epoch time of event in milliseconds */
  var timeStamp: Double
  /** the event type string (e.g. "tap") */
  var `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  def isDefaultPrevented(): Boolean
  def isImmediatePropagationStopped(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Unit
  def stopImmediatePropagation(): Unit
  def stopPropagation(): Unit
}

object AbstractEventObject {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    namespace: String,
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): AbstractEventObject = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractEventObject]
  }
}

