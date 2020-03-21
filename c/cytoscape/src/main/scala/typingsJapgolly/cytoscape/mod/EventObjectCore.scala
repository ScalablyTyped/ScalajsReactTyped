package typingsJapgolly.cytoscape.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.cytoscape.mod.AbstractEventObject because Already inherited
- typingsJapgolly.cytoscape.mod.LayoutEventObject because var conflicts: cy, namespace, target, timeStamp, `type`. Inlined layout */ trait EventObjectCore extends InputEventObject {
  /**
    * layout : indicates the corresponding layout that triggered the event
    * (useful if running multiple layouts simultaneously)
    */
  var layout: js.Any
  @JSName("target")
  var target_EventObjectCore: Core
}

object EventObjectCore {
  @scala.inline
  def apply(
    cy: Core,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    layout: js.Any,
    namespace: String,
    originalEvent: MouseEvent,
    position: Position,
    preventDefault: Callback,
    renderedPosition: Position,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: Core,
    timeStamp: Double,
    `type`: UserInputDeviceEventName | UserInputDeviceEventNameExt
  ): EventObjectCore = {
    val __obj = js.Dynamic.literal(cy = cy.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], renderedPosition = renderedPosition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObjectCore]
  }
}

