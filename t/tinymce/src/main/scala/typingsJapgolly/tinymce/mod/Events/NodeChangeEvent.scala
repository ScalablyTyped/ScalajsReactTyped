package typingsJapgolly.tinymce.mod.Events

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChangeEvent extends Event {
  var element: Node
  var parents: js.Array[Node]
  var selectionChange: Boolean
}

object NodeChangeEvent {
  @scala.inline
  def apply(
    element: Node,
    isDefaultPrevented: CallbackTo[Boolean],
    isImmediatePropagationStopped: CallbackTo[Boolean],
    isPropagationStopped: CallbackTo[Boolean],
    parents: js.Array[Node],
    preventDefault: Callback,
    selectionChange: Boolean,
    stopImmediatePropagation: Callback,
    stopPropagation: Callback,
    target: String,
    `type`: String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], selectionChange = selectionChange.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped.toJsFn)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped.toJsFn)
    __obj.updateDynamic("preventDefault")(preventDefault.toJsFn)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation.toJsFn)
    __obj.updateDynamic("stopPropagation")(stopPropagation.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeChangeEvent]
  }
}

