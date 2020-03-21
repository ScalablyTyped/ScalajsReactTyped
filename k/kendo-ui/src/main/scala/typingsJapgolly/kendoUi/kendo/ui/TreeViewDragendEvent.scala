package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewDragendEvent extends TreeViewEvent {
  var destinationNode: js.UndefOr[Element] = js.undefined
  var dropPosition: js.UndefOr[String] = js.undefined
  var sourceNode: js.UndefOr[Element] = js.undefined
}

object TreeViewDragendEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: TreeView,
    destinationNode: Element = null,
    dropPosition: String = null,
    sourceNode: Element = null
  ): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (destinationNode != null) __obj.updateDynamic("destinationNode")(destinationNode.asInstanceOf[js.Any])
    if (dropPosition != null) __obj.updateDynamic("dropPosition")(dropPosition.asInstanceOf[js.Any])
    if (sourceNode != null) __obj.updateDynamic("sourceNode")(sourceNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
}

