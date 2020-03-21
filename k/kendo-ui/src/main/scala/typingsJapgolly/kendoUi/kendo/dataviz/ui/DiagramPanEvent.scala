package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.diagram.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramPanEvent extends DiagramEvent {
  var pan: js.UndefOr[Point] = js.undefined
}

object DiagramPanEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    pan: Point = null
  ): DiagramPanEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (pan != null) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramPanEvent]
  }
}

