package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEventObject extends AbstractEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any
}

object LayoutEventObject {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    layout: js.Any,
    namespace: String,
    preventDefault: Callback,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: js.Any,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): LayoutEventObject = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutEventObject]
  }
}

