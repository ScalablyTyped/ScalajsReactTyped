package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragstartEvent extends TreeViewEvent {
  var sourceNode: js.UndefOr[Element] = js.undefined
}

object TreeViewDragstartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    sourceNode: Element = null
  ): TreeViewDragstartEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragstartEvent]
  }
}

