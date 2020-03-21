package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputEventObject extends AbstractEventObject {
  /** originalEvent : the original user input device event object */
  var originalEvent: MouseEvent
  /** position : indicates the model position of the event */
  var position: Position
  /** renderedPosition : indicates the rendered position of the event */
  var renderedPosition: Position
}

object InputEventObject {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    namespace: String,
    originalEvent: MouseEvent,
    position: Position,
    preventDefault: Callback,
    renderedPosition: Position,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): InputEventObject = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputEventObject]
  }
}

